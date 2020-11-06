package com.xiaocai.designs.builder;
/*TODO 建造者模式（生成器模式）
   建造者模式：
    一个模式
   -------
    核心角色：
    Product 产品角色：一个具体的产品对象。
    Builder 抽象建造者： 创建一个Product 对象的各个部件指定的接口/ 抽象类
    ConcreateBuilder : 具体的建造者，实现接口，构造和装配各个配件
    Director 指挥者 ： 构建一个使用 Builder 接口的对象，主要是创建一个复杂对象，
                        作用（1）隔离客户对对象的生产过程。（2）复杂控制产品对象的生产过程。


 */