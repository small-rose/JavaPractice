package com.xiaocai.designs.prototype.deepclone;

import java.io.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/21 11:58
 * @version: v1.0
 */
public class DeepPrototype implements Serializable, Cloneable {

    private String name ; //String 属性
    public DeepCloneableTarget deepCloneableTarget ;// 引用类型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public DeepPrototype() {
        super();
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }

    //TODO 深拷贝---方式一 使用 clone 方法
    @Override
    protected Object clone()  {

        Object deep = null ;
        DeepPrototype deepPrototype = null;
        try {
            //TODO 先完成属性（ 基本类型和String ）的克隆
            deep = super.clone();
            //TODO 针对引用类型的属性，进行单独处理
            deepPrototype = (DeepPrototype) deep;
            deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }


        return deepPrototype;
    }


    //TODO 深拷贝---方式一 使用 序列化 和反序列化

    public   Object serializedDeepClone(){
        DeepPrototype deepPrototype = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos  = null ;
        ByteArrayInputStream bis = null ;
        ObjectInputStream ois = null;
        try {
            // 序列号操作
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray()); //重新读出来
            ois = new ObjectInputStream(bis);
            deepPrototype = (DeepPrototype) ois.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return deepPrototype;
    }

}
