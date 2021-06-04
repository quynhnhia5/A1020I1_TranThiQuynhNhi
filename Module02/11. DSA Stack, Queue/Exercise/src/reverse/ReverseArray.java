package reverse;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
  public static void main(String[] args) {
    System.out.println("Arlay reverse");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = scanner.nextInt();
    int[] Arr = new int[n];
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      System.out.print("Arr[" + i + " ] :");
      Arr[i] = scanner.nextInt();
      stack.push(Arr[i]);
    }
    System.out.println("Array reverse:");
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
    Stack<Character> stack1 = new Stack<>();
    scanner.nextLine();
    System.out.print("Enter string: ");
    String string = scanner.nextLine();
    for (int i = 0; i < string.length(); i++) {
      stack1.push(string.charAt(i));
    }
    System.out.print("Reverse string: ");
    while (!stack1.isEmpty()) {
      System.out.print(stack1.pop());
    }


  }

}
