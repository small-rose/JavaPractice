package com.xiaocai.designs.behavior.observer;

/**
 * @description: TODO  观察者模式
 * TODO 1、一个 Subject接口或类 ，有一个观察者者接口，有一个观察者实现。
 *
 * @author: 张小菜
 * @date: 2020/10/15 19:24
 * @version: v1.0
 */
public class TestClient {
    public static void main(String[] args) {

        // 模拟业务数据
        WeatherBizData bizData = new WeatherBizData();
        bizData.setPressure(1000);
        bizData.setTemperature(26);
        bizData.setWindLevel(7.1f);

        // 观察管理器
        WeatherSubject  subject = new WeatherSubject(bizData);

        // 观察者
        BaiDuWeatherObserver observer1 = new BaiDuWeatherObserver();
        AlibabaWeatherObserver observer2 = new AlibabaWeatherObserver();
        CententWeatherObserver observer3 = new CententWeatherObserver();
        //添加观察者
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        //通知更新 观察者数据
        subject.notifyAllObservers();
    }
}
