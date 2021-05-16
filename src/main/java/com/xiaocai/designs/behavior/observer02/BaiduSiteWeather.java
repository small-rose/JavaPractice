package com.xiaocai.designs.behavior.observer02;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 14:19
 * @version: v1.0
 */
public class BaiduSiteWeather extends Observer02{
    private BusessData busessData;


    public void update(BusessData busessData) {
        this.busessData = busessData;

        System.out.println("BaiduSite update the weather info : -----------------"  );
        System.out.println("BaiduSite update the temperature : " + busessData.getTemperature());
        System.out.println("BaiduSite update the windLevel : " + busessData.getWindLevel());
        System.out.println("BaiduSite update the pressure : " + busessData.getPressure());
        System.out.println("BaiduSite update success -----------------"  );
    }
}
