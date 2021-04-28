package Max_Matrix;

import java.util.Scanner;

public class Max_Matrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(" nhap so dong:");
    int n = scanner.nextInt();
    System.out.print("nhap so cot:");
    int m = scanner.nextInt();
    int[][] matrix = new int[n][m];
    Input(matrix, scanner);
    Show(matrix);

    System.out.println("gia tri lon nhat trong mang la: " + Max(matrix));


  }


  public static void Input(int[][] Arr, Scanner scanner) {

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        System.out.print(" nhap ma tran tai dong " + i + " va tai cot " + j + ": ");
        Arr[i][j] = scanner.nextInt();

      }

    }

  }

  public static void Show(int[][] Arr) {

    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        System.out.print(Arr[i][j] + " ");

      }
      System.out.println();

    }

  }

  public static int Max(int[][] Arr) {
    int max = Arr[0][0];
    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        if (Arr[i][j] > max) {
          max = Arr[i][j];
        }
      }
    }
    return max;
  }
}

