package Views;

import manager.ProductManager;

import java.util.Scanner;

public class main {
  public static void displayMainMenu() {
    Scanner scanner = new Scanner(System.in);
    boolean check = true;
    do {
      System.out.println("-----MENU------\n" +
              "1." + "Add New Product\n" +
              "2." + "Show Product\n" +
              "3." +"Delete Product\n"+
              "4." + "Exit");
      System.out.print("Vui long chon chuc nang ban muon thuc hien: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          ProductManager.addNewProduct();
          break;
        case 2:
ProductManager.showProduct();
          break;
        case 3:
          ProductManager.deleteProduct();
          break;
        default:
          System.exit(0);

      }

    } while (check);
  }

}
