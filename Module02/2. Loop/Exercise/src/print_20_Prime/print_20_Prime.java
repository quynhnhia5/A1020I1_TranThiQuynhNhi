package print_20_Prime;

import java.util.Scanner;

public class print_20_Prime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter n: ");//So luong so nguyen to
    int n = scanner.nextInt();
    System.out.println(n + " số nguyên tố đầu tiên là:");
    int num = 2;
    while (n >0) {
      boolean status = true;
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          status = false;
          break;
        }
      }
      //status == true thi num chinh la so nguyen to, do do t in ra va giam gia tri cua n
      if (status) {
        System.out.print(num + " ");
        n--;
      }
      num++;
    }
  }
}



