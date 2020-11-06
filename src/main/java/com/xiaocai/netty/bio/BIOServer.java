package com.xiaocai.netty.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: TODO 功能角色说明： BIO 服务端
 * TODO 描述： BIO 基础模型练习
 * @author: 张小菜
 * @date: 2020/10/17 10:22
 * @version: v1.0
 */
public class BIOServer {

    public static void main(String[] args) throws IOException {
        //1、创建线程池改进
        //2 如果有客户端就可以创建一个线程 与之通讯（单独一个方法）

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //创建 ServerSocket
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器启动成功！");


        while (true){
            //监听 等待客户端连接
            System.out.println("等待客户端....");
            final Socket socket = serverSocket.accept();
            System.out.println("连接到一个客户端了");

            //创建一个线程 与之通讯
            cachedThreadPool.execute(new Runnable() {
                public void run() {
                    //通讯操作
                    handle(socket);
                }
            });
        }
    }

    // 与客户端通讯的处理方法
    private static void handle(Socket socket) {
        try {
            System.out.println(" 线程ID：" + Thread.currentThread().getId() +" , 线程名称：" + Thread.currentThread().getName());
            // 通过Socket 获取输入流
            InputStream inputStream = socket.getInputStream();

            byte[] bytes = new byte[1024];
            while (true){
                System.out.println("read....");
                int read = inputStream.read(bytes);
                if(read != -1){

                    String result = new String(bytes,0,read);
                    //输出客户端发生的数据
                    System.out.println(result);

                    OutputStream out = socket.getOutputStream();
                    String ans = "我已收到！";
                    out.write(ans.getBytes("GBK"));
                    out.flush();
                    out.close();
                    System.out.println("收到");

                }else{


                    break;
                }
            }


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("关闭客户端连接");

            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
