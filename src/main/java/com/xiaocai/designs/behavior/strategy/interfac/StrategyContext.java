package com.xiaocai.designs.behavior.strategy.interfac;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/21 19:37
 * @version: v1.0
 */
public class StrategyContext {

    private StrategyFirst strategyFirst;
    private StrategySecond  strategySecond;


    public StrategyContext(StrategyFirst strategy) {
        this.strategyFirst = strategy;
    }
    public StrategyContext(StrategySecond strategy) {
        this.strategySecond = strategy;
    }


    //上下文接口
    public double executeStrategy(double num1, double num2) {
        return strategyFirst.operation(num1,num2);
    }


    //上下文接口
    public double getResult(double money) {
        return strategySecond.sumMoney(money);
    }
}
