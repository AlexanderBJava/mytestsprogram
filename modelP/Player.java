package krestikiNolokiOOP.model;


import krestikiNolokiOOP.Field;

import java.util.Scanner;

public class Player {
    private static Point point;
    public String playerName;
  public   int playerNumber = 1;
    Field field;
    Scanner scanner = new Scanner(System.in);


    public Player(Field field) {
        this.field = field;
    }

    public static void setPoint(Point point) {
        Player.point = point;
    }

    public static Point getPoint() {
        return point;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public void askName() {
        System.out.println("Ведите имя");
        String a = scanner.nextLine();
        setPlayerName(a);
        System.out.println(getPlayerName() + "!" + " Welcome to game!!!");
    }
}
