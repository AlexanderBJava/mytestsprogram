package ex3;




public class Main {


    public static void main(String[] args) {
        final int SIZE = 10;

       //массив !!!!ДЛЯ!!!! целых кошек
        Cat[] cats= new Cat[SIZE];//Создали класс (Загон для 10 кошек) НО НЕ КОШЕК!!!

        cats[0]=new Cat("Tom",4,2); //ОБЪЕКТ иил ЭКЗЕМПЛЯР КЛАССА Cat (кошка номер НОЛЬ. из загона Cat[SIZE])
        cats[0].mur();// кошка Ноль делает то что умеют кошки из загона Cat[SIZE]: Мурчит)
        //cats[0].name="Tom";//присваиваем кошке номер Ноль имя ТОМ.
       // cats[0].age = 4;
       // cats[0].weight = 2;

       /* !!!!! Старый вариант до изменения КОНСТРУКТОРА Кэт!!!!!!
        cats[1]=new Cat();
        cats[1].name="Jerry";//присваиваем кошке номер ОДИН имя ДЖЕРРИ.
        cats[1].age = 12;
        cats[1].weight = 8;*/

        System.out.println(cats[0].weight); // Вес до операции кормления
        System.out.println(feedCat(cats[0]));//передаем АДРЕС В ПАМЯТИ где хранится кошка, НО НЕ КОШКУ.
        System.out.println(cats[0].weight); // вес после выполнения feedCat(cats[1])


    }

    private static String feedCat(Cat cat) {
        if (cat.age>10){
            cat.weight+=1;

        }else {
            cat.weight+=2;
        }
        return cat.name + " вес стал " + cat.weight;
    }

    //  private static String feedCat(cat) {

      //  return null;
   // }

}
