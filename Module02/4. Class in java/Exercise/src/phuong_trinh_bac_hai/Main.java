package phuong_trinh_bac_hai;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap a: ");
    int a = sc.nextInt();
    System.out.println("Nhap b: ");
    int b = sc.nextInt();
    System.out.println("Nhap c: ");
    int c = sc.nextInt();


    PhuongTrinhBacHai pt2 = new PhuongTrinhBacHai(a, b, c);
    if (pt2.getDiscriminant() > 0) {
      System.out.println("Phuong trinh co 2 nghiem:" + pt2.getRoot1() + " va nghiem " + pt2.getRoot2());
    } else if (pt2.getDiscriminant() == 0) {
      System.out.println("Phuong trinh co 1 nghiem: " + pt2.getRoot2());
    } else {
      System.out.println("Phuong trinh vo nghiem");
    }

  }
}
