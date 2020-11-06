package com.xiaocai.designs.builder;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：具体的建造者实现，本类代表高级房子建造者实现
 * @author: 张小菜
 * @date: 2020/10/21 13:05
 * @version: v1.0
 */
public class HighBuilding extends HouseBuilder{
    @Override
    void buildBasic() {
        productHouse.setHouseBasic("20米");
        System.out.println("高级房子打地基："+productHouse.getHouseBasic());
    }

    @Override
    void buildWalls() {
        productHouse.setHouseWalls("20cm");
        System.out.println("高级房子墙面厚度："+productHouse.getHouseWalls());
    }

    @Override
    void buildWindows() {
        productHouse.setHouseWindos("智能百叶窗");
        System.out.println("高级房子安装窗户是："+productHouse.getHouseWindos());
    }

    @Override
    void buildRoofed() {
        productHouse.setHouseRoofed("防晒玻璃瓦");
        System.out.println("高级房子建房顶："+productHouse.getHouseRoofed());
    }
}
