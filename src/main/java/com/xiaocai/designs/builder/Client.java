package com.xiaocai.designs.builder;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/21 13:21
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {

        // 普通房子
        CommonBuilding commonBuilding = new CommonBuilding();
        // 创建指挥者
        HouseDirector houseDirector = new HouseDirector(commonBuilding);
        // 完成 盖房子
        ProductHouse productHouse = houseDirector.constructHouse();
        System.out.println(productHouse);

        System.out.println("------------------------");

        // 高级房子
        HighBuilding highBuilding = new HighBuilding();
        // 重置建造者（实现）
        houseDirector.setHouseBuilder(highBuilding);
        // 完成 盖房子
        ProductHouse productHouse02 = houseDirector.constructHouse();
        System.out.println(productHouse02);


    }
}
