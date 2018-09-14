import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayLTest {
    public static void main(String[] args) {

       // ArrayList<Integer> list=new ArrayList<Integer>(); второй Integer не обязателен после Джавы 6
        ArrayList<Integer> list=new ArrayList();  //опредеяем тип переменных в эррейЛисте.
        //ArrayList<Person> list=new ArrayList();  помещение в эррейлист заранее объявленного класса Person


        list.add(20);
        list.add(33);
        list.add(23545);
        list.add(23545);//Ctrl+D   дублирует строки


       // list.add(20.32);
      //  list.add("Test");
        //list.remove(3);
        System.out.println(list);
        System.out.println(list.get(0));


        //мжоно работать с экземплярами класса добавляя (экземплКласса) в add()
        //можно удалять командой .remove











    }
}
