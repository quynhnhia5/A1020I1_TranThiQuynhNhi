package interface_resizeable;
import geometric.Rectangle;
public class RectangleResize extends geometric.Rectangle implements Resizeable {
  public RectangleResize() {
  }

  public RectangleResize(double width, double length) {
    super(width, length);
  }

  public RectangleResize(double width, double length, String color, boolean filled) {
    super(width, length, color, filled);
  }
  public void resize(double percent){
    this.setLength((this.getLength()*(100 + percent))/100);
    this.setWidth((this.getWidth() * (100 + percent)) / 100);
  }
}
