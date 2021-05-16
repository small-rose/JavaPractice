package com.xiaocai.designs.behavior.strategy.interfac;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： ----  VIP 满减 + 打折结算
 * @author: 张小菜
 * @date: 2020/11/21 20:00
 * @version: v1.0
 */
public class CheckVIP implements StrategySecond{

    private final double rebate ; // 折扣

    private final double lessMoney ; // 满多少

    private final double cashBack ; // 满多少



    public CheckVIP(double rebate, double lessMoney,double cashBack) {
        this.rebate = rebate;
        this.lessMoney = lessMoney;
        this.cashBack = cashBack;
    }

    @Override
    public double sumMoney(Double money) {
        if(money > lessMoney){
            money = money - cashBack ;
        }

        double result = money * rebate;;
        return result;
    }
}
