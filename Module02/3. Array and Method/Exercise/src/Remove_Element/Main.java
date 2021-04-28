package Remove_Element;

import java.util.Scanner;

public class Main {
  //trước mắt là làm 2 hàm nhập xuất mảng đã

  public static void inputArray(int[] a){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      System.out.printf("Enter a[%d]: ",i);
      a[i] = sc.nextInt();
    }
  }

  public static void displayArray(int[] a){
    for (int i : a) {
      System.out.print(i + " ");
    }
  }

  public static void deleteElement(int[] a, int n){
    //bien count de dem xem co bao nhieu so duoc xoa
    int count = 0;

    //duyet het qua mang
    for (int i = 0; i < a.length; i++) {

      //tim duoc vi tri cua so can xoa
      if (a[i] == n){

        //duyet tu vi tri so can xoa, di chuyen tat ca cac so dang sau tien ve truoc 1 buoc
        for (int j = i; j < a.length-1; j++) {
          a[j] = a[j+1];
        }

        //gan cho thang cuoi cung trong mang = 0
        a[a.length-1-count] = 0;
        count++;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of element: ");
    int n = sc.nextInt();

    int[] a = new int[n];

    inputArray(a);

    System.out.print("Array: ");
    displayArray(a);
    System.out.println();

    System.out.print("Enter element you want to delete: ");
    int value = sc.nextInt();

    deleteElement(a,value);

    displayArray(a);
  }
}
