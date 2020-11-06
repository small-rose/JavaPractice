package com.xiaocai.reflection;

/**
 * @description: TODO 功能角色说明： 获取类加载器
 * TODO 描述：
 * @author: 张小菜
 * @date: 2020/10/23 20:30
 * @version: v1.0
 */
public class ReflectionTest06 {

    public static void main(String[] args) throws ClassNotFoundException {

        //TODO  应用类加载器，系统类加载器
        ClassLoader appClassLoad = ClassLoader.getSystemClassLoader();
        System.out.println(appClassLoad);

        // TODO 扩展类加载器
        ClassLoader extClassLoader = appClassLoad.getParent();
        System.out.println(extClassLoader);

        // TODO  根类加载器（引导类加载器） （C/C++）无法直接获取
        ClassLoader bootClassLoader = extClassLoader.getParent();
        System.out.println(bootClassLoader); // null

        //  TODO  获取当前类加载器
        ClassLoader curentclassLoader = Class.forName("com.xiaocai.reflection.ReflectionTest06").getClassLoader();
        System.out.println(curentclassLoader);

        //  TODO  测试 rt.jar 里的类 的加载器
        ClassLoader btclassLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(btclassLoader);

        System.out.println(System.getProperty("java.class.path"));
        /*
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\charsets.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\deploy.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\javaws.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\jce.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfr.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\jfxswt.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\jsse.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\management-agent.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\plugin.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\resources.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\rt.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\access-bridge-64.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\cldrdata.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\dnsns.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jaccess.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\jfxrt.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\localedata.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\nashorn.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunec.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunjce_provider.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunmscapi.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\sunpkcs11.jar;
        C:\Program Files\Java\jdk1.8.0_191\jre\lib\ext\zipfs.jar;
        D:\dev-tools-JetBrains\idea-work\JavaPractice\target\classes;
        D:\dev-tools-JetBrains\ideaIU-2020.1.win\ideaIU-2020.1.win\lib\idea_rt.jar

         */
    }
}
