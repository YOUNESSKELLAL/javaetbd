package org.example;

public class Main {

  public static void main(String args[]) {
    point point1 = new point(1, 2);
    point point2 = new point(4, 5);

    Rectangle rectangle = new Rectangle(point1, point2);

    System.out.println("Original Rectangle:");
    rectangle.afficher();
    System.out.println("Area: " + rectangle.surface());
    rectangle.zoom(2, 2);
    System.out.println("Zoomed Rectangle:");
    rectangle.afficher();
    System.out.println("Area after zoom: " + rectangle.surface());
  }
}
