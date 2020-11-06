package com.xiaocai.netty.nio;

import java.nio.ByteBuffer;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： ReadOnlyBufferException , 只读 Buffer 不能写
 * @author: 张小菜
 * @date: 2020/10/17 17:17
 * @version: v1.0
 */
public class NIOReadOnlyBuffer {

    public static void main(String[] args) {

        //TODO 创建Buffer
        ByteBuffer buffer = ByteBuffer.allocate(64);

        //存放数据 put
        for (int i = 0; i < 64; i++) {
            buffer.put((byte) i);
        }

        //buffer 读写转换
        buffer.flip();

        ByteBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();
        System.out.println(readOnlyBuffer.getClass());

        // 读取 buffer get
        while (readOnlyBuffer.hasRemaining()){
            System.out.println(readOnlyBuffer.get());
        }

        readOnlyBuffer.put((byte) 1); // ReadOnlyBufferException
    }
}
