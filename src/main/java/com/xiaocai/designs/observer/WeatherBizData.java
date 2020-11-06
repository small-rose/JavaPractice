package com.xiaocai.designs.observer;

/**
 * @description: TODO  天气元素，模拟的是业务数据
 * @author: 张小菜
 * @date: 2020/10/15 19:48
 * @version: v1.0
 */
public class WeatherBizData {

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
