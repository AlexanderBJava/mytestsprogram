package TestSortirovka;

class Vivod {

    Vvod vvod;

//конструктор


    Vivod(Vvod vvod) {
        this.vvod = vvod;
    }


    void vivodChisla() {
        System.out.print("Массив, упорядоченный по убыванию = [");
        for (int elem : this.vvod.chisla) {
            System.out.print(elem + " ");
        }
        System.out.println("]");
    }

}


