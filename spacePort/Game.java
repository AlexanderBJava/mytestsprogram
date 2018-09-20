package spacePort;

public class Game {
    Pilot pilot=new Pilot("Petya");
    Pilot pilot2=new Pilot("Kesha");
    SpaceShip ship=new SpaceShip("Rocket", pilot);
    MissionControlRoom missionControlRoom;
    SpacePort spacePort;
    SpaceRocket rocket=new SpaceRocket();


    public void pName(){
       pilot.getName();
       System.out.println(pilot2);
        System.out.println(ship);
     //  missionControlRoom.countDown();
    }


    public void init() {
        spacePort=new SpacePort();
        spacePort.initWithSpaceShip(ship);
        MissionControlRoom missionControlRoom=new MissionControlRoom(ship);
        spacePort.missionControlRoom=missionControlRoom;
    }

    public void start() {
        spacePort.missionControlRoom.launch();
    }
}
