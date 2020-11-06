package com.xiaocai.designs.state;

import java.util.Random;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 17:28
 * @version: v1.0
 */
public class PaidState extends  AbstractBuzState{

    private BuzContext context ;

    public PaidState(BuzContext context){
        this.context = context;
    }

    public void wareOutEvent(BuzContext context){
        if(pay()){
            context.setState(new PaidOverState(context));
        }else{
            System.out.println(" 支付失败了 ....");
            context.setState(new PaidOverState(context));

        }
    }

    private boolean pay() {

        System.out.println("正在支付....");
        int r = new Random().nextInt(10);
        if(r==1){
            return false;
        }
        return true;
    }
}
