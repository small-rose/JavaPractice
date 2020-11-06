package com.xiaocai.designs.builder;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述： 具体的建造者实现，本类代表普通房子建造者实现。 产品在抽象类中，建造过程和 产品解耦。
 * @author: 张小菜
 * @date: 2020/10/21 13:05
 * @version: v1.0
 */
public class CommonBuilding extends HouseBuilder{

    @Override
    void buildBasic() {
        productHouse.setHouseBasic("5米");
        System.out.println("普通房子打地基："+productHouse.getHouseBasic());
    }

    @Override
    void buildWalls() {
        productHouse.setHouseWalls("10cm");
        System.out.println("普通房子墙面厚度："+productHouse.getHouseWalls());

    }

    @Override
    void buildWindows() {
        productHouse.setHouseWindos("推拉窗");
        System.out.println("普通房子安装窗户是："+productHouse.getHouseWindos());
    }

    @Override
    void buildRoofed() {
        productHouse.setHouseRoofed("盖瓦");
        System.out.println("普通房子建房顶："+productHouse.getHouseRoofed());

    }

    // 普通房子的建造流程
    @Override
    public ProductHouse build() {
        return productHouse ;
    }
}
