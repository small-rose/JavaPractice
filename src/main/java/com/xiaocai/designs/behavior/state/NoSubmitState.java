package com.xiaocai.designs.behavior.state;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 19:00
 * @version: v1.0
 */
public class NoSubmitState extends AbstractBuzState{

    private BuzContext context ;

    public NoSubmitState(){
    }

    public NoSubmitState(BuzContext context){
        this.context = context;
    }

    // TODO 未提交的状态下 可以执行提交操作
    public void submitEvent(BuzContext context){
        System.out.println("--当前状态为 "+ context.getState().getClass().getSimpleName()+" 可以发起提交---");

        doSubmit();
        context.setState(new SubmitSate(context));

    }

    private void doSubmit() {

        try {
            System.out.println("---正在执行提交订单  ....");
            Thread.sleep(500);

            System.out.println("----提交订单成功！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
