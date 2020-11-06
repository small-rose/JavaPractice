package com.xiaocai.designs.observer02;

/**
 * @description: TODO 功能角色说明：目标对象的抽象
 * TODO 描述：被观察者对象的抽象
 * @author: 张小菜
 * @date: 2020/10/16 14:20
 * @version: v1.0
 */
public abstract  class Subject02 {

    public abstract void register(Observer02 observer02);

    public abstract void remove(Observer02 observer02);

    public abstract void update();

}
