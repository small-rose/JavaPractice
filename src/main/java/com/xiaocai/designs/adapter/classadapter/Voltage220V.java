package com.xiaocai.designs.adapter.classadapter;

/**
 * @description: TODO 功能角色说明：  被适配的类
 * TODO 描述：   -- 类适配器模式--被适配的类,可以输出220V 电压
 * @author: 张小菜
 * @date: 2020/11/20 22:54
 * @version: v1.0
 */
public class Voltage220V {

    private final int voltage = 220;

    public int output220V(){
        System.out.println("输入电压："+voltage +"V");
        return voltage;
    }
}
