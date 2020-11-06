package com.xiaocai.netty.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @description: TODO 功能角色说明： 利用NIO 的 buffer 进行写文件
 * TODO 描述： NIO 写文件操作练习
 * @author: 张小菜
 * @date: 2020/10/17 16:10
 * @version: v1.0
 */
public class NIOFileChannelDemo01 {

    public static void main(String[] args) {

        String string = "hello world ! 世界你好！";

        try {
            //创建一个输出流
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\filesTest\\file01.txt");

            //通过 FileOutputStream 获取 对应的 FileChannel，fileChannel的实际类型是 FileChannelImpl
            FileChannel fileChannel = fileOutputStream.getChannel();

            // 创建一个缓冲区
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            // 将 string  放入缓冲区
            byteBuffer.put(string.getBytes());

            // 对 Buffer 进行flip 操作
            byteBuffer.flip();

            // 将 byteBuffer 数据写入到 fileChannel 中去
            fileChannel.write(byteBuffer);

            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
