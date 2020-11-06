package com.xiaocai.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  模拟 OutOfMemoryError: GC overhead limit exceeded 异常
 *      参数设置：-Xms10m -Xmx10m -XX:+PrintGCDetails
 * @author: 张小菜
 * @date: 2020/11/4 15:34
 * @version: v1.0
 */
public class OverHeadLimitExecededDemo {

    public static void main(String[] args) {
        String string = "i";
        int i=1 ;
        List<String> stringList = new ArrayList<>();
        try {
            while (true){

                stringList.add(String.valueOf(i));
                i++;
            }
        }catch (Throwable e){
            System.out.println("i"+i);
            e.printStackTrace();
        }


    }
}
