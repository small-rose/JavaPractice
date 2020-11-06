package com.xiaocai.netty.nio;

import java.nio.ByteBuffer;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： BufferUnderflowException  异常模拟。
 *  要求在操作 buffer 时不同的类型读的顺序要符合 写的顺序
 * @author: 张小菜
 * @date: 2020/10/17 17:13
 * @version: v1.0
 */
public class NIOByteBufferPutGet {
    public static void main(String[] args) {

        // 创建buffer
        ByteBuffer buffer = ByteBuffer.allocate(64);

        buffer.putInt(100);
        buffer.putLong(900L);
        buffer.putChar('小');
        buffer.putShort((short) 4);

        buffer.flip();

        buffer.getShort();
        buffer.getInt();
        buffer.getLong();
        buffer.getLong();
    }
}
