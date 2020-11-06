package com.xiaocai.designs.prototype.deepclone;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/21 12:53
 * @version: v1.0
 */
public class SheepClient {

    public static void main(String[] args) {

        Sheep02 sheep02 = new Sheep02("小艾","white", 2);
        Sheep02 clone1 = (Sheep02) sheep02.clone();
        Sheep02 clone2 = (Sheep02) sheep02.clone();
        Sheep02 clone3 = (Sheep02) sheep02.clone();

        System.out.println("sheep02:" + sheep02 + "sheep02 hash code ："+sheep02.hashCode());
        System.out.println("clone1:" + clone1 + "clone1 hash code ："+clone1.hashCode());
        System.out.println("clone2:" + clone2 + "clone2 hash code ："+clone2.hashCode());
        System.out.println("clone3:" + clone3 + "clone3 hash code ："+clone3.hashCode());
    }
}
