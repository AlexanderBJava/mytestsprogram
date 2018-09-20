package spacePort;

public class MissionControlRoom {
    private int stuffAmount;
    Launchable ship;//если спейсшип имплиментит интерфейс Лаунчабле то можно делать так.

    public MissionControlRoom(Launchable launchable) {
        this.ship=launchable;
    }



    public int getStuffAmount() {
        return stuffAmount;
    }

    public void setStuffAmount(int stuffAmount) {
        this.stuffAmount = stuffAmount;
    }

    public void launch(){
        if(countDown()){

            ship.launch();
        }

    }
    public boolean countDown(){
        for (int i = 10; i >=0 ; i--) {
            System.out.println(i);
            pause();
        }
        System.out.println("START");
        return true;
    }
//!!!!!!!!!!! метод сделать паузу в операторе ФОР с помощью метода паус.
    private void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

