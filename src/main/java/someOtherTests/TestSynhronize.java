public class TestSynhronize {
    static  int money=100;
    static Object key=new Object();

    static void getMoney(int amount){
        System.err.println("before synh block");
        synchronized (key){      //дверь и ключ (key) (принцип туалета).
            if(amount <=money){
                pause();
                money-=amount;
                System.err.println("All ok. new amount" + money);

            }else{
                System.err.println("not enough money");
            }

        }
        System.err.println("Out of synh");
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Mikky");
                    getMoney(50);
            }

        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Tom");
                getMoney(50);
            }

        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Jerry");
                getMoney(50);
            }

        }).start();
    }

}
