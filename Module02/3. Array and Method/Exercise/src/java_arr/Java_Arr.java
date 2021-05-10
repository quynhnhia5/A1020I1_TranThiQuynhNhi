package java_arr;

import java.util.Scanner;

public class Java_Arr {
  public static void input(int [][] Arr, Scanner scanner){
    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr.length; j++) {
        System.out.print("nhap ma tran hang thu" +i + " va cot thu" + j);
        Arr[i][j]=scanner.nextInt();
      }
    }
  }
  public static void Show(int [][] Arr){
    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j <Arr.length ; j++) {
        System.out.println(Arr[i][j] +" ");

      }
      System.out.println();
    }
  }
  public static int tongdong( int [][] Arr){
    int sum=0;
    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr.length; j++) {

      }
    }
  }
}
