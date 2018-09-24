package testCatsAndPlate;



public class Bowl {
    int bowlmass;


    Cats cat;


    public Bowl(int bowlmass, Cats cat) {
        this.cat = cat;
        this.bowlmass = bowlmass;
    }

    void eatFromBowl() {

        bowlmass=bowlmass-cat.hungry;
        System.out.println("Имя кошки: "+cat.name+"Кол во воды: "+(bowlmass+cat.hungry) +" Голод: "+ cat.hungry+" Остаток воды в тарелке"+bowlmass);
    }

}