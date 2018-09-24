import java.util.Scanner;

public class Upr3Up {


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
        int num1 =0;
        int sum = 0;

        while (sum != 21) {

              num1=  scan.nextInt();
            if (num1 <= 0 || num1 > 10) {

                System.out.println("ВВедите другое число: ");
               // break;
            } else {
                sum += num1;
            }
            System.out.println("Сумма равна " + sum);
            if (sum > 21) {
                System.out.println("Вы проиграли");
                break;
            }

        }

        if (sum == 21) {
            System.out.println("BLACK JACK");
            //break;
        }


    }
}