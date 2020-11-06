package com.xiaocai.netty.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @description: TODO 功能角色说明：MappedByteBuffer 练习测试
 * TODO 描述： MappedByteBuffer 可以放文件直接在内存（堆外内存）修改，操作系统不需要拷贝
 * @author: 张小菜
 * @date: 2020/10/17 17:24
 * @version: v1.0
 */
public class NIOMappedByteBuffer {

    public static void main(String[] args) throws Exception {

        RandomAccessFile randomAccessFile = new RandomAccessFile("D:\\filesTest\\r1.txt", "rw");

        FileChannel channel = randomAccessFile.getChannel();
        /**
         * 参数1 读写模式：FileChannel.MapMode.READ_WRITE
         * 参数2 position ：0 - 可以直接修改的起始位置
         * 参数3 运行修改的大小：5 - 是映射要内存的大小（不是索引位置）即 r1.txt 的多少个字节映射到内存
         *  表示可以直接修改的范围就是 0 - 5
         *  MappedByteBuffer实际类型是 DirecByteBuffer
         */
        MappedByteBuffer mapedBuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 5);


        mapedBuffer.put(0, (byte) 'H');
        mapedBuffer.put(1, (byte) 'E');
        mapedBuffer.put(2, (byte) 'L');
        mapedBuffer.put(3, (byte) 'L');
        mapedBuffer.put(4, (byte) 'O');
        //mapedBuffer.put(5, (byte) 9); //IndexOutOfBoundsException

        randomAccessFile.close();
        System.out.println("修改成功~");

    }
}
