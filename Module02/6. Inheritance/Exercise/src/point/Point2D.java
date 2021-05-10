package point;

public class Point2D {
  private float x = (float) 0.0;
  private float y = (float) 0.0;

  public Point2D() {
  }

  public Point2D(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public void setXY(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float[] getXY() {
    return new float[]{x, y};
  }

  public String toString() {
    return "Point2D "
            + getX()
            + " and "
            + getY()
            + " and "
            + getXY();
  }
}

