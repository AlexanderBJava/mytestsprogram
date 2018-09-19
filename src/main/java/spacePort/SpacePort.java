package spacePort;

public class SpacePort {
    MissionControlRoom missionControlRoom;


    Launchable ship;

    void initWithSpaceShip(Launchable launchable){
        this.ship=launchable;
     //   missionControlRoom.currentShip=spaceShip;
    }

}
