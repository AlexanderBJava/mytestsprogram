public class TestIfSwitchWhileFor {
    public static void main(String[] args) {
        //       testIf();  // Иф выполняется только один раз
        //      testSwitch(5);
       // testWhile();   //While отличается от If тем что проверяет условие постоянно. Иф- только один раз (бегунец).
        //    testDoWhile();  //работает так же как Вайл но ПЕРВЫЙ раз проходит ОБЯЗАТЕЛЬНО.
        //testFor();//Более логичная команда чем Вайл. Для цеочисленного x равного 0 пока выполняется что он меньше или равен 23
        //делать x++ и то что в {} x++ типа внизу {}
        testTern(); //поворотный(переворачивающий) вариант. переменная = логическое выражение ? да=фолс(переворот первым условием) : нет=тру(оставляем как есть).
    }
  //поворотный(переворачивающий) вариант. переменная = логическое выражение ? да=фолс(переворот первым условием) : нет=тру(оставляем как есть).
    private static void testTern() {
        int i= 10;
        i= i>0 ? -i : i;
        System.out.println(i);
        //более полезная фича- сравнение двух чисел и вывод "большего"
        int k=10;
        int j=20;
        i=k>j ? k : j;
        System.out.println(i);
    }
  /*  //Более логичная команда чем Вайл. Для цеочисленного x равного 0 пока выполняется что он меньше или равен 23
    //делать x++ и то что в {} x++ типа внизу {}
    private static void testFor() {
        for (int x = 0; x <= 23; x++ ) {
            System.out.println(x + "Nice");
        }*/


  }

 /*   //работает так же как Вайл но ПЕРВЫЙ раз проходит ОБЯЗАТЕЛЬНО.
    private static void testDoWhile() {
        int x=30;
        do {
            System.out.println(x);
            x++;
        }while (x < 20);
    }*/

 /*   //While отличается от If тем что проверяет условие постоянно. Иф- только один раз (бегунец).
    private static void testWhile() {
        int x = 9;
        while (x > 0) {
            System.out.println(x + "WhileOk");
            x -= 1;    //тоже самое что и x= x - 1;   если на единицу то  x--; или x++;
        }
    }*/

  /*   static void testSwitch(int grade) {

        switch (grade){
            case 5:
                System.out.println("5!");
                 break;
            case 4:
                System.out.println("4!");
                break;
            case 3:
                System.out.println("3!");
                break;
            default:    //выполняет все остальные значения кроме указанных в Кэйс
                System.out.println("hueta");

        }
    }*/

  /*    // Иф выполняется только один раз
        static void testIf() {
        int hp=100;
        int damage=50;
        if (hp <= damage){
            System.out.println("Killed");
        }else{
            System.out.println("ranen");
        }*/
    //}

