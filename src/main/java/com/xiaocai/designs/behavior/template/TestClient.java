package com.xiaocai.designs.behavior.template;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/21 13:25
 * @version: v1.0
 */
public class TestClient {

    public static void main(String[] args) {
        LolGame lolGame = new LolGame();
        lolGame.play();

        SanGuoGame sanGuoGame = new SanGuoGame();
        sanGuoGame.play();
    }
}
