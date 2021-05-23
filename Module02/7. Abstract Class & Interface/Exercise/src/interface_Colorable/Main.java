package interface_Colorable;

import geometric.Circle;
import geometric.Rectangle;
import geometric.Shape;

public class Main {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[4];
    shapes[0] = new Circle(); //explicit cast
    shapes[1] = new Rectangle();
    shapes[2] = new SquareColor();

    for (Shape shape : shapes) {
      System.out.println("Area: " + shape.getArea());

      if (shape instanceof Colorable){
        ((Colorable) shape).howToColor();
      }
    }
  }
}
