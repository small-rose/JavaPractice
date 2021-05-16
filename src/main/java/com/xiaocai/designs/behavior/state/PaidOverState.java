package com.xiaocai.designs.behavior.state;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 18:23
 * @version: v1.0
 */
public class PaidOverState extends AbstractBuzState{
    private BuzContext context ;

    public PaidOverState(){

    }
    public PaidOverState(BuzContext context){
        this.context = context;
    }
    public boolean checkPaidState(){
        if (context.getState() instanceof PaidOverState){
            return true;
        }
        return false;
    }

    public void wareOutEvent(BuzContext context){
        System.out.println("--当前状态为 "+ context.getState().getClass().getSimpleName()+" 可以出库了---");
        if (checkPaidState()) {
            System.out.println("--确认支付完成...可以出库");
        }else{
            System.out.println("------支付未完成完成...请重新支付");
            context.setState(new ApproveState(context));
        }
    }

}
