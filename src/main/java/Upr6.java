import java.util.Scanner;

public class Upr6 {
    /*Написать код,
который выводит на экран квадратное поле в виде 9 символов подчеркивания
_ _ _
_ _ _
_ _ _
Затем спрашивает у пользователя, номер ячейки и символ, который поставить в эту ячейку,
и заполняет выбранную ячейку заданым символом.
Например, пользователь выбрал вторую ячейку и символ X
Программа должны вывести на экран результат
_ X _
_ _ _
_ _ _
Недопустимо ставить символ в уже заполненную ячейку


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
        while (true) {
          //
            System.out.println("Введите номер ячейки от 0 до 8");
            int nomer = scanner.nextInt();
            String temp = scanner.nextLine();
            // System.out.println(""+nomer);
            if (nomer < 9 && nomer >= 0) {
                System.out.println("Введите символ для этой ячейки");

                String symb;
                symb = scanner.nextLine();
                char userLetter = symb.charAt(0);
                //System.out.println(userLetter);
                // for (int i = 0; i < 9; i++) {
                  if(field[nomer]=='_'){

                         field[nomer] = userLetter;
                          System.out.printf("%c %c %c %n", field[0], field[1], field[2]);
                          System.out.printf("%c %c %c %n", field[3], field[4], field[5]);
                          System.out.printf("%c %c %c %n", field[6], field[7], field[8]);
                          }else {
                      System.out.println("Занято");
                  }

            } else {
                System.out.println("Нет такой клетки!");
                break;
            }
        }


    }
}












