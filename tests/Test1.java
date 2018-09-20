public class Test1 {

    public static void main(String[] args) {
        int i = 20;
        maid(20);


    }

    private static void maid(int x) {
        if (x < 500) {

            System.out.println(x);
            maid(x + 5);
        }
    }

}