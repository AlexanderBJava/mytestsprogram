package aTM;

public abstract class Card {
    public int amount;
    public int balance;
    private int pin;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public int getAmount() {

        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    //узнать остаток
    public int getBalance() {
        return balance;
    }

    public void pin() {
    }

    //списать часть средств
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;// проверить =-
        } else {
            System.out.println("You dont have so much money.");
        }

    }


}


