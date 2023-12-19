package Chat;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        // 在新线程中启动服务器
        new Thread(new Runnable() {
            public void run() {
                Server server = new Server();
                try {
                    server.start();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        Thread.sleep(1000);
        // 在新线程中启动每个客户端
        new Thread(new Runnable() {
            public void run() {
                Client client_1 = new Client("香蕉");
                try {
                    client_1.run();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        Thread.sleep(1000);

        new Thread(new Runnable() {
            public void run() {
                Client client_2 = new Client("芒果");
                try {
                    client_2.run();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        Thread.sleep(1000);

//        new Thread(new Runnable() {
//            public void run() {
//                Client client_3 = new Client("西瓜");
//                try {
//                    client_3.run();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }).start();
//        Thread.sleep(1000);

        new Thread(new Runnable() {
            public void run() {
                Client client_4 = new Client("星星");
                try {
                    client_4.run();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        Thread.sleep(1000);
    }
}
