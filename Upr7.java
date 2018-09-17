import java.util.Scanner;

public class Upr7 {


   // public static class Upr6 {
        /*вводят символы два пользователя по очереди. Тот игрок, у которого будет три одинаковых символа
в одной линии, станет победителем.
Например, игрок 1 вводит символы X, игрок 2 вводит символы 0
_ X _
0 0 0
_ _ X
Игрок 2 победил.
В простом варианте можете проверять совпадение только в горизонтальных линиях.
В более сложном проверяйте линии и вертикальные и по диагонали


    */
        public static void main(String[] args) {
            char[] field = new char[9];
                for (int i = 0; i < field.length; i++) {
                    field[i] = '_';
                }
                Scanner scanner = new Scanner(System.in);

                System.out.printf("%c %c %c %n", field[0], field[1], field[2]);

                System.out.printf("%c %c %c %n", field[3], field[4], field[5]);
                System.out.printf("%c %c %c %n", field[6], field[7], field[8]);
                int player = 1;
                while (true) {


                System.out.println("Игрок " + player + " введите номер ячейки от 0 до 8");


                int nomer = scanner.nextInt();
                String temp = scanner.nextLine();
                // System.out.println(""+nomer);
                if (nomer < 9 && nomer >= 0 && player > 0 && player < 2) {
                    // System.out.println("Введите символ для этой ячейки");

                    // String symb;
                    // symb = scanner.nextLine();
                    char userLetter = 'X'; //symb.charAt(0);
                    //System.out.println(userLetter);
                    // for (int i = 0; i < 9; i++) {
                    if (field[nomer] == '_') {

                        field[nomer] = userLetter;
                        System.out.printf("%c %c %c %n", field[0], field[1], field[2]);
                        System.out.printf("%c %c %c %n", field[3], field[4], field[5]);
                        System.out.printf("%c %c %c %n", field[6], field[7], field[8]);
                    } else {
                        System.out.println("Занято");
                    }

                } else {
                    // System.out.println("Нет такой клетки!");
                    // break;
                    char userLetter = 'O'; //symb.charAt(0);
                    //System.out.println(userLetter);
                    // for (int i = 0; i < 9; i++) {
                    if (field[nomer] == '_') {

                        field[nomer] = userLetter;
                        System.out.printf("%c %c %c %n", field[0], field[1], field[2]);
                        System.out.printf("%c %c %c %n", field[3], field[4], field[5]);
                        System.out.printf("%c %c %c %n", field[6], field[7], field[8]);
                    }else {
                        System.out.println("Занято");
                    }

                }


                if (field[0] == field[1] && field[1] == field[2] && (field[0]=='X' || field[0]=='O'  )) { //|| (field[3]== field[4] && field[4]== field[5]) || (field[6]== field[7]&&      field [7] == field[8])){
                    System.out.println("Поздравляю с победой игрок номер " + player);
                    break;
                } else {
                    if (field[3] == field[4] && field[4] == field[5] && (field[5]=='X' || field[5]=='O'  )) { //|| (field[3]== field[4] && field[4]== field[5]) || (field[6]== field[7]&&      field [7] == field[8])){
                        System.out.println("Поздравляю с победой игрок номер " + player);
                        break;
                    } else {

                        if (field[6] == field[7] && field[7] == field[8] && (field[7]=='X' || field[7]=='O'  )) { //|| (field[3]== field[4] && field[4]== field[5]) || (field[6]== field[7]&&      field [7] == field[8])){
                            System.out.println("Поздравляю с победой игрок номер " + player);
                            break;
                        }
                    }


                    player = (player == 1) ? 2 : 1;

                }

                boolean hasEmpty = false;
                for (char c : field) {   //выражение "for each", используется в тех случаях когда тебе надо перебрать объекты которые являются массивами или коллекциями
                    if (c == '_') {
                        hasEmpty = true;
                        break;
                    }
                }
                // если пустых ячеек не осталось, то значит ничья
                if (!hasEmpty) {
                    System.out.println();
                    System.out.println("!!!НИЧЬЯ!!!");

                }
            }
        }


   // }
}