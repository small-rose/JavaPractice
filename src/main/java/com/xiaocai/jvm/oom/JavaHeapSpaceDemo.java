package com.xiaocai.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  模拟 OutOfMemoryError: Java heap space 异常
 *      参数设置: -Xms10m -Xmx10m -XX:+PrintGCDetails
 * @author: 张小菜
 * @date: 2020/11/3 23:14
 * @version: v1.0
 */
public class JavaHeapSpaceDemo {

    byte[] bytes = new byte[100 * 1024];//创建1m大小的字节数组

    public static void main(String[] args) {

        List<JavaHeapSpaceDemo> list = new ArrayList<>();

        while (true){
            JavaHeapSpaceDemo jhdemo = new JavaHeapSpaceDemo();
            System.out.println(jhdemo);
            list.add(jhdemo);
        }

    }
}
