import java.util.Random;
import java.util.Scanner;

public class uprMorscBoy {
    public static void main(String[] args) {
/*0. Попробуйте его восстановить по памяти. Если не получится – подглядите в лекции
1. Сделайте так, чтобы корабль располагался в случайной ячейке
2. Сделайте так, чтобы корабль был не однопалубный, а, например, трехпалубный
3. Сложное задание (* необязательное) Сделайте так, чтобы кораблей было несколько (например, три)!*/
        //...X...
        char[] pole = new char[20];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = '.';
        }

        int a = 0; // Начальное значение диапазона - "от"
        int b = 20; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация случайного числа
        System.out.println("случайное число1: " + random_number1);
        int random_number2 = a + (int) (Math.random() * b); // Генерация случайного числа
        System.out.println("случайное число2: " + random_number2);
        int random_number3 = a + (int) (Math.random() * b); // Генерация случайного числа
        System.out.println("случайное число3: " + random_number3);


        pole[random_number1] = 'X';
        pole[random_number2]= 'X';
        pole[random_number3]= 'X';
        //pole[random_number1+5]= 'X';

        Scanner scanner = new Scanner(System.in);
        int vistrel;
        do {
            System.out.println("В какое поле от 0 до " + pole.length + " стреляем?");
            vistrel = scanner.nextInt();
            scanner.nextLine();

            switch (pole[vistrel]) {
                case '.':
                    System.out.println("Не попал!");
                    break;
                case 'X':
                    pole[vistrel] = '@';
                    System.out.println("ПОПАЛ!");
                    break;
                case '@':
                    System.out.println("Сюда уже стрелял!!!");
                    break;
            }
            System.out.println(pole);


        } while (pole[random_number1]=='X' || pole[random_number2]=='X' || pole[random_number3]=='X' );     //|| pole[random_number1+5]=='X'   (pole[vistrel] != '@');

        System.out.println("Победа!!!");

    }
}
