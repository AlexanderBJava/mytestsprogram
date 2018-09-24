package bookKeeping;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    Book book;
  //  Journal journal;
    ArrayList list=new ArrayList();
    Scanner scanner=new Scanner(System.in);
    int a;
 /*
 //  Сеттеры и геттеры для приватной переменной b. ищутся по set и get соответственно.
    private int b;


    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }
    */

    public void nazv(Book book){
this.book=book;
   list.add(book.name);
  //  System.out.println(list);

   // return book.name;
}


    public void remove() {
        System.out.println("Список книг:");
        System.out.println(list);
        System.out.println("введите номер книги от 1 до "+list.size());

        a = scanner.nextInt();
        scanner.nextLine();
        if ((a<(list.size()+1)) && a>0){
        list.remove(a-1);
        System.out.println(list);
        }else {
            System.out.println("Нет книги с таким номером!!!");
        }

    }
}
