package com.xiaocai.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/27 11:36
 * @version: v1.0
 */
public class BaseTypeTest01 {


    public static void main(String[] args) {

        String ab = "abc";
        System.out.println(ab.hashCode());
        ab = "cde";
        System.out.println(ab.hashCode());

        changeTest(ab);
        System.out.println(ab);





    }

    private static void changeTest(String ab) {
        ab = "123";
    }
}
