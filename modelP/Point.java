package krestikiNolokiOOP.model;

import java.util.Random;

public class Point {
    private int x;
    private  int y;
    Random random = new Random();



    public Point(int x) {
        this.x = x;

    }
    public Point() {
    }

    public Point(int finalJ, int finalI) {
        this.x=finalJ;
        this.y=finalI;
    }

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

    /*  public  int getRandomPoint(){

                    int a = random.nextInt(3);
                    System.out.println(a);

                    return a;
                }*/
  public Point getRandomPoint(){
      Random random = new Random();
      //Point point = new Point(random.nextInt(3), random.nextInt(3));
      Point point = new Point(random.nextInt(3));

      return point;

  }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
