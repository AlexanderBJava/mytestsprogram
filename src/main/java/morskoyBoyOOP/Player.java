package morskoyBoyOOP;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String playerName;
    Field field;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public Player(Field field) {
        this.field = field;
    }

    public Player() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public void shoot() {


        int a = random.nextInt(5);
        int b = random.nextInt(3);
        field.getCells()[a][b] = 'X';


    }

    public void welcome() {
        System.out.println("Hello! Player 1 wats your name?");
        playerName = scanner.nextLine();

    }

    public void welcome2() {
        System.out.println("Hello! Player 2 wats your name?");
        playerName = scanner.nextLine();

    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                '}';
    }
}
