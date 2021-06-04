package check_brackets;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter string: ");
    String string = scanner.nextLine();
    Check check = new Check(string);
    if (check.checkBrackets()) {
      System.out.println("correct brackets");
    } else {
      System.out.println("wrong brackets");
    }
  }
}
