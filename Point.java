package org.example;

public class point {

  private int x;
  private int y;

  public point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public point() {}

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void deplacer(int X, int Y) {
    this.x = this.x + X;
    this.y = this.y + Y;
  }

  public void reset() {
    this.x = 0;
    this.y = 0;
  }

  public double distance(point b) {
    int xDiff = this.x - b.getX();
    int yDiff = this.y - b.getY();
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

  public static double distance(point a, point b) {
    int xDiff = a.getX() - b.getX();
    int yDiff = a.getY() - b.getY();
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

  public boolean equals(Object a) {
    return (this.x == ((point) a).x && this.y == ((point) a).y);
  }
}
