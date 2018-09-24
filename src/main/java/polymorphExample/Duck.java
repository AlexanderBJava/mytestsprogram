package polymorphExample;

public class Duck extends Animal implements Flyable, Herbivorous {  //утка ОБЯЗАНА использовать все методы интерфейса.

    @Override
    void walk() {
        System.out.println("Утка идет.");
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void landing() {
        System.out.println("Утка приземляется");
    }

    @Override
    public void eatHerb() {
        System.out.println("Есть траву!!!!!!!.");

    }
}
