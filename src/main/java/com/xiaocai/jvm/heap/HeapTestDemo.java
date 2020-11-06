package com.xiaocai.jvm.heap;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/4 21:40
 * @version: v1.0
 */
public class HeapTestDemo {


    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();

        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("maxMemory: "+maxMemory / (double) 1024 /1024 +"Mb");
        System.out.println("totalMemory: "+totalMemory / (double) 1024 /1024 +"Mb");
        System.out.println("freeMemory: "+freeMemory / (double) 1024 /1024 +"Mb");
        test();

    }

    public static  void test(){
        int a =1 ;
        a++;
    }
}
