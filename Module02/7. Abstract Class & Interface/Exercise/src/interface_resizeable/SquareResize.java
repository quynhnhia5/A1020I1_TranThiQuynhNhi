package interface_resizeable;
import geometric.Square;
public class SquareResize extends geometric.Square implements Resizeable {
  protected double getSize;
  protected double side;

  public SquareResize() {
  }

  public SquareResize(double side) {
    super(side);
  }

  public SquareResize(double side, String color, boolean filled) {
    super(side, color, filled);
  }
  public void resize(double percent){
    this.side+=(this.getSide()*percent)/100;
  }
}
