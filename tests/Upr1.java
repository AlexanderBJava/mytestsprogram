import java.util.Scanner;

public class Upr1 {
    public static void main(String[] args) {

       /* Написать код, который спрашивает у пользователя два целых числа и выводит на экран:
        если у чисел разные знаки (одно положительное, а другое отрицательное), то выводит на экран произведение двух чисел,
        иначе, если первое число больше второго, то выводит разность двух чисел,
        иначе, если оба числа отрицательные, то сумму двух чисел,
                остаток от деления первого числа на второе – во всех остальных случаях.*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1;
        num1 = scan.nextInt();


        System.out.println("Введите второе число:");
        int num2;
        num2 = scan.nextInt();


        if ((num1 > 0 && num2 < 0) || (num2 > 0 && num1 < 0)) {
            System.out.printf("Произведение первого числа %d на второе %d равно %d%n", num1, num2, (num1 * num2));

        } else {
            if (num1 > num2) {
                System.out.printf("Если первое число %d больше второго %d то разность равна %d%n", num1, num2, (num1 - (num2)));


            } else {

                if (num1 < 0 && num2 < 0) {
                    System.out.printf("Если первое число %d меньше 0 и второе число %d меньше 0 то сумма равна %d%n", num1, num2, (num1 + (num2)));


                } else {
                    double num3=(double) num1 / num2;

                    System.out.printf(" первое число %d делим нв второе число %d : %f%n", num1, num2, num3);
                    System.out.println(num3);
                }


            }
        }
    }

}