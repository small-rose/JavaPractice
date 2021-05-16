package com.xiaocai.designs.behavior.observer02;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：聚合资源、聚合观察者
 * TODO 描述：被观察着实例对象，用来聚合资源、聚合观察者
 * @author: 张小菜
 * @date: 2020/10/16 14:23
 * @version: v1.0
 */
public class WeatherSubject extends Subject02{

    private BusessData busessData;
    private List<Observer02> observer02s = new ArrayList<Observer02>();

    public WeatherSubject(){

    }

    public WeatherSubject(BusessData busessData){
        this.busessData = busessData;
    }

    public BusessData getBusessData() {
        return busessData;
    }

    public void setBusessData(BusessData busessData) {
        this.busessData = busessData;
    }

    public void register(Observer02 observer02) {
        observer02s.add(observer02);
    }

    public void remove(Observer02 observer02) {
        if(observer02s.contains(observer02)){
            observer02s.remove(observer02);
        }
    }

    public void update() {

        for (Observer02 observer02 : observer02s) {
            observer02.update(busessData);
        }
    }
}
