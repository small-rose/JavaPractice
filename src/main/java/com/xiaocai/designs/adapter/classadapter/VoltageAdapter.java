package com.xiaocai.designs.adapter.classadapter;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  -- 适配器类
 * @author: 张小菜
 * @date: 2020/11/20 22:54
 * @version: v1.0
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{


    @Override
    public int output5V() {
        int out = output220V();
        int dest = out / 44 ;
        System.out.println("执行配置转换...");
        return dest;
    }
}
