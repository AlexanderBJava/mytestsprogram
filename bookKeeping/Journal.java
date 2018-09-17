package bookKeeping;

public class Journal extends Book {
    private int page;
    // super()    конструктор класса-предка.
    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    void numberOfPage(){
        System.out.println(getPage());
    }

    @Override
    void drop() {
        //super.drop();
        System.out.println("plux");
    }
// void drop(){  //переопределение метода родителя дроп.
    //    System.out.println("plux");
  //  }
}
