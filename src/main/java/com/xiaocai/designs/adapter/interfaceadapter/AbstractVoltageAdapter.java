package com.xiaocai.designs.adapter.interfaceadapter;

/**
 * @description: TODO 功能角色说明： --- 接口适配器模式/ 也叫默认适配器模式。  这是核心类
 * TODO 描述：      使用一个抽象类先完成接口全部方法的空实现，在使用时，利用匿名内部类的方式去选择性的实现某个方法。
 * @author: 张小菜
 * @date: 2020/11/20 23:41
 * @version: v1.0
 */
public abstract class AbstractVoltageAdapter implements VoltageInterface{


    @Override
    public int voltage5V() {
        return 0;
    }

    @Override
    public int voltage12V() {
        return 0;
    }

    @Override
    public int voltage36V() {
        return 0;
    }

    @Override
    public int voltage220V() {
        return 0;
    }
}
