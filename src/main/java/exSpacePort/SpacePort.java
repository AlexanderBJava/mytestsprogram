package exSpacePort;

public class SpacePort {
    ControlRoom controlRoom;
    Launchable launchable;
    Landingable landingable;
    public SpacePort() {

    }



    public SpacePort(ControlRoom controlRoom) {
        this.controlRoom=controlRoom;

    }

    void setLauchableDevice (Launchable launchable){
        this.launchable=launchable;
        controlRoom.currentLaunchable=launchable;
    }
    void setLandinableDevice(Landingable landingable){
        this.landingable=landingable;
        controlRoom.currentLandingable=landingable;
    }
}
