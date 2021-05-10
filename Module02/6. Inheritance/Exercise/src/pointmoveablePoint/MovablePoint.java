package pointmoveablePoint;

public class MovablePoint extends Point {
  private float xSpeed = (float) 0.0;
  private float ySpeed = (float) 0.0;

  public MovablePoint(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public MovablePoint() {
  }

  public float getXSpeed() {
    return xSpeed;
  }

  public void setXSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }

  public float getYSpeed() {
    return ySpeed;
  }

  public void setYSpeed(float ySpeed) {
    this.ySpeed = ySpeed;
  }

  public void setSpeed(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public float[] getSpeed() {
    return new float[]{xSpeed, ySpeed};
  }

  public String toString() {
    return +  getX()
            + getY()
            + " speed = "
            + getXSpeed()
            + " "
            + getYSpeed();
  }

  public MovablePoint move() {
    float x = xSpeed;
    float y = ySpeed;
    return this;
  }

}
