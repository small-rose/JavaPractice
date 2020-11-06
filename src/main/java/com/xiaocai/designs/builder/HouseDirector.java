package com.xiaocai.designs.builder;

/**
 * @description: TODO 功能角色说明： 指挥者
 * TODO 描述：  可以根据需要自己定义建造流程。
 * @author: 张小菜
 * @date: 2020/10/21 13:18
 * @version: v1.0
 */
public class HouseDirector {

    private HouseBuilder houseBuilder = null ;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //TODO  真正建房子的步骤交给指挥者
    public ProductHouse constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildRoofed();
        houseBuilder.buildWindows();
        return houseBuilder.build();
    }
}
