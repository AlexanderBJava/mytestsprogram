package aTM;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {

    /*Player player;
    Player player2;



    public BankAccount(Player player) {
        this.player = player;
    }*/

    public BankAccount() {

    }




    Map<Player, Integer> map = new HashMap();

    void setAcc(Player playerN, int sum) {
        if (map.containsKey(playerN)) {
            System.out.println("Sorry");
        } else {

            map.put(playerN, sum);
            System.out.println(map.get(playerN));
        }
    }


    int returnAcc(Player playerN) {


        return map.get(playerN);


    }

    /*@Override
    public String toString() {
        return "BankAccount{" +
                "player=" + player +
                ", player2=" + player2 +
                '}';
    }*/
}
