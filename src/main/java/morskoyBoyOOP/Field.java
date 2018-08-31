package morskoyBoyOOP;

public class Field {
    private int x = 5;
    private int y = 3;
    private char[][] cells = new char[x][y];
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char[][] getCells() {
        return cells;
    }

    public void setCells(char[][] cells) {
        this.cells = cells;
    }

    public void createField() {


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = '.';
            }
        }


    }
    public void paintField(){

        for (int row = 0; row < y; row++) {
            for (int column = 0; column < x; column++) {
                System.out.print(cells[column][row]);
            }

            System.out.println();

        }

    }






}

