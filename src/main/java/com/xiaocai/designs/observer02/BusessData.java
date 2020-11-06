package com.xiaocai.designs.observer02;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 14:14
 * @version: v1.0
 */
public class BusessData {

    private float temperature; //温度
    private float windLevel;   //风级
    private float pressure; //气压

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getWindLevel() {
        return windLevel;
    }

    public void setWindLevel(float windLevel) {
        this.windLevel = windLevel;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
