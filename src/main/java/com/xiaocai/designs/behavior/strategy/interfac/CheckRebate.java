package com.xiaocai.designs.behavior.strategy.interfac;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：   ----  活动打折结算
 * @author: 张小菜
 * @date: 2020/11/21 19:58
 * @version: v1.0
 */
public class CheckRebate implements StrategySecond{

    final double rebate ; // 折扣

    public CheckRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double sumMoney(Double money) {
        return money * rebate;
    }
}
