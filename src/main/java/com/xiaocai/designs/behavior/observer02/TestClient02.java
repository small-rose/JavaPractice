package com.xiaocai.designs.behavior.observer02;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 14:29
 * @version: v1.0
 */
public class TestClient02 {
    public static void main(String[] args) {
        WeatherSubject subject02 = new WeatherSubject();

        AlibaSiteWeather alibaSiteWeather = new AlibaSiteWeather();
        BaiduSiteWeather baiduSiteWeather = new BaiduSiteWeather();

        subject02.register(alibaSiteWeather);
        subject02.register(baiduSiteWeather);

        BusessData busessData = new BusessData();
        busessData.setPressure(1800f);
        busessData.setWindLevel(3.5f);
        busessData.setTemperature(26.8f);

        subject02.setBusessData(busessData);
        subject02.update();

    }
}
