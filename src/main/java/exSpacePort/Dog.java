package exSpacePort;

public class Dog implements Launchable{
    private String dogName;

    public Dog() {
    }

    public Dog(String dogName) {
        this.dogName=dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void launch() {
        System.out.println(dogName+" В космосе!");
    }
}
