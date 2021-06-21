package classname;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter Name: ");
    String name=scanner.nextLine();
    while (!checkName.checkName(name)) {
      System.err.println("Invalid!!! please Input again!!!");
      name = scanner.nextLine();
    }
  }
}
