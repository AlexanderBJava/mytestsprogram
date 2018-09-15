import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Upr2 {
    public static void main(String[] args) {
        /*Написать код,
1) который при запуске спрашивает у пользователя три числа и сохраняет их в три переменные k, t, n;
2) создает два массива целых чисел (arr1 и arr2), каждый длинной n элементов.
3) заполняет первый массив по формуле
arr1[i] = k * (i - t), где arr1[i] - i-ый элемент первого массива
4) заполняет второй массив по формуле
arr2[i] = (k + t - i), где arr2[i] - i-ый элемент второго массива
5) выводит содержимое обоих массивов*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число k ");
        int k = scan.nextInt();
        System.out.println("Введите второе число t ");
        int t = scan.nextInt();
        System.out.println("Введите третье число n ");
        int n = scan.nextInt();
        //int i;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {



            arr1[i] = k * (i - t);
            arr2[i] = (k + t - i);





        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        /*int[] numbers;
        numbers = new int[10];
        numbers[0] = 3;
        numbers[2] = 15;*/


    }
}
