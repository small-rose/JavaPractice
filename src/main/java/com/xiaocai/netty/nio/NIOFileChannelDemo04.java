package com.xiaocai.netty.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/17 17:05
 * @version: v1.0
 */
public class NIOFileChannelDemo04 {

    public static void main(String[] args) throws  Exception {

        //创建输入、输出流
        FileInputStream fileInputStream = new FileInputStream("D:\\filesTest\\a1.png");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\filesTest\\a2.jpg");

        // 获取通道
        FileChannel sourceFch = fileInputStream.getChannel();
        FileChannel destFch = fileOutputStream.getChannel();

        // 使用  transferFrom 完成拷贝即可
        destFch.transferFrom(sourceFch,0, sourceFch.size());

        // 关闭 通道 和 流
        sourceFch.close();
        destFch.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
