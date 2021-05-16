package com.xiaocai.designs.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO  天气资源类主题类.
 *  TODO 本质是 是被观察对象的实现类。聚合管理观察者，一旦资源发生变化，就可以通知观察者
 * @author: 张小菜
 * @date: 2020/10/15 19:35
 * @version: v1.0
 */
public class WeatherSubject implements Subject {


    private WeatherBizData bizData; //模拟业务数据

    private List<MyObserver> observers = new ArrayList<MyObserver>();

    private float temperature; //温度
    private float wet;   //湿度
    private float pressure; //气压

    private WeatherSubject(){

    }

    public WeatherSubject(WeatherBizData bizData){
        this.bizData = bizData;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getWet() {
        return wet;
    }

    public void setWet(float wet) {
        this.wet = wet;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void registerObserver(MyObserver observer){
        observers.add(observer);
    }

    public void removeObserver(MyObserver observer){
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    //只负责通知其他观察者的实现

    public void notifyAllObservers() {
        for (MyObserver ob : observers) {
            System.out.println(ob.updateWeather(bizData));
        }
    }
}
