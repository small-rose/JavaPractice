package com.xiaocai.designs.adapter.objectadapter;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/20 23:16
 * @version: v1.0
 */
public class Phone_obj {

    public void charging(VoltageObjectAdapter voltageObjectAdapter){
        if(voltageObjectAdapter.output5V()==5){
            System.out.println("电压为 5V, 可以充电....");
        }else{
            System.out.println("电压不稳，不能充电...");
        }
    }
}
