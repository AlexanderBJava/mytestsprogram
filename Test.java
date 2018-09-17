public class Test {





        public static void main(String args[]){
            int a = 0; // Начальное значение диапазона - "от"
            int b = 10; // Конечное значение диапазона - "до"

            int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
            System.out.println("1-ое случайное число: " + random_number1);

            int random_number2 = a + (int) (Math.random() * b); // Генерация 2-го числа
            System.out.println("2-ое случайное число: " + random_number2);

            int random_number3 = a + (int) (Math.random() * b); // Генерация 3-го числа
            System.out.println("3-е случайное число: " + random_number3);

         //   Следующий код, который выводит в консоль случайное число от 0 до 2:

        //   Random random = new Random();
        //   int a = random.nextInt(3);
         //   System.out.println(a);

         //   Создать же новую точку в вашем методе getRandomPoint() можно, например, следующим образом:

         //   Random random = new Random();
         //   Point point = new Point(random.nextInt(3), random.nextInt(3));


            String text="Hello";
            String text2="Hello";
            String text3="Hel";
            String text4="lo";
            String text5="Hel"+"lo";


            System.out.println(text.equals(text2));
            System.out.println(text2.equals(text3));
            System.out.println(text.equals(text5));

            if(text.equals(text2)){
                System.out.println("Win");
            }

//альт инсерт - генерация  equals



        }

}
