package binarysearch;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
  public static void sortArray(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
  public int searchBinary(int []arr,int left,int right,int value){

    if(left>right){
      return -1;
    }else {
      int mid=(left+right)/2;
      if(arr[mid]>value){
        return searchBinary(arr,left,mid-1,value);
      }else if(arr[mid]<value){
        return searchBinary(arr,mid+1,right,value);
      }else {
        return mid;
      }
    }

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap so phan tu cua mang: ");
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      System.out.print("Arr[" + i + "]: ");
      arr[i] = scanner.nextInt();
    }

    System.out.println("array after sorted: ");
    sortArray(arr);

    System.out.print("Enter value search: ");
    int value=scanner.nextInt();

    int index = new Main().searchBinary(arr,0,n-1,value);
    if(index==-1){
      System.out.println("Khong ton tai ");
    }else {
      System.out.println("Gia tri can kiem o vi tri: "+index);
    }
  }
  
}
