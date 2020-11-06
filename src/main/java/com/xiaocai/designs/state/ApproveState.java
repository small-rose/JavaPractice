package com.xiaocai.designs.state;

import java.util.Random;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 17:28
 * @version: v1.0
 */
public class ApproveState extends AbstractBuzState{

    private BuzContext context ;

    public ApproveState(){
    }

    public  ApproveState(BuzContext context){
        this.context = context;
    }
    // TODO 已经审核状态下 可以执行支付操作
    public boolean paidOptEvent(BuzContext context){

        System.out.println("--当前状态 "+ context.getState().getClass().getSimpleName()+" 可以执行支付操作---");

        if(pay()){
            context.setState(new PaidOverState(context));
            return true ;
        }
        System.out.println("-------支付失败了 .... 程序结束");

        return false;
    }

    private boolean pay() {

        System.out.println("--正在支付....");
        int r = new Random().nextInt(10);
        if(r==1){
            return false;
        }
        return true;
    }

}
