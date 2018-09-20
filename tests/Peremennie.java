public class Peremennie {
Byte bt=10;
Integer i=20;
Short s=30;
Long l=40L;

Float f=10.3F;
Double d=15.6;
String st="Hello";




    public static void main(String[] args) {
        System.out.println("Byte.MIN_VALUE" + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE" + Byte.MAX_VALUE);

        System.out.println("Integer"+ Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        Character c = Character.MAX_VALUE;
        System.out.println((int) c);


     //   public class Test1 { // Ctrl-Shift-Enter или Cmd-Shift-Enter
     //       public static void main(String[] args) {
                // СТЕК
                // в массивах можно хранить только примитивные типы данных
//        testStackOverflow(10); // Alt-Enter
//        testStackOverflow(); // Alt-Enter

                byte bt; // 1
                short sh; // 2
                int i = 2147483647; // 4
                long l = 4000000000L; // 8

                float f = 10.2f; // 4
                double d = 10.2; // 8

                boolean b = true; // 4

                char ch = 'E'; // 2 // единственный беззнаковый тип данных

                // КУЧА
                // ссылочные типы данных
                // все, что пишем с большой буквы + массивы
                // экземпляры классов

                Byte bt1 = 10;
                Byte bt2 = new Byte((byte) 10);
                Short sh1 = 10;
                Integer in1 = 10;
                Long l1;

                Float f1;
                Double d1;

                Boolean b1;
                Character ch1;

                String s = "hello";

                // "A" - всегда тип String
                // 'A' - всегда тип char

                System.out.println(Integer.MAX_VALUE);

            }

            private static void testStackOverflow() {
                System.out.println("no params");
            }

            static void testStackOverflow(int i) { // 10802 чтобы память переполнилась в СТЕКЕ
                // sout + Tab
                System.out.println(i);
                testStackOverflow(i + 1);
            }
        }
     //   for (char c = 0; c < Character.MAX_VALUE; c++) {
     //       System.out.print(c);
      //      if (c % 80 == 0) { // через каждые 80 символов делаем перенос строки для читабельности
     //           System.out.println();
    //        }
     //   }


        // System.out.println(String.);
       // System.out.println(String.MAX_VALUE);













