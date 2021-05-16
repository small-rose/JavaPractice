package com.xiaocai.designs.behavior.template;

import java.util.concurrent.TimeUnit;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/21 13:21
 * @version: v1.0
 */
public class LolGame extends Game{

    @Override
    protected void initGame() {
        System.out.println("初始化游戏....加载LOL资源");
    }

    @Override
    protected void startPlay() {
        System.out.println("LOL开始对战中....");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void gameOver() {
        System.out.println("水晶摧毁，游戏结束....");
    }
}
