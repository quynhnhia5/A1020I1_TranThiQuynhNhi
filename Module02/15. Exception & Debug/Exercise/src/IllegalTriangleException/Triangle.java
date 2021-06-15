package IllegalTriangleException;

import java.util.Scanner;

public class Triangle {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    try {
      System.out.print("Enter side 1: ");
      int side1 = scanner.nextInt();
      System.out.print("Enter side 2: ");
      int side2 = scanner.nextInt();
      System.out.print("Enter side 3: ");
      int side3 = scanner.nextInt();

      checkTriangle(side1,side2,side3);
    } catch (NumberFormatException | IllegalTriangleException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangleException, NumberFormatException{
    if (side1 <= 0 || side2 <= 0 || side3 <= 0)
      throw new NumberFormatException("Cac canh khong duoc am");

    if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)
      throw new IllegalTriangleException("Not a triangle");

    System.out.println("Valid triangle");
  }
}
