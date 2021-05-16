package com.xiaocai.designs.behavior.state;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 19:16
 * @version: v1.0
 */
public class TestClient {

    public static void main(String[] args) {

        BuzContext buzContext = new BuzContext();
        buzContext.setState(new NoSubmitState());

        // 修改状态可以提交
        buzContext.submitEvent();

        //提审核
        boolean blooApr = buzContext.approveEvent();
        if(!blooApr){
            System.exit(0);
        }
        //提支付操作
        boolean bloopay =buzContext.paidOptEvent();
        if(!bloopay){
            System.exit(0);
        }
        //提审核
        buzContext.wareOutEvent();

    }

}
