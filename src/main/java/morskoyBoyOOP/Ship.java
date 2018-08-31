package morskoyBoyOOP;

import java.util.Random;

public class Ship {

    private String shipName;
    Field field;

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }


    public Ship() {
    }

    public Ship(Field field) {
        this.field=field;

    }


    public void setShipPosition(){
    Random random = new Random();
    int a = random.nextInt(5);
    int b = random.nextInt(3);
    field.getCells() [a][b]='O';

    //System.out.println(a);
   // System.out.println(b);

}










}
