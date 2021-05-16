package com.xiaocai.designs.behavior.strategy.interfac;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/21 19:41
 * @version: v1.0
 */
public class OperationDiv implements StrategyFirst {
    @Override
    public double operation(double num1, double num2) {
        if ( num2 ==0 ){
            throw new RuntimeException(" 被除数不能为0");
        }
        return num1 / num2 ;
    }
}
