package TestSortirovka;

public class testSortirovka {
    public static void main(String[] args) {
        Vvod vvod = new Vvod();
        vvod.vvodchisel();
        Sort sort = new Sort(vvod);
        sort.sortirovka();
        Vivod vivod = new Vivod(vvod);
        vivod.vivodChisla();
        }
}







