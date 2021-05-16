package com.xiaocai.designs.behavior.strategy.interfac;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：  --- 正常结算策略
 * @author: 张小菜
 * @date: 2020/11/21 19:55
 * @version: v1.0
 */
public class CheckNormal implements StrategySecond{
    @Override
    public double sumMoney(Double money) {
        System.out.println("不打折结算");
        return money;
    }
}
