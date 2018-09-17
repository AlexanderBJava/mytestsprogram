package aTM;

import java.util.Scanner;

public class Atm {
    private Card currentCard;
    Player player;

    public Card getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(Card currentCard) {
        this.currentCard = currentCard;
    }

    void insertCard(Card card){
        //System.out.println("Please insert your Card!");
        if (currentCard==null){
        currentCard=card;
            System.out.println("Welcome!");
        }else {
            System.out.println("CardReader not empty");
        }

    }

    void rejectCard(){
        if (currentCard!=null) {
            currentCard=null;
            System.out.println("Cart reject! Dont forget your card!");
        } else {
            System.out.println("Insert Card");
        }
    }

    void insertPin(){
        System.out.println("insert PIN:");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if (currentCard.getPin()==a){
            System.out.println("Correct PIN.");
        }else {
            System.out.println("INCORRECT PIN");
            rejectCard();

        }

    }



    void getBalance(){

        if (currentCard!=null) {
           System.out.println("Your current balance: "+ currentCard.getBalance());
        }else{
            System.out.println("Insert Card");
        }
    }

    void withdraw(){
        if (currentCard!=null) {
            // System.out.println("Enter Card balance");
            Scanner scanner=new Scanner(System.in);
            //  int tempBalance=scanner.nextInt();
            //  String temp=scanner.nextLine();
            // currentCard.getBalance(tempBalance);
            // System.out.println(currentCard.getBalance());

            System.out.println("How much money do you need?");


            int amount=scanner.nextInt();

            currentCard.withdraw(amount);
            System.out.println("Current Card balance: "+ currentCard.getBalance());
        } else {
            System.out.println("Insert Card");
        }

    }



}
