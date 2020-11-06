package com.xiaocai.designs.prototype;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/21 11:52
 * @version: v1.0
 */
public class ClientTest {
    public static void main(String[] args) {

        //方式一： 简单 直接 new
        Sheep sheep = new Sheep("小A","black",2);
        Sheep sheep1 = new Sheep("小A","black",2);
        Sheep sheep2 = new Sheep("小A","black",2);
        Sheep sheep3 = new Sheep("小A","black",2);
        Sheep sheep4 = new Sheep("小A","black",2);

        System.out.println("sheep1 :" + sheep1 + "--hashcode--" + sheep1.hashCode());
        System.out.println("sheep2 :" + sheep2 + "--hashcode--" + sheep2.hashCode());
        System.out.println("sheep3 :" + sheep3 + "--hashcode--" + sheep3.hashCode());


        //方式一： 引用传递
        Sheep sheep01 = new Sheep("小A","black",2);
        Sheep sheep02 = new Sheep(sheep.getName(),sheep.getColor(),sheep.getAge());
        Sheep sheep03 = new Sheep(sheep.getName(),sheep.getColor(),sheep.getAge());
        Sheep sheep04 = new Sheep(sheep.getName(),sheep.getColor(),sheep.getAge());
        Sheep sheep05 = new Sheep(sheep.getName(),sheep.getColor(),sheep.getAge());

        System.out.println("shee01 :" + sheep01 + "--hashcode--" + sheep01.hashCode());
        System.out.println("shee02 :" + sheep02 + "--hashcode--" + sheep02.hashCode());
        System.out.println("shee03 :" + sheep03 + "--hashcode--" + sheep03.hashCode());


    }
}
