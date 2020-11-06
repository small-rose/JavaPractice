package com.xiaocai.netty.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

/**
 * @description: TODO 功能角色说明： 分散 聚合  使用练习
 * TODO 描述：到底
 *  Scattering  ： 分散 - 将数据写入到 buffer 时，可以采用 buffer 数组， 依次写入
 *  Gathering : 聚合 - 从 buffer 读取数据时，可以采用 buffer 数组 ，依次读取
 * @author: 张小菜
 * @date: 2020/10/17 11:18
 * @version: v1.0
 */
public class ScatterAndGatherTest {

    public static void main(String[] args) throws Exception{

        // 使用 ServerSocketChannel 和 ServerSocket 网络
        // 这里相当于服务端
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(7000);

        // 将 端口绑定到 ServerSocketChannel
        serverSocketChannel.socket().bind(inetSocketAddress);

        //创建 buffer 数组
        ByteBuffer[] byteBuffers = new ByteBuffer[2];
        byteBuffers[0] = ByteBuffer.allocate(5);
        byteBuffers[1] = ByteBuffer.allocate(3);

        // 等待客户端连接 - 使用 telnet 测试
        SocketChannel socketChannel = serverSocketChannel.accept();

        int messageLength = 8 ; //假设最多接收8个 字节

        // 循环读取
        while (true){

            int byteRead = 0 ;
            while (byteRead < messageLength){

                long l = socketChannel.read(byteBuffers);// 自动分散
                byteRead += l ; // 累计读取的季结束
                System.out.println("byteRead " + byteRead);

                // 使用打印六，查看buffer 的 position 和 limit
                Arrays.asList(byteBuffers).stream().map( (buffer) ->
                    "position=" + buffer.position() +", limit=" + buffer.limit()
                ).forEach(System.out::println);
            }

            Arrays.asList(byteBuffers).forEach(buffer -> buffer.flip());

            // 将数据读书显示到客户端
            long byteWrite = 0 ;

            while (byteWrite < messageLength){

                // 将数据写入buffer
                long w = socketChannel.write(byteBuffers);
                byteWrite += w ;
            }

            // 将所有的buffer 进行 clear
            Arrays.asList(byteBuffers).forEach(buffer -> buffer.clear());

            System.out.println("byteRead = " +byteRead+" ，byteWrite = " +byteWrite + ", length = "+messageLength);
        }

    }
}
