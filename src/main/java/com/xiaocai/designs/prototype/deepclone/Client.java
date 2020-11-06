package com.xiaocai.designs.prototype.deepclone;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/21 12:05
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        
        DeepPrototype prototype = new DeepPrototype();
        prototype.setName("张三");
        DeepCloneableTarget target = new DeepCloneableTarget("李四", "李四的类");
        prototype.setDeepCloneableTarget(target);

        // TODO 方式一 完成 深拷贝
        DeepPrototype copy = (DeepPrototype)prototype.clone();
        System.out.println("prototype : " + prototype + "copy.refrence hashcode : " + prototype.getDeepCloneableTarget().hashCode());
        System.out.println("copy : " + copy + "copy.refrence hashcode : " + copy.getDeepCloneableTarget().hashCode());

        System.out.println("-------------------------------------------");

        // TODO 方式二 完成 深拷贝
        DeepPrototype copy2 = (DeepPrototype)prototype.serializedDeepClone();
        System.out.println("prototype : " + prototype + "copy.refrence hashcode : " + prototype.getDeepCloneableTarget().hashCode());
        System.out.println("copy2 : " + copy2 + " copy2.refrence hashcode : " + copy2.getDeepCloneableTarget().hashCode());


    }
}
