package com.xiaocai.designs.behavior.command;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/21 17:22
 * @version: v1.0
 */
public class LightOffCommand implements Command{

    // 聚合命令接受对象，真正的命令执行者/接收者
    private  LightReceiver lightReceiver;

    // 构造方法完成聚合赋值
    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        // 实际的业务操作
        if ( null!= lightReceiver ){
            // 调用命令接收者的方法
            lightReceiver.off();
        }
    }

    @Override
    public void undo() {
        // 实际的业务操作
        if ( null!= lightReceiver ){
            // 调用命令接收者的方法
            lightReceiver.on();
        }
    }
}
