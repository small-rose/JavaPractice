package com.xiaocai.netty.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @description: TODO 功能角色说明：利用NIO 的 buffer 进行读文件
 * TODO 描述：NIO Buffer 读文件操作练习
 * @author: 张小菜
 * @date: 2020/10/17 16:27
 * @version: v1.0
 */
public class NIOFileChannelDemo02 {

    public static void main(String[] args) {


        try {
            File file = new File("D:\\filesTest\\file01.txt");
            //创建一个输入流
            FileInputStream fileInputStream = new FileInputStream(file);

            //通过 fileInputStream 获取 对应的 FileChannel，fileChannel的实际类型是 FileChannelImpl
            FileChannel fileChannel = fileInputStream.getChannel();

            // 创建一个缓冲区
            ByteBuffer byteBuffer = ByteBuffer.allocate((int)file.length());


            // 将 通道数据 读入到 Bytebuffer 中去
            fileChannel.read(byteBuffer);

            // 将 字节 转 字符串
            System.out.println(new String(byteBuffer.array()));


            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
