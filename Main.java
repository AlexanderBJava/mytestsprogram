package krestikiNolokiOOP;


import krestikiNolokiOOP.controller.GameController;
import krestikiNolokiOOP.viev.GameWindow;

import javax.swing.*;

public class Main  {



    public static void main(String[] args)  {

        GameWindow gameWindow=new GameWindow();

       // GameController gameController=new GameController(gameWindow);
        gameWindow.init();

//        SwingUtilities.invokeAndWait(new Runnable() {
//            @Override
//            public void run() {
//                new  Main();
//            }
//        });
//
        Game game=new Game();
       game.init();

        game.start();

    }


}
