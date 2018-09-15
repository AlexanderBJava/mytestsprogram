import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);


        System.out.println("Insert Data:");

        // String s= scan.nextLine();//захват следующей  строки   next.int()-захват
        //int s=scan.nextInt();  //код для захвата цифр.


        int i=0;

        while (true) {
            if (scan.hasNextInt()) {
                i = scan.nextInt();
                scan.nextLine(); // отсекает хвосты вида 55 ertwerte
                break;
                //System.out.println("Echo Data: " + (s*2));
                //System.out.println("Echo Data: " + i);
            }else {
                String temp=scan.nextLine();
                System.out.println(temp);
            }
        }




    }
}
