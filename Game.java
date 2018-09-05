package krestikiNolokiOOP;


import krestikiNolokiOOP.model.Player;
import krestikiNolokiOOP.model.Point;

public class Game {

    Field field;
    Player player;
    Player player2;

    Shoot shoot;
    Menu menu;
    Point point;

    public void init() {

        field = new Field();
        player = new Player(field);
        player2 = new Player(field);
        menu = new Menu(field,player);
        shoot = new Shoot(player, field,menu);

        point=new Point();

    }


    public void start() {
        field.fieldCreate();


        //player.askName();

       // player2.askName();
        shoot.shoot();
      // menu.winCond();
    }
}
