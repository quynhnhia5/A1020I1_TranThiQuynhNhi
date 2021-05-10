package tong_1_cot;

import java.util.Scanner;
import java.util.function.Supplier;

public class Tong_1_Cot {

  public static void Input(int[][] Arr, Scanner scanner) {
    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr[0].length; j++) {
        System.out.print(" nhap phan tu dong thu " + i + " va cot thu " + j +":");
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
  public  static int Sum( int [][] Arr,int x){
    int sum=0;
    for (int i = 0; i <Arr.length ; i++) {
      for (int j = x; j < Arr.length; j++) {
        sum+=Arr[i][x];
        
      }
    }
    return sum;
    
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(" nhap  so dong :");
    int n = scanner.nextInt();
    System.out.print(" nhap so cot:");
    int m = scanner.nextInt();
    int A[][] = new int[n][m];

    Input(A, scanner);
    System.out.print("Nhap so cot muon tinh tong:");
    int x= scanner.nextInt();
    System.out.println(" tong la:"+ Sum(A,x));
    Show(A);
  }
}
