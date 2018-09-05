package krestikiNolokiOOP.controller;

import krestikiNolokiOOP.Shoot;
import krestikiNolokiOOP.model.Player;
import krestikiNolokiOOP.model.Point;
import krestikiNolokiOOP.viev.GameWindow;

public class GameController {

    static GameWindow gameWindow;
    public GameController(GameWindow gameWindow1){
        gameWindow=gameWindow1;
    }

    public static void doShoot(Point point, String X) {
        Player.setPoint(point);
    }

    public static void peredayButtonText(String buttonText) {
        Shoot.setButtonText(buttonText);
        System.out.println(buttonText);
    }

    public static void onButton(String yes) {
     gameWindow.setYes(yes);
     // System.out.println(yes);
   }
}
