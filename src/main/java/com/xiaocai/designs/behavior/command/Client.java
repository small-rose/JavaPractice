package com.xiaocai.designs.behavior.command;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/21 17:25
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {

        // 使用命令设计模式，完成通过遥控器，对点灯的操作

        // 创建电灯的对象（接受者）
        LightReceiver lightReceiver = new LightReceiver();

        // 创建电灯的命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 创建一个遥控器
        RemoteController remoteController = new RemoteController();

        // 给遥控器设置命令， 第一组操作 电灯的开 和 关 的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("按下电灯 【开】操作...");
        remoteController.onButtonPushed(0);

        System.out.println("按下电灯 【关】操作...");

        remoteController.offButtonPushed(0);
        System.out.println("按下电灯 【撤销】操作...");
        remoteController.undoButtonPushed();

        System.out.println("----------------------------------");

        // 扩展电视的开关操作？
        // 新建了3个操作，一个电视机的命令接收者，两个操作

        // 创建电视机的对象（接受者）
        TvReceiver tvReceiver = new TvReceiver();

        // 创建电灯的命令
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);


        // 给遥控器设置命令， 第2组操作 电视机 的开 和 关 的操作
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);


        System.out.println("按下电视 【开】操作...");
        remoteController.onButtonPushed(1);

        System.out.println("按下电视 【关】操作...");

        remoteController.offButtonPushed(1);
        System.out.println("按下电视 【撤销】操作...");
        remoteController.undoButtonPushed();
    }
}
