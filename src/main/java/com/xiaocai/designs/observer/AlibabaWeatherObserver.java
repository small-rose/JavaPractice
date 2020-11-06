package com.xiaocai.designs.observer;

/**
 * @description: TODO
 * @author: 张小菜
 * @date: 2020/10/15 19:30
 * @version: v1.0
 */
public class AlibabaWeatherObserver implements MyObserver{


    private WeatherBizData weatherBizData;


    public String updateWeather(WeatherBizData subject) {
        this.weatherBizData = subject;

        System.out.println("Alibab receive the weather info : -----------------"  );
        System.out.println("Alibab receive the temperature : " + weatherBizData.getTemperature());
        System.out.println("Alibab receive the windLevel : " + weatherBizData.getWindLevel());
        System.out.println("Alibab receive the pressure : " + weatherBizData.getPressure());
        return "Alibab receive success";
    }

}
