package palindrome;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter string: ");
    String string = scanner.nextLine();

    Palindrome palindrome = new Palindrome(string);

    if (palindrome.palindrome()){
      System.out.println("This is a symmetric string");
    }else {
      System.out.println("This is not a symmetric string");
    }
  }
}
