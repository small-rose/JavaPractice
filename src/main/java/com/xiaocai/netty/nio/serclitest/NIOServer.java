package com.xiaocai.netty.nio.serclitest;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/17 21:45
 * @version: v1.0
 */
public class NIOServer {
    private boolean wh;

    public static void main(String[] args) throws Exception{

        // 使用 ServerSocketChannel 获取 ServerSocketChannel对象
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 初始化一个监控的 socketChannel
        ServerSocketChannel socketChannel = serverSocketChannel.bind(new InetSocketAddress(8888));

        // 将  socketChannel 设置为非阻塞模式
        socketChannel.configureBlocking(false);

        // 获得一个 selector 对象
        Selector selector = Selector.open();

        // 向 selector 中注册 ACCEPT 连接事件
        socketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true){

            int select = selector.select(1000);
            if(select == 0 ){// select == 0 表示没有任何事件发生
                System.out.println("等待客户端连接，等了1秒~");
                continue;
            }

            // 1、 select > 0  表示获取到了相关 selectionKey ,即获取到了关注的事件
            // 2、 使用 selector.selectedKeys() 返回关注的事件集合
            // 3、 通过selectionKeys 反向获取通道
            Set<SelectionKey> selectionKeys = selector.selectedKeys();

            // 迭代 selectionKeys 依次处理关注的事件
            Iterator<SelectionKey> keyIterator = selectionKeys.iterator();

            while (keyIterator.hasNext()){
                // 获取到事件的 Key
                SelectionKey key = keyIterator.next();

                // 根据事件的不同分别处理
                // 如果是 OP_ACCEPT事件
                if(key.isAcceptable()){

                    // 如果有连接事件则处理连接：创建一个新的 SocketChannel
                    SocketChannel newSecketchl = serverSocketChannel.accept();
                    // 新的 连接也 是非阻塞的
                    newSecketchl.configureBlocking(false);
                    System.out.println("客户端连接成功，生成了一个新的 SocketChannel " + newSecketchl.hashCode());

                    // 将新的连接 注册到 selector  见她 read  事件，绑定缓冲区 Buffer
                    newSecketchl.register(selector,SelectionKey.OP_READ, ByteBuffer.allocate(1024));

                }

                // 如果是 OP_READ 事件
                if(key.isReadable()){

                    // 根据 key 反向获取 channel
                    SocketChannel channel = (SocketChannel) key.channel();
                    // 获取到c hannel 有关的 buffer
                    ByteBuffer buffer = (ByteBuffer) key.attachment();
                    // 读取通道内容写入缓冲区
                    channel.read(buffer);

                    System.out.println("来自客户端的消息：" + new String(buffer.array()));

                }

                // 千万要记得删除已经处理的事件
                keyIterator.remove();

            }

        }

    }
}
