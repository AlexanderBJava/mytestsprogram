package bookKeeping;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int a;
    Book book;
   // Journal journal;
    LibraryManager libraryManager;


    public void zapros(Book book, LibraryManager libraryManager, Journal journal) {
        this.book = book;
      //  this.journal=journal;
        this.libraryManager = libraryManager;

        System.out.println("Введите цифру:");

        System.out.println(" 1 добавить новую книгу");
        System.out.println(" 2 посмотреть инфо по существующей");
        System.out.println(" 3 удалить книгу");
        a = scanner.nextInt();
        scanner.nextLine();

        if (a == 1) {
            System.out.println("Введите название книги:");
            book.name = scanner.nextLine();
            libraryManager.nazv(book);
          //  journal.setPage(350);
          //  journal.numberOfPage();

        }

        if (a == 2) {
            System.out.println(libraryManager.list);

        }
        if (a==3){

            libraryManager.remove();



        }
        if (a > 3 || a < 1) {
            System.out.println("Неверная цифра");

        }

     /*
        } else {
            switch (a) {
                case 1:
                    System.out.println("Введите название книги:");
                    this.book.name = scanner.nextLine();
                    break;
                case 2:
                    System.out.println(libraryManager.list);
                    break;
                default:
                System.out.println("Неверная цифра");
            }
        }*/


    }
}
