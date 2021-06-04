package convert;

import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    //Stack<Integer> convert1=new Stack<>();
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter decimal: ");
    int num=scanner.nextInt();
    new Decimal_Binary().convert(num);

  }
}
