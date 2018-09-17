public class TestRunnable {

    public static class Recipe implements Runnable{
        //можно через наследование(extends)Thread
        @Override
        public void run(){
            System.err.println("11111111");//в новом потоке лучше выводить в err тк АУТ кешируется.
        }

    }


    public static void main(String[] args) {
        Recipe recipe=new Recipe();
       // Thread thread=new Thread(recipe);//повар повар новый повар(по рецепту)
       // thread.start();//повар готовь.
        new Thread(recipe).start();
        //thread.setPriority(3); НЕ ИСПОЛЬЗОВАТЬ
        new Thread(recipe).start();
        new Thread(recipe).start();
        System.err.println("Основной поток"+ Thread.currentThread());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("22222222222");
            }
        }).start();



    }

}
