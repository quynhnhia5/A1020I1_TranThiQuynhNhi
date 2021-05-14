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
    this.length+= (this.getLength()*percent)/100;
    this.width += (this.getWidth() * percent) / 100;
  }
}
