package hashExample;

import java.util.LinkedList;
import java.util.List;

public class Hash {

    public static final int SIZE=8;
    public static void main(String[] args) {

        //Cat[] hashArray=new Cat[SIZE];//чтобы не было коллихий- меняем на ЛИСТ.
        List[] hashArray=new List[SIZE];
        for (int i = 0; i < hashArray.length; i++) {//инициализируем Дист хешЭррей ДинкедЛистом
            hashArray[i]=new LinkedList<>();        //
        }

        Cat cat=new Cat("A");
         System.out.println(cat.hashCode());

       // hashArray[cat.hashCode()]=cat;
       int tempHash=cat.hashCode() %SIZE;//Совпал хешКод. коллизия т.к. 8/8 остаток=0
     //   16/8 остаток равен 0 и т. д.
        hashArray[tempHash].add(cat);
        System.out.println("tempHash: " + tempHash);


        Cat cat2=new Cat("123456789");
        System.out.println(cat2.hashCode());
        int tempHash2=cat2.hashCode() %SIZE;//Совпал хешКод. коллизия т.к. 8/8 остаток=0
        //   16/8 остаток равен 0 и т. д.
        hashArray[tempHash].add(cat2);
        System.out.println("tempHash 2: " + tempHash2);



        System.out.println(hashArray[tempHash]);//выведет массив под номером темп
        // хэш (1) : [Cat{name='A'}, Cat{name='123456789'}]
        System.out.println(hashArray[tempHash].indexOf(cat2));//уважет что в массиве рэшАррэй
        // в ячейке темп Хэшь кошка2 находится под индексом (1) во внутреннем ЛинкедЛисте

        tempHash2=cat2.hashCode() %SIZE;
        List list=hashArray[tempHash2];
        System.out.println(list.indexOf(cat2));

        System.out.println(list.get(1));






    }
}
