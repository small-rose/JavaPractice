package com.xiaocai.designs.adapter.classadapter;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：-- 类适配器模式-- 适配器的使用者
 * @author: 张小菜
 * @date: 2020/11/20 22:55
 * @version: v1.0
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V()==5){
            System.out.println("电压为 5V, 可以充电....");
        }else{
            System.out.println("电压不稳，不能充电...");
        }
    }
}
