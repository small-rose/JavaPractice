package com.xiaocai.jvm.oom;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：模拟 java.lang.OutOfMemoryError: Direct buffer memory 异常
 *        参数设置: -Xms10m -Xmx10m -XX:MaxDirectMemorySize=5m  -XX:+PrintGCDetails
 * @author: 张小菜
 * @date: 2020/11/4 16:04
 * @version: v1.0
 */
public class DirectBufferMemoryDemo {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("初始化配置最大直接内存："+ (sun.misc.VM.maxDirectMemory() /(double)1024/1024 )+ "mb");
        //TimeUnit.SECONDS.sleep(2);
        //ByteBuffer buffer = ByteBuffer.allocateDirect(7 * 1024 * 1024);
    }
}
