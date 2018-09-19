package krestikiNolokiOOP;

import krestikiNolokiOOP.model.Player;

public class Menu {
   // Shoot shoot;
    Field field;
    Player player;
    public Menu() {
    }



    public Menu( Field field, Player player) {
       // this.shoot=shoot;
        this.field=field;
        this.player=player;
    }

    public void winCond (){
        if (field.field[0] == field.field[1] && field.field[1] == field.field[2] && (field.field[0] == 'X' || field.field[0] == 'O')) { //|| (field[3]== field[4] && field[4]== field[5]) || (field[6]== field[7]&&      field [7] == field[8])){
            System.out.println("Поздравляю с победой игрок номер " + player.playerNumber);
         //   break;
        } else {
            if (field.field[3] == field.field[4] && field.field[4] == field.field[5] && (field.field[5] == 'X' || field.field[5] == 'O')) { //|| (field[3]== field[4] && field[4]== field[5]) || (field[6]== field[7]&&      field [7] == field[8])){
                System.out.println("Поздравляю с победой игрок номер " + player.playerNumber);
               // break;
            } else {

                if (field.field[6] == field.field[7] && field.field[7] == field.field[8] && (field.field[7] == 'X' || field.field[7] == 'O')) { //|| (field[3]== field[4] && field[4]== field[5]) || (field[6]== field[7]&&      field [7] == field[8])){
                    System.out.println("Поздравляю с победой игрок номер " + player.playerNumber);
                   // break;
                }
            }




        }

        boolean hasEmpty = false;
        for (char c : field.field) {   //выражение "for each", используется в тех случаях когда тебе надо перебрать объекты которые являются массивами или коллекциями
            if (c == '_') {
                hasEmpty = true;
                break;
            }
        }
        // если пустых ячеек не осталось, то значит ничья
        if (!hasEmpty) {
            System.out.println();
            System.out.println("!!!НИЧЬЯ!!!");

        }

    }
}


