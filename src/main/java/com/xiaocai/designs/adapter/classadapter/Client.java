package com.xiaocai.designs.adapter.classadapter;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  -- 类适配器调用：
 *      优势： 可以重写，适配度灵活
 *      不足： 类继承带来的耦合度
 * @author: 张小菜
 * @date: 2020/11/20 23:02
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
