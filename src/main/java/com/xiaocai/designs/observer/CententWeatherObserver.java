package com.xiaocai.designs.observer;

/**
 * @description: TODO
 * @author: 张小菜
 * @date: 2020/10/15 19:35
 * @version: v1.0
 */
public class CententWeatherObserver implements MyObserver{

    private WeatherBizData weatherBizData;


    public String updateWeather(WeatherBizData subject) {
        this.weatherBizData = subject;

        System.out.println("Tencent receive the weather info : -----------------"  );
        System.out.println("Tencent receive the temperature : " + weatherBizData.getTemperature());
        System.out.println("Tencent receive the windLevel : " + weatherBizData.getWindLevel());
        System.out.println("Tencent receive the pressure : " + weatherBizData.getPressure());
        return "Tencent receive success";
    }
}
