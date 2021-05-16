package com.xiaocai.designs.behavior.command;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/21 17:37
 * @version: v1.0
 */
public class RemoteController {

    // 开按钮的命令数组
    private  Command[]  onCommands ;

    // 关闭按钮的命令数组
    private  Command[]  offCommands ;

    private Command undoCommand ;

    // 构造方法初始化命令
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int no, Command onCommand, Command offCommand ){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }


    // 按下开操作
    public void onButtonPushed(int no){
        // 执行对应的
        onCommands[no].execute();

        // 记录本次操作，用于撤销
        undoCommand = onCommands[no] ;
    }

    // 按下 关 操作
    public void offButtonPushed(int no){
        // 执行对应的
        offCommands[no].execute();

        // 记录本次操作，用于撤销
        undoCommand = offCommands[no] ;
    }

    // 按下 撤销 操作的处理
    public void undoButtonPushed(){
        undoCommand.undo();
    }
}
