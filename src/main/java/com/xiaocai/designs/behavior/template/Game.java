package com.xiaocai.designs.behavior.template;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：   --- 模板模式的顶级行为 模板控制
 * @author: 张小菜
 * @date: 2020/11/21 13:17
 * @version: v1.0
 */
public abstract  class Game {

    /**
     *  玩游戏的 模板方法
     */
    public final void play(){
        // 初始化
        initGame();
        // 开始
        startPlay();
        // 结束
        gameOver();
    }

    protected abstract void initGame();
    protected abstract void startPlay();
    protected abstract void gameOver();
}
