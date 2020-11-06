package com.xiaocai.designs.state;

/**
 *  TODO : 主要流程：提交订单——审核订单（失败则完结）———支付(支付失败则完结)——出库——完结。
 *  TODO : 状态： 已提交，已审核、已发布、已支付、已出库、已完结
 *  TODO : 行为:  提交订单、 修改订单、审核订单、检查支付、支付订单、订单出库
 */
public interface State {



    // 提交状态
    void submitEvent(BuzContext context);

    //待审核状态
    boolean approveEvent(BuzContext context);

    // 审核失败，可以修改
    void checkApproveFailedEvent(BuzContext context);

    // 审核失败了，可以修改
    public void modifyEvent(BuzContext context);

    //支付动作
    boolean paidOptEvent(BuzContext context);

    // 出库动作
    void wareOutEvent(BuzContext context);

    //
    ////修改
    //public void modifyEvent( );
    //
    //// 提交状态
    //void submitEvent( );
    //
    ////待审核状态
    //void approveEvent( );
    //
    //// 审核失败
    //void checkApproveFailedEvent( );
    //
    ////支付完成
    //void paidSuccessEvent( );

}
