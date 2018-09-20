package bookKeeping;

public class Book {
    String name;

    public Book(){   //пустой конструктор для того чтобы не поломались классы потомков. альт+инсерт затем "селект нон"
    }


    void drop(){
        System.out.println("Booom");
    }





}



