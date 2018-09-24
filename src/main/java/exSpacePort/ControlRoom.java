package exSpacePort;

public class ControlRoom {
   // SpaceShip ship;
    Launchable currentLaunchable;
    Landingable currentLandingable;

    public ControlRoom(Launchable launchable) {
       // this.ship=ship;
        this.currentLaunchable=launchable;

    }

    public void launch() {
        if (countDown()){
            currentLaunchable.launch();


    }


}

     boolean countDown() {

        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
         //   pause();
        }
        System.out.println("Start");
        return true;
    }


    void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void landing() {
        if (countDownToLand()) {
            currentLandingable.landing();


        }


    }


    boolean countDownToLand() {

        for (int i = 3; i >= 0; i--) {
            System.out.println(i);

        }
        System.out.println("Landing");
        return true;
    }
}
