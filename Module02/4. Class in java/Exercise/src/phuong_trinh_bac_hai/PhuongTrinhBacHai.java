package phuong_trinh_bac_hai;

public class PhuongTrinhBacHai {
  private double a;
  private double b;
  private double c;

  public PhuongTrinhBacHai(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }

  public double getDiscriminant() {
    return b * b - 4 * a * c;

  }

  public double getRoot1() {
    if (getDiscriminant() >= 0) {
      return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
    return 0;
  }

  public double getRoot2() {
    if (getDiscriminant() >= 0) {
      return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

    }
    return 0;
  }
}

