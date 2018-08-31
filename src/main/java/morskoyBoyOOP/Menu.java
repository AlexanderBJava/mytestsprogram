package morskoyBoyOOP;

import java.util.Scanner;

public class Menu {
    Player player;
    Player player2;

    String a="_";
    Scanner scanner=  new Scanner(System.in);

    public Menu(Player player) {
        this.player=player;
    }
    public void welcome (){
        System.out.println("Hello! Player 1 wats your name?");
       // player.setPlayerName(scanner.nextLine());
      //  player.getPlayerName(scanner.nextLine())

    }
    public void welcome2 (){
        System.out.println("Hello! Player 2 wats your name?");
        player2.setPlayerName(scanner.nextLine());

    }





}
