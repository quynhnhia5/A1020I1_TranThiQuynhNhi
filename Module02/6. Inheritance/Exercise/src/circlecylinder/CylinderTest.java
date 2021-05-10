package circlecylinder;


public class CylinderTest {
  public static void main(String[] args) {
    Cylinder cylinder = new Cylinder();
    System.out.println(cylinder);
    cylinder = new Cylinder(2.0);
    System.out.println(cylinder);
    cylinder = new Cylinder(3.5, 2, " yellow");
    System.out.println(cylinder);

  }
}
