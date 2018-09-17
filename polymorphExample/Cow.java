package polymorphExample;

public class Cow extends Animal implements Herbivorous {

    @Override
    void walk() {
        System.out.println("Коровка ходит.");
    }

    @Override
    public void eatHerb() {
        System.out.println("Есть ТРАВУ.");
    }
}
