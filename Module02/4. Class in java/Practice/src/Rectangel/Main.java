package Rectangel;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Nhap chieu dai hinh chu nhat: ");
    int height = sc.nextInt();
    System.out.print("Nhap chieu rong hinh chu nhat: ");
    int width=sc.nextInt();
    Rectangel hcn=new Rectangel(width,height);
    System.out.println(hcn.display());
    System.out.println("Dien tich hinh chu nhat la: "+hcn.getArea());
    System.out.println("Chu vi hinh chu nhat la :" +hcn.getPerimeter());


  }
}
