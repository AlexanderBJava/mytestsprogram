package TestSortirovka;

import java.util.Scanner;

 class Vvod {
    int[] chisla = new int[10];

    Scanner scanner = new Scanner(System.in);


    void  vvodchisel() {
        for (int i = 0; i < chisla.length; i++) {

            System.out.println("Введите число " + (i + 1));
            int a = scanner.nextInt();
            chisla[i] = a;
            }

    }
}
