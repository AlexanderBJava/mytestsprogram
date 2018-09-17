package aTM;

public class MasterCard extends Card {
    Player player;
    BankAccount bankAccount;

    public MasterCard(Player player, int amount) {
      balance  =amount;
    }


    public MasterCard(Player player, BankAccount bankAccount, int pin) {
        this.player=player;
        this.bankAccount=bankAccount;
       // this.pin=pin;
        setPin(pin);
        balance=bankAccount.returnAcc(player);
    }
    String playerName(){
       // System.out.println(player.name);
        return player.name;
    }

}
