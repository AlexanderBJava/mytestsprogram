package hashExample;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        List<Cat> cats=new ArrayList<>();
        cats.add(new Cat("Murka", 3));
        cats.add(new Cat("Tom", 50));
        cats.add(new Cat("Jerry", 4));

        //Set<Cat> catSet=new TreeSet<>();
       // Set<Cat> catSet=new TreeSet<>(new CatCorporator());
        Set<Cat> catSet=new TreeSet<>(new Comparator<Cat>(){
            @Override
            public int compare(Cat cat1, Cat cat2) {
                return cat1.getAge()-cat2.getAge();
            }
        }
        );


        catSet.addAll(cats);
       // System.out.println(cats);
        System.out.println(catSet);

     /*   Cat cat=new Cat("ere", 5);
        cat.run();
        Cat anon =new Cat(){
            @Override
            void run(){
                System.out.println("fsdfsfsdfs");
            }
        };
        anon.run();*/



    }


}
