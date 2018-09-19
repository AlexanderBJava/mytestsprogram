package TestSortirovka;

class Sort {


    Vvod vvod;
    Sort(Vvod vvod) {
        this.vvod = vvod;

    }


    void sortirovka() {
        for (int i = 0; i < vvod.chisla.length; i++) {
            for (int j = i + 1; j < vvod.chisla.length; j++) {
                if (vvod.chisla[i] < vvod.chisla[j]) {                            // if (chisla[i] < chisla[j]) {
                    int temp = vvod.chisla[i];
                    vvod.chisla[i] = vvod.chisla[j];
                    vvod.chisla[j] = temp;

                }
            }
        }


    }
}


