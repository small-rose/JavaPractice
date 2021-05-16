package com.xiaocai.designs.behavior.command;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/11/21 17:23
 * @version: v1.0
 */
public class NoCommand implements Command{

    /**
     * NoCommand 这个类比较特殊，可以当做默认执行（空）命令，即什么都不做的空命令,即不执行任何操作，
     *
     * 这是一种设计，不需要判断命令是否为空
     */


    @Override
    public void execute() {
        // do nothing
    }

    @Override
    public void undo() {
        // do nothing
    }
}
