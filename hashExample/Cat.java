package hashExample;

import java.util.Comparator;
import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat() {
    }

    public Cat(String name) {
        this.name=name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
       // return super.hashCode();//настоящий хешкод
        return name.length();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
   public int compareTo(Cat anotherCat) {
        return age -anotherCat.age;

    }

    void run(){
        System.out.println("run");
    }
}
