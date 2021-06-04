package product_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Management use = new Management();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("1.Them san pham ");
      System.out.println("2.Sua thong tin theo id");
      System.out.println("3.Xoa san pham theo id");
      System.out.println("4.Hien thi");
      System.out.println("5.Tim kiem san pham ");
      System.out.println("6.Sap xep");
      System.out.print("Your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {

        case 1:
          use.addProduct();
          break;
        case 2:
          System.out.print("Enter ID: ");
          int id1 = scanner.nextInt();
          use.editProduct(id1);
          break;
        case 3:
          System.out.print("Enter ID: ");
          int id2 = scanner.nextInt();
          use.delete(id2);
          break;
        case 4:
          use.showProduct();
          break;
        case 5:
          scanner.nextLine();
          System.out.print("Enter name:");
          String name = scanner.nextLine();
          if(use.findProductByName(name)==null){
            System.out.println("Khong co san pham ");
          }else {
            System.out.println(use.findProductByName(name));
          }
          break;
        case 6:
          System.out.println("Show tang dan hay giam dan");
          System.out.println("1. Tang dan");
          System.out.println("2. Giam dan");
          System.out.print("Your choice: ");
          int i = scanner.nextInt();

          if (i == 1) {
            use.showProductsByPrice(true);
          } else {
            use.showProductsByPrice(false);
          }
          break;

        default:
          return;
      }
    }
  }
}
