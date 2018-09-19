package polymorphExample;

public class Dinosaur extends Animal {

    public Dinosaur() {
    }

    @Override
    void walk() {
        System.out.println("Динозавр топает.");
    }

    @Override
    void sleep() {
        //super.sleep();
        System.out.println("Dinosaur sleep");
    }
}
