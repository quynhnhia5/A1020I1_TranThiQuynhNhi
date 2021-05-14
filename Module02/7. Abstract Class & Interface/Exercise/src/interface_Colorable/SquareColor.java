package interface_Colorable;

import geometric.Square;

public class SquareColor extends Square implements Colorable {
  public SquareColor() {
  }

  public SquareColor(double side) {
    super(side);
  }

  public SquareColor(double side, String color, boolean filled) {
    super(side, color, filled);
  }
  public void howToColor(){
    System.out.println("Color all four sides");
  }
}
