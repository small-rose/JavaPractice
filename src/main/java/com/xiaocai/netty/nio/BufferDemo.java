package com.xiaocai.netty.nio;

import java.nio.IntBuffer;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： buffer 的使用
 * @author: 张小菜
 * @date: 2020/10/17 11:19
 * @version: v1.0
 */
public class BufferDemo {
    public static void main(String[] args) {

        //TODO 创建Buffer 大小为5 即可以存放 5 int
        IntBuffer intBuffer = IntBuffer.allocate(5);

        //存放数据 put
        for (int i = 0; i < 5; i++) {
            intBuffer.put( i*2);
        }

        //buffer 读写转换
        intBuffer.flip();

        // 读取 buffer get
        while (intBuffer.hasRemaining()){
            System.out.println(intBuffer.get());
        }
    }
}
