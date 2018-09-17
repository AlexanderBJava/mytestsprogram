package polymorphExample;

public abstract class Animal {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Animal() {
    }

    void sleep() {
        System.out.println("im sleeping");
    }

    void feed() {

    }
    abstract void walk();  //создает абстрактный метод который ДОЛЖЕН быть определен у потомков.


    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }

}
