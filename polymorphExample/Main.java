package polymorphExample;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      //  Animal animal= new Animal();   Энимал АБСТРАКТНЫЙ и его нельзя создать
        Dinosaur dinosaur= new Dinosaur();
        Cat cat=new Cat();
        Cow cow =new Cow();
        Duck duck= new Duck();




        //animal.setName("Luffy"); Энимал АБСТРАКТНЫЙ и его нельзя создать
       // animal.setAge(5); Энимал АБСТРАКТНЫЙ и его нельзя создать
        dinosaur.setName("Rasty");
      //  System.out.println(animal); Энимал АБСТРАКТНЫЙ и его нельзя создать
        System.out.println(dinosaur);
       // animal.sleep(); Энимал АБСТРАКТНЫЙ и его нельзя создать
        dinosaur.sleep();
       // Animal animal2=dinosaur;
        //animal2.sleep();
        cat.setName("Tomas");
        System.out.println(cat);
        dinosaur.walk();
        duck.walk();
        cat.walk();
        cow.walk();
        Flyable duck2=new Duck();
        duck2.fly();
        cow.eatHerb();
        duck.setName("Utco");
        cow.setName("Burenka");
        Herbivorous herbDuck=  duck;
        herbDuck.eatHerb();
        Flyable flyableDuck=duck;
        flyableDuck.landing();
        ((Duck) duck2).walk(); //ХУЯСЕ вот тут дак2 который хоть и утка но Флайабле сам откастился в утку чтобы походить
                duck.walk();


        System.out.println("!!!!!!!!!!!!!!");
        ArrayList<Animal> list=new ArrayList();
        list.add(duck);
        list.add(cat);
        list.add(cow);
        list.add(dinosaur);
        System.out.println(list);
        //list.notifyAll();
        System.out.println(list.get(2));
        for (int i = 0; i < 4; i++) {
            list.get(i).walk();
        }


    }
}
