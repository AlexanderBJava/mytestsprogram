package krestikiNolokiOOP;

//import java.util.Scanner;

public class Field {
   final private int fieldLenght = 9;
    char[] field = new char[fieldLenght];

  public void fieldCreate(){
      for (int i = 0; i < field.length; i++) {
          field[i] = '_';
      }
    //  Scanner scanner = new Scanner(System.in);

      showField();
  }
    public  void  showField(){
        System.out.printf("%c %c %c %n", field[0], field[1], field[2]);
        System.out.printf("%c %c %c %n", field[3], field[4], field[5]);
        System.out.printf("%c %c %c %n", field[6], field[7], field[8]);


    }

}
