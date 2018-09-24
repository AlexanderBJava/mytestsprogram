package exSpacePort;

public class SpaceShip implements Launchable, Landingable {










    @Override
    public void launch() {
        System.out.println("Корабль полетел!!!");

    }

    @Override
    public void landing() {
        System.out.println("Корабль приземлился!!!");
    }
}
