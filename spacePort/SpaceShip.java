package spacePort;

public class SpaceShip implements Launchable {
    private String shipName;
    private int speed;
    Pilot pilot;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }




    public SpaceShip(String shipName, Pilot pilot) {
        this.shipName=shipName;
        this.pilot=pilot;

    }

    public String getName() {
        return shipName;
    }

    public void pilotName(){
        System.out.println(pilot.getName());


    }
    public void launch(){
        System.out.println("Взлетели!!!");
    }
    public void landing(){
        System.out.println("Приземлились!!!");
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "shipName='" + shipName + '\'' +
                ", speed=" + speed +
                ", pilot=" + pilot +
                '}';
    }
}
