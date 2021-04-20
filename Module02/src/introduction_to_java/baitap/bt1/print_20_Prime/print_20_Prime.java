package print_20_Prime;

import java.util.Scanner;

public class print_20_Prime {
  public static void main(String[] args) {
    int num1 = 20;
    int num = 2;
    int status = 1;
    int count = 0;
    String kq = " ";
    int i;
    Scanner scanner = new Scanner(System.in);
    if (num1 >= 1) {
      System.out.println("20 số nguyên tố đầu tiên là:");
    }
    while (count < num1) {
      status = 1;
      for (i = 2; i < num; i++) {
        if (num % i == 0) {
          status = 0;
          break;
        }
      }
      if (status != 0) {
        kq += num + " ";
        count++;
      }
      num++;
    }
    System.out.println(kq);
  }
}



