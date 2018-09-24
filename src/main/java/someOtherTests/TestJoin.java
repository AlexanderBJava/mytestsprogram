public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.err.println(i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                       // e.printStackTrace();
                        System.err.println("waked");
                    }
                }
            }
        });

        System.err.println("start");
        thread.start();
        Thread.sleep(1000);
        System.err.println("end");




    }
}
