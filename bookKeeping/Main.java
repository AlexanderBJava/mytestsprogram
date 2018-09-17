package bookKeeping;


public class Main {
    public static void main(String[] args) {

       Book book = new Book();
        Journal journal=new Journal();
        Menu menu = new Menu();
        LibraryManager libraryManager = new LibraryManager();
     //  Book book2=new Journal(); создание книги 2 которая является журналом
        while (true) {
            menu.zapros(book, libraryManager,journal);
        }
     // book.drop();
      //  journal.drop();
       // book2.drop();
      //  System.out.println(book instanceof Journal);  //проверка является ли переменная частью класса.


    }
}
