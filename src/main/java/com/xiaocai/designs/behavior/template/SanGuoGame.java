package com.xiaocai.designs.behavior.template;

import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/21 13:23
 * @version: v1.0
 */
public class SanGuoGame extends Game{
    @Override
    protected void initGame() {
        System.out.println("初始化游戏，加载卡牌资源...");
    }

    @Override
    protected void startPlay() {
        System.out.println("游戏开始，进行摸牌、出牌...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void gameOver() {
        System.out.println("主公被杀，反贼胜利...");
    }
}
