package com.xiaocai.designs.prototype.deepclone;

import java.io.Serializable;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/21 11:55
 * @version: v1.0
 */
public class DeepCloneableTarget implements Serializable ,Cloneable {

    private String cloneName ;
    private String cloneClass ;

    // 构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    // TODO 因为此类的属性都是string，可以使用默认的 clone 方法完成
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass=" + cloneClass +
                '}';
    }
}
