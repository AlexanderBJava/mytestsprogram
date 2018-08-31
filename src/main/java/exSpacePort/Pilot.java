package exSpacePort;

public class Pilot {


    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Pilot() {
    }

    private String pilotName;

    public Pilot(String pilotName) {
        this.pilotName=pilotName;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "pilotName='" + pilotName + '\'' +
                '}';
    }
}
