package com.xiaocai.designs.adapter.objectadapter;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：   ---- 对象适配器--- 关系从继承变为聚合，
 * @author: 张小菜
 * @date: 2020/11/20 23:16
 * @version: v1.0
 */
public class VoltageObjectAdapter implements IVoltage5V_Obj{

    private Voltage220V_Obj voltage220V ; // 聚合方式，合成-聚合原则

    public VoltageObjectAdapter(Voltage220V_Obj voltage220V){
        this.voltage220V = voltage220V ;
    }

    @Override
    public int output5V() {
        int dest = 0 ;
        if (null == voltage220V){
            System.out.println("对象配置，执行转换失败...");
        }else{
            int out = voltage220V.output220V();
            dest = out / 44 ;
            System.out.println("对象配置，执行转换...");
        }

        return dest;
    }
}
