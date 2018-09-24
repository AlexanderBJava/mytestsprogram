package testCatsAndPlate;

public class Cats {
    static int count;
    static int plate = 200;

    String name;
    int catId = count;
  //  static int hungry;
    // static int plate1;
   int hungry= (int) (0 + Math.random() * 100);;


    public Cats(String name) {
        this();
        this.name = name;
    }

    public Cats() {

        count++;
    }

    static void numberOfCats() {

        System.out.println(count);
    }

   /* static void eat() {
        hungry = (int) (0 + Math.random() * 100);
        if (plate > hungry) {
            plate = plate - hungry;
            System.out.println(" Тарелка:  " +(Cats.hungry+Cats.plate)+" Голод кошки: "+Cats.hungry+" Остаток тарелки "+ Cats.plate);
        } else {
            System.out.println("Нет еды");
        }
*/



}
