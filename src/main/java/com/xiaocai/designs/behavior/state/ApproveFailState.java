package com.xiaocai.designs.behavior.state;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 17:28
 * @version: v1.0
 */
public class ApproveFailState extends AbstractBuzState{

    private BuzContext context ;

    public ApproveFailState(BuzContext context){
        this.context = context;
    }

    public void modifyEvent(BuzContext context){
        System.out.println(" 有问题的订单，进行了修改...");

        context.setState(new NoSubmitState(context));
    }
}
