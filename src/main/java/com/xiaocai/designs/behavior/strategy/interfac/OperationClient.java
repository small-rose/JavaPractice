package com.xiaocai.designs.behavior.strategy.interfac;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/21 19:43
 * @version: v1.0
 */
public class OperationClient {

    public static void main(String[] args) {

        OperationAdd add = new OperationAdd();

        StrategyContext context = new StrategyContext(add);
        // 第一类策略 就是进行加减乘除计算
        double result = context.executeStrategy(10, 5);
        System.out.println(" add strategy " + result);

        double amount = 58.0;

        CheckNormal checkNormal = new CheckNormal();
        StrategyContext strategy = new StrategyContext(checkNormal);

        double money = strategy.getResult(amount);
        System.out.println("正常结算："+money);

        CheckRebate checkRebate = new CheckRebate(0.8);
        StrategyContext rebate = new StrategyContext(checkRebate);

        double money2 = rebate.getResult(amount);
        System.out.println("打折结算："+money2);


        CheckVIP vip = new CheckVIP(0.9, 50.0,10.0);
        StrategyContext vipstrategy = new StrategyContext(vip);

        double money3 = vipstrategy.getResult(amount);
        System.out.println("VIP结算："+money3);

    }
}
