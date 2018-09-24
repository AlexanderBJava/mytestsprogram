package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats=new ArrayList<>();

        Cat barsik=new Cat("Barsik");

        cats.add(new Cat("Tom"));
        cats.add(new Cat("Jerry"));
        cats.add(new Cat("John"));
        cats.add(barsik);
        cats.add(new Cat("Jenniffer"));
        cats.add(new Cat("Jordan"));
        //System.out.println(cats);
       // for (Cat cat:cats) {
      //      System.out.println(cat);
      //      cats.remove(2);
      //      System.out.println(cat);

     //   }

       // cats.remove(2);
        Iterator<Cat> iterator=cats.iterator();
        //System.out.println(cats);
       while (iterator.hasNext()){
           Cat next=iterator.next();
           System.out.println(next);
           if(next==barsik){
                iterator.remove();
            }
        }
        System.out.println(cats);







    }
}
