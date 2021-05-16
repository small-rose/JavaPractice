package com.xiaocai.designs.behavior.state;

/**
 * @description: TODO 功能角色说明： 环境上下文
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/16 16:49
 * @version: v1.0
 */
public class BuzContext extends  AbstractBuzState{

    // 持有的当前状态，根据业务流程处理相应的变化
    private State state ;
    private String flag = "T" ;


    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void modifyEvent(){
        state.modifyEvent(this);
    }
    public void submitEvent(){
        state.submitEvent(this);
    }

    public boolean approveEvent(){
       return state.approveEvent(this);
    }

    public void checkApproveFailedEvent(){
        state.checkApproveFailedEvent(this);
    }

    public boolean paidOptEvent(){
        return state.paidOptEvent(this);
    }
    public void wareOutEvent(){
        state.wareOutEvent(this);
    }

}
