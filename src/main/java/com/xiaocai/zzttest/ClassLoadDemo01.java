package com.xiaocai.zzttest;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/23 20:20
 * @version: v1.0
 */
public class ClassLoadDemo01 {

    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.var);
        Sub s = new Sub();
        System.out.println(s.var);


    }
}

class  Base{
    int var ;

    public  Base(){
        var = 4 ;
    }
}

class Sub extends Base{

    int var ;

    public  Sub(){
        var++ ;
    }
}