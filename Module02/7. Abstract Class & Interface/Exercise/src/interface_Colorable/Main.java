package interface_Colorable;

import geometric.Circle;
import geometric.Rectangle;

public class Main {
  public static void main(String[] args) {
    Colorable [] colorable= new Colorable[3];
    colorable [0]= (Colorable) new Circle(3);
    colorable[1]= (Colorable) new Rectangle(2,3);
    colorable[2]= new SquareColor(3);
    for (Colorable colorable: colorable) {
      System.out.println(colorable.getarea());
      if(colorable==colorable){
        colorable.howToColor();
      }
    }

  }
}
