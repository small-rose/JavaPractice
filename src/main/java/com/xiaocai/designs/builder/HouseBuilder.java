package com.xiaocai.designs.builder;

/**
 * @description: TODO 功能角色说明： 建造者接口或抽象类
 * TODO 描述： 本类为 建造者抽象类,需要组合 House
 * @author: 张小菜
 * @date: 2020/10/21 12:47
 * @version: v1.0
 */
public abstract class HouseBuilder {

    //TODO  将产品组合进抽象类
    protected  ProductHouse productHouse = new ProductHouse();

    // 建造房子的流程
    abstract void buildBasic(); // 打地基
    abstract void buildWalls(); // 建墙面
    abstract void buildWindows(); // 安装窗户
    abstract void buildRoofed();  //  盖顶


    protected ProductHouse build() {
       return productHouse ;
    }


}
