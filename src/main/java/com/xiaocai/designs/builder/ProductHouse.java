package com.xiaocai.designs.builder;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/21 11:42
 * @version: v1.0
 */
public class ProductHouse {

    // 产品的公共属性
    private String houseBasic ;//地基
    private String houseWalls ;//墙面
    private String houseWindos ;//窗户
    private String houseRoofed ;//屋顶


    public String getHouseBasic() {
        return houseBasic;
    }

    public void setHouseBasic(String houseBasic) {
        this.houseBasic = houseBasic;
    }

    public String getHouseWalls() {
        return houseWalls;
    }

    public void setHouseWalls(String houseWalls) {
        this.houseWalls = houseWalls;
    }

    public String getHouseWindos() {
        return houseWindos;
    }

    public void setHouseWindos(String houseWindos) {
        this.houseWindos = houseWindos;
    }

    public String getHouseRoofed() {
        return houseRoofed;
    }

    public void setHouseRoofed(String houseRoofed) {
        this.houseRoofed = houseRoofed;
    }

    @Override
    public String toString() {
        return "ProductHouse{" +
                "houseBasic='" + houseBasic + '\'' +
                ", houseWalls='" + houseWalls + '\'' +
                ", houseWindos='" + houseWindos + '\'' +
                ", houseRoofed='" + houseRoofed + '\'' +
                '}';
    }
}
