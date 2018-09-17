package polymorphExample;

public class Cat extends Animal {
    String name="_";

    public Cat(String name) {
        this.name=name;
    }

    public Cat() {

    }


    @Override
    void walk() {
        System.out.println("Котэ бежит.");
    }
}
