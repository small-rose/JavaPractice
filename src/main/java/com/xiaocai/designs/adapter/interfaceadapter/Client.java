package com.xiaocai.designs.adapter.interfaceadapter;

/**
 * @description: TODO 功能角色说明： --- 接口适配器模式/ 也叫默认适配器模式。
 * TODO 描述：  调用演示，调用端可以使用匿名内部类的方式去使用
 * @author: 张小菜
 * @date: 2020/11/20 23:43
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {


        AbstractVoltageAdapter adapter = new AbstractVoltageAdapter() {
            public int voltage5V() {
                System.out.println("这里适配5V的电压");
                return 5;
            }
        };
        adapter.voltage5V();
    }
}
