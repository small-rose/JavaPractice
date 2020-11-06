package com.xiaocai.designs.observer;

/**
 * @description: TODO 观察者接口，用于更新具体观察者数据数据
 * @author: 张小菜
 * @date: 2020/10/15 19:35
 * @version: v1.0
 */
public interface MyObserver {

    public String updateWeather(WeatherBizData subject);
}
