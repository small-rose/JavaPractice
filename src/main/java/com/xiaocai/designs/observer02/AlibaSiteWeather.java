package com.xiaocai.designs.observer02;

/**
 * @description: TODO 功能角色说明：观察者 ALIB 网天气
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 14:15
 * @version: v1.0
 */
public class AlibaSiteWeather extends Observer02{

    private BusessData busessData;


    public void update(BusessData busessData) {
        this.busessData = busessData;

        System.out.println("AlibaSite update the weather info : -----------------"  );
        System.out.println("AlibaSite update the temperature : " + busessData.getTemperature());
        System.out.println("AlibaSite update the windLevel : " + busessData.getWindLevel());
        System.out.println("AlibaSite update the pressure : " + busessData.getPressure());
        System.out.println("AlibaSite update success -----------------"  );
    }


}
