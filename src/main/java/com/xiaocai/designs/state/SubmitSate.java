package com.xiaocai.designs.state;

import java.util.Random;

/**
 * @description: TODO 功能角色说明： 提交状态
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 16:45
 * @version: v1.0
 */
public class SubmitSate extends  AbstractBuzState{

   private BuzContext context ;

   public   SubmitSate(){

   }
   public SubmitSate(BuzContext context){
       this.context = context;
   }

    // TODO 已经提交的状态的下可以执行审核操作
    public boolean approveEvent(BuzContext context){
        System.out.println("--当前状态 "+ context.getState().getClass().getSimpleName()+" 可以执行审核操作---");

        int random = new Random().nextInt(10);

        if(random <5){
            System.out.println("-----审核驳回，订单有问题了 ");
            context.setState(new ApproveFailState(context));
            return false ;
        }

        context.setState(new ApproveState(context));
        System.out.println("--审核成功，可以后续支付了 ");

        return true ;
    }

}
