package arrayList;


import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        Collection collection;
        List list;   //Список: присутствует очередность, могут повторятся. (как в очереди к еде)
        //Set set;//Множество: НЕТ очередности(бардак), НЕ могут повторятся- все уникальны. (как кубики в коробке)
        ArrayList arrayList;// - это массив. изначальный размер-10. При добавлении 11 элемента увеличивается в 1.5 раза. (побитовый сдвиг).
        //при удалении элементов размеры массива не уменьшаются.
        LinkedList linkedList;//Это другая реализация списка. Не чарез массив, а через СВЯЗАННЫЙ СПИСОК.
        Set set =new HashSet();
        Cat tom = new Cat("Tom");
        List<Cat> cats = new LinkedList<>();

        Cat jerry=new Cat("Jerry");
        cats.add(jerry);
        cats.add(new Cat("Jeff"));
        cats.add(tom);
        cats.add(new Cat("John"));
        cats.add(new Cat("Jerronimo"));

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        Iterator<Cat> iterator = cats.iterator();
        System.out.println(cats);
       while (iterator.hasNext()) {
            Cat next = iterator.next();
            if (next == tom) {
                iterator.remove();
                }

        }
        //REMOVEIF Лямбда для удаления пришедшего элемента равного jerry
      //  System.out.println(cats);
       // cats.removeIf(c -> c ==tom);
       // cats.removeIf(c -> c ==jerry);


        System.out.println(cats);
       set.add(234);
       set.add(2343);
       set.add(2345);

        System.out.println(set);
       set.clear();
        System.out.println(set);













    }


    Map map;


}

