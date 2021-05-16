package com.xiaocai.designs.adapter.objectadapter;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/20 23:18
 * @version: v1.0
 */
public class Client_Obj {

    public static void main(String[] args) {
        Phone_obj phone = new Phone_obj();
        phone.charging(new VoltageObjectAdapter(new Voltage220V_Obj()));
    }
}
