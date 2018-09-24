import java.util.Scanner;

public class Upr3 {
    public static void main(String[] args) {
        /*Напишите код, который в цикле спрашивает у пользователя число от 1 до 10 (по одному числу за раз),
до тех пор, пока сумма этих чисел не станет равной 21.
Если сумма чисел превысила 21, то завершите программу.
Если сумма чисел составила точно 21, то поздравьте пользователя с выигрышем.
Например, пользователь ввел число 2, затем число 5, затем число 6, их сумма будет
2 + 5 + 6 = 13 */

        Scanner scan;
        scan = new Scanner(System.in);

        System.out.println("ВВедите число от 1 до 10: ");
        int num1 = scan.nextInt();
        if (num1 > 0 && num1 < 10) {

            System.out.println("ВВедите число от 1 до 10: ");
            int num2 = scan.nextInt();
            if (num2 > 0 && num2 < 10) {


                System.out.println("ВВедите число от 1 до 10: ");
                int num3 = scan.nextInt();
                if (num3 > 0 && num3 < 10) {


                    System.out.println("ВВедите число от 1 до 10: ");
                    int num4 = scan.nextInt();

                    if (num4 > 0 && num4 < 10) {


                        int sum = num1 + num2 + num3 + num4;

                        if(sum==21){
                            System.out.println("Black Jack");
                        }else {
                            if(sum<21){
                                System.out.println("game over");
                            }else{
                                if(sum>21){
                                    System.out.println("game over!!!!!!!!!3");
                                }
                            }

                        }









                          //  System.out.println("game over");

                        }
                    } else {
                        System.out.println("ВВедите Другое число: ");
                        //break;
                    }





/*while (true) {
    if (num > 0 && num < 10) {
        System.out.println(num);

    } else {
        System.out.println("ВВедите Другое число: ");
    }*/
                }
            } else {
        System.out.println("ВВедите Другое число: ");
        //break;
    }
        }
}


