package org.example;

public class Rectangle {

  private point topLeft;
  private point bottomRight;

  public Rectangle() {
    topLeft = new point();
    bottomRight = new point();
  }

  public Rectangle(point topLeft, point bottomRight) {
    this.topLeft = new point(topLeft);
    this.bottomRight = new point(bottomRight);
  }

  public void afficher() {
    System.out.println(
      "Top-left corner: (" + topLeft.getX() + ", " + topLeft.getY() + ")"
    );
    System.out.println(
      "Bottom-right corner: (" +
      bottomRight.getX() +
      ", " +
      bottomRight.getY() +
      ")"
    );
  }

  public int surface() {
    int width = Math.abs(bottomRight.getX() - topLeft.getX());
    int height = Math.abs(bottomRight.getY() - topLeft.getY());
    return width * height;
  }

  public void zoom(int deltaX, int deltaY) {
    topLeft.setX(topLeft.getX() + deltaX);
    topLeft.setY(topLeft.getY() + deltaY);
    bottomRight.setX(bottomRight.getX() + deltaX);
    bottomRight.setY(bottomRight.getY() + deltaY);
  }
}
