package morskoyBoyOOP;

public class Game {
    Field field;
      Ship ship;
      Ship ship2;
    Menu menu;
     Player player;
     Player player2;



    public void gameInit() {
        field=new Field();
        ship=new Ship(field);
        ship2=new Ship(field);
        menu=new Menu(player);
        player=new Player(field);
        player2=new Player(field);

    }


    void theGame() {
      // player.welcome();
      //  player2.welcome2();

      //  System.out.println(player.getPlayerName());
     //   System.out.println(player2.getPlayerName());

        field.createField();
        field.paintField();
        System.out.println("***********************");


        ship.setShipPosition();
        ship2.setShipPosition();
       player.shoot();

        field.paintField();
        System.out.println( player.getPlayerName()+"  WIN!!!");
    }





}



