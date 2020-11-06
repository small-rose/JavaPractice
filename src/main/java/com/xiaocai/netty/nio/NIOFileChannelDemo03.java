package com.xiaocai.netty.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 使用 NIO 的 Butter 进行文件读写，将文件 1.txt 的 内容 写到 2.txt
 *   中文 - 3个字节   回车换行 - 2个字节
 * @author: 张小菜
 * @date: 2020/10/17 16:40
 * @version: v1.0
 */
public class NIOFileChannelDemo03 {

    // 此处抛出异常了，没有 try
    public static void main(String[] args) throws IOException {

        //创建一个输入流
        FileInputStream fileInputStream = new FileInputStream("D:\\filesTest\\1.txt");
        //通过 FileInputStream 获取 对应的 FileChannel，fileChannel的实际类型是 FileChannelImpl
        FileChannel fileChannel01 = fileInputStream.getChannel();

        //创建一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\filesTest\\2.txt");

        //通过 FileOutputStream 获取 对应的 FileChannel，fileChannel的实际类型是 FileChannelImpl
        FileChannel fileChannel02 = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        while (true){

            // 需要执行 clear 。 因为 position 和 limit 相等了,需要重置标志位
            //  position = 0;
            //  limit = capacity;
            //  mark = -1;
            byteBuffer.clear();

            int read = fileChannel01.read(byteBuffer);

            if(read == -1){
                break;
            }
            // position 发生了改变，已经改变 进行写操作的是实话，需要进行转换 将 limit = position;  position = 0 ;
            byteBuffer.flip();

            // 写入到新文件 2.txt
            fileChannel02.write(byteBuffer);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
