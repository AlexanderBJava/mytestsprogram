package krestikiNolokiOOP;

import krestikiNolokiOOP.controller.GameController;
import krestikiNolokiOOP.model.Player;
import krestikiNolokiOOP.viev.GameWindow;

import java.util.Scanner;

public class Shoot {

    Scanner scanner = new Scanner(System.in);
    Player player;
    Player player2;
    Menu menu;
    Field field;
    private static String buttonText;
    public  Shoot(Player player, Field field,Menu menu) {
        this.player = player;
        this.field = field;
        this.menu=menu;
    }

    public static void setButtonText(String buttonText) {
        Shoot.buttonText = buttonText;

    }




    public void shoot() {
        while (true) {


            System.out.println("Игрок " + player.playerNumber + " введите номер ячейки от 1 до 9");
            System.out.println(buttonText);
            String yes="YES";
            GameController.onButton(yes);


            int a = scanner.nextInt();
            int nomer = a - 1;
            String temp = scanner.nextLine();

            if (nomer < 9 && nomer >= 0 && player.playerNumber > 0 && player.playerNumber < 2) {

                char userLetter = 'X';
                if (field.field[nomer] == '_') {
                    field.field[nomer] = userLetter;
                    field.showField();
                } else {
                    System.out.println("Занято");
                }

            } else {

                char userLetter = 'O'; //symb.charAt(0);

                if (field.field[nomer] == '_') {
                    field.field[nomer] = userLetter;
                    field.showField();
                } else {
                    System.out.println("Занято");
                }

            }
            menu.winCond();
            player.playerNumber = (player.playerNumber == 1) ? 2 : 1;



        }
    }


}
