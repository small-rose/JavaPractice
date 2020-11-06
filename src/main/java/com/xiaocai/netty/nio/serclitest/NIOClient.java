package com.xiaocai.netty.nio.serclitest;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/17 21:45
 * @version: v1.0
 */
public class NIOClient {

    public static void main(String[] args) throws Exception{

        // 开启网络服务通道
        SocketChannel socketChannel = SocketChannel.open();

        // 设置非阻塞
        socketChannel.configureBlocking(false);

        // 创建连接 ip 和 端口
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8888);

        // 连接服务器
        if (! socketChannel.connect(inetSocketAddress)){

            while (!socketChannel.finishConnect()){
                System.out.println("连接需要时间，客户端不会阻塞，可以继续工作~");
            }
        }

        // 连接成功就可以发送数据
        String string = "Hello world ! 我在学 Netty ~" ;

        // 创建 缓冲区
        ByteBuffer byteBuffer = ByteBuffer.wrap(string.getBytes());

        // 发送数据，将 buffer 写入 channel
        socketChannel.write(byteBuffer);

        System.in.read();

    }
}
