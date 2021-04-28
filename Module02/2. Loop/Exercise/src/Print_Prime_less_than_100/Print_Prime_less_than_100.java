package Print_Prime_less_than_100;

import java.util.Scanner;

public class Print_Prime_less_than_100 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" cac nguyen to nho hon 100: " );

    //System.out.print("Enter n: ");//So luong so nguyen to
    //int n = scanner.nextInt();
    //System.out.println(n + " số nguyên tố đầu tiên là:");
    int num = 2;
    while (num > 0 && num < 100) {
      boolean status = true;
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          status = false;
          break;
        }
      }

      if (status) {
        System.out.print(num + " ");
      }
      num++;
    }
  }
}


