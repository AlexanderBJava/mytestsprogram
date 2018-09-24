package aTM;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

     //   ExEheption exEheption= new ExEheption();
     //   exEheption.test();

        Atm atm = new Atm();
        Player player = new Player("Vasia");
        Player player2 = new Player("Kolia");

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAcc(player,1231214);
        bankAccount.setAcc(player,1214);// отсекаетццо if (map.containsKey(playerN)) {
      //                                                      System.out.println("Sorry");
   //                                                           }

        bankAccount.setAcc(player2,214);


         Card card = new MasterCard(player, bankAccount, 1334);//Слева ВСЕГДА ставим предка- не привязываем к конкретному классу.


         atm.insertCard(card);
      // System.out.println(  bankAccount.returnAcc(player));


        atm.insertPin();//проверка пинкода
        // System.out.println("Welcome "+((MasterCard) card).playerName());

        atm.getBalance();
        atm.withdraw();
        atm.rejectCard();
        //  atm.insertCard(card2);
        //    atm.getBalance();
        // bankAccount.acc();


    }
}
