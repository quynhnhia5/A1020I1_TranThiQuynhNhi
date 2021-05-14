package interface_resizeable;

public class Main {
  public static void main(String[] args) {
    Resizeable[] resizeable = new Resizeable[3];
    resizeable[0] = new CircleResize(20);
    resizeable[1] = new SquareResize(2);
    resizeable[2] = new RectangleResize(9, 11);
    System.out.println("Pre-sorted:");
    for (Resizeable resizable : resizeable) {
      System.out.println(resizable);
    }
    System.out.println("After-sorted:");
    for (Resizeable resizable : resizeable) {
      resizable.resize(30);
      System.out.println(resizable);
    }


  }

}
