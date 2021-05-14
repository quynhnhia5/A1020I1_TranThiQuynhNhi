package interface_resizeable;

public class CircleResize extends geometric.Circle implements Resizeable {

  protected double getRadius;

  public CircleResize() {
  }

  public CircleResize(double radius) {
    super(radius);
  }

  public CircleResize(double radius, String color, boolean filled) {
    super(radius, color, filled);
  }
  public void resize(double percent){
    this.radius += (this.getRadius() * percent) / 100;
  }
}
