package Min;

import java.util.Scanner;

public class Min_Arr {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(" nhap so luong phan tu: ");
    int n = scanner.nextInt();
    int[] A = new int[n];
    input(A, scanner);
    show(A);
    System.out.println("min:" +min(A));
  }

  public static void input(int[] Arr, Scanner scanner) {
    for (int i = 0; i < Arr.length; i++) {
      System.out.print(" nhap phan tu thu " + i + ":");
      Arr[i] = scanner.nextInt();
    }

  }

  public static void show(int[] Arr) {
    for (int i = 0; i < Arr.length; i++) {
      System.out.printf("Arr[%d] = %d\n", i, Arr[i]);
    }
  }

  public static int min(int[] Arr) {
    int min= Arr[0];
    for (int i = 1; i < Arr.length; i++) {
      if (min > Arr[i ]) {
        min = Arr[i];
      }
    }
    return min;

  }
}