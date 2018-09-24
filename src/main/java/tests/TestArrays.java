import java.util.Arrays;

public class TestArrays {


    public static void main(String[] args) {


     /*   int[] numbers;
        numbers = new int[10];
        numbers[0] = 3;
        numbers[2] = 15;
        System.out.println(Arrays.toString(numbers));

       String[] names=new String[5];
       names[2]="Yana";
      //  System.out.println(Arrays.toString(names)); //вывод массива НЭЙМС в строку через стринг
   //     for (int i = 0; i < names.length; i++) {
   //         System.out.println(names[i]);
  //      }

        for (int i = 0; i < names.length; i++) { //itar для вызыва цикла для массивов.
            String name = names[i];
            System.out.println(name);
        }*/


        char[][] cells;
        cells = new char[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = '.';


            }
        }

        //   boolean pl1= true;
//boolean pl2=false;
        //  boolean i;MS16 Rutab.net
        for (int p = 1; p <= 4; p++) {

            //int p=2;
            switch (p) {
                case 1:
                    cells[2][0] = 'X';
                    System.out.println("Player One Do1:" + cells[2][0]);
                    break;
                case 2:
                    cells[2][2] = 'O';
                    System.out.println("Player Two Do:" + cells[2][2]);
                    break;
                case 3:
                    cells[0][1] = 'X';
                    System.out.println("Player One Do:" + cells[0][1]);
                    break;
                case 4:
                    cells[0][0] = 'O';
                    System.out.println("Player Two Do:" + cells[0][0]);
                    break;


                //  default:
                //     System.out.println("12312312");
            }


                          /*   pl1= pl1==true ? false : true;
                                      pl2= pl2==false ? true : false;
                                   System.out.println(pl1);
                                System.out.println(pl2);*/


           for (int row = 0; row < 3; row++) {
                for (int column = 0; column <5; column++) {
                    System.out.print(cells[column][row]);
                }
                System.out.println();
            }

        }
    }
}






