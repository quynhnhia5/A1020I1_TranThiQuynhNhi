package interface_resizeable;
import geometric.Square;
public class SquareResize extends geometric.Square implements Resizeable {

  public SquareResize() {
  }

  public SquareResize(double side) {
    super(side);
  }

  public SquareResize(double side, String color, boolean filled) {
    super(side, color, filled);
  }
  public void resize(double percent){
    this.setSide((this.getSide()*(100+ percent))/100);
  }
}
