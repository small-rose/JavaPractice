package com.xiaocai.designs.prototype.deepclone;

/**
 * @description: TODO 功能角色说明：原型模式改进原有的方式
 * TODO 描述：  利用 Cloneable 接口 的 clone 方法
 * @author: 张小菜
 * @date: 2020/10/21 11:50
 * @version: v1.0
 */
public class Sheep02 implements  Cloneable{

    private String name ;
    private String color ;
    private int age ;
    private String like = "爱吃草";
    private Sheep02 friend ;

    public Sheep02(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sheep02 getFriend() {
        return friend;
    }

    public void setFriend(Sheep02 friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep02{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", like='" + like + '\'' +
                ", friend=" + friend +
                '}';
    }

    // TODO clone 方法来自 Object 类，使用默认的 clone 方法
    @Override
    protected Object clone()  {
        Sheep02 sheep = null;
        try{
            sheep = (Sheep02) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }

        return sheep;
    }
}
