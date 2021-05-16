package com.xiaocai.designs.adapter.objectadapter;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/20 23:17
 * @version: v1.0
 */
public class Voltage220V_Obj {

    private final int voltage = 220;

    public int output220V(){
        System.out.println("输入电压："+voltage +"V");
        return voltage;
    }
}
