package com.xiaocai.designs.state;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 16:44
 * @version: v1.0
 */
public class AbstractBuzState implements State{

    protected  final  RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

     //抽象类，默认实现了 state 接口的所有方法
    //该类的所有方法，其子类（具体的状态类）可以有选择的进行重写。

    public void submitEvent(BuzContext context) {
        throw  EXCEPTION ;
    }
    public void modifyEvent(BuzContext context){
        throw  EXCEPTION ;
    }
    public boolean approveEvent(BuzContext context) {
        throw  EXCEPTION ;
    }

    public void checkApproveFailedEvent(BuzContext context) {
        throw  EXCEPTION ;
    }

    public boolean paidOptEvent(BuzContext context) {
        throw  EXCEPTION ;
    }

    public void wareOutEvent(BuzContext context) {
        throw  EXCEPTION ;
    }

/*

    public void submitEvent(BuzContext context) {
        throw  EXCEPTION ;
    }
    public void modifyEvent(BuzContext context){
        throw  EXCEPTION ;
    }
    public void approveEvent(BuzContext context) {
        throw  EXCEPTION ;
    }

    public void checkApproveFailedEvent(BuzContext context) {
        throw  EXCEPTION ;
    }

    public void paidSuccessEvent(BuzContext context) {
        throw  EXCEPTION ;
    }*/
}
