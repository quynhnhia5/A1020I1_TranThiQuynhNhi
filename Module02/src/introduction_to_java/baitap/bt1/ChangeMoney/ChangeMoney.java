package ChangeMoney;

import java.util.Scanner;

public class ChangeMoney {
  public static void main(String[] args) {
    double usd;
    final double tigia = 23000;
    Scanner sc = new Scanner(System.in);
    System.out.print("input usd: ");
    usd = sc.nextDouble();
    System.out.println("exchanged money: " + usd * tigia);
  }
}

