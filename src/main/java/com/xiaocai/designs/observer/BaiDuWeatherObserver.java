package com.xiaocai.designs.observer;

/**
 * @description: TODO
 * @author: 张小菜
 * @date: 2020/10/15 18:08
 * @version: v1.0
 */
public class BaiDuWeatherObserver implements MyObserver{

    private WeatherBizData weatherBizData;


    public String updateWeather(WeatherBizData subject) {
        this.weatherBizData = subject;

        System.out.println("Baidu receive the weather info : -----------------"  );
        System.out.println("Baidu receive the temperature : " + weatherBizData.getTemperature());
        System.out.println("Baidu receive the windLevel : " + weatherBizData.getWindLevel());
        System.out.println("Baidu receive the pressure : " + weatherBizData.getPressure());
        return "Baidu receive success";
    }
}
