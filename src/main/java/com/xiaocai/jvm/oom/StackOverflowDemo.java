package com.xiaocai.jvm.oom;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 模拟 java.lang.StackOverflowError 错误
 * @author: 张小菜
 * @date: 2020/11/4 23:59oom
 * @version: v1.0
 */
public class StackOverflowDemo {

    public void test(){

        try {
            TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new StackOverflowDemo().test();

        HashMap hashMap = new HashMap();
    }
}
