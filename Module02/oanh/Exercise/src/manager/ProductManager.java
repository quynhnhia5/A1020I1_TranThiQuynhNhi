package manager;

import Views.main;

import java.util.Scanner;

public class ProductManager {

  public static void addNewProduct() {

    Scanner scanner = new Scanner(System.in);
    boolean check = true;

    do {
      System.out.println("------Menu Product---------");
      System.out.println("1.Product Imported\n" +
              "2.Product Export\n" +
              "3.Back to menu\n" +
              "4.Exit");
      System.out.print("You choice: ");
      int choice=scanner.nextInt();
      switch (choice){
        case 1:
          ProductImportedManager.addNewProductImported();
          System.out.println("Them thanh cong");
          break;

        case 2:
          ProductExportManager.addNewProductExport();
          System.out.println("Them thanh cong");
          break;
        case 3:
          break;
        case 4:
          check = false;
          break;
        default:
          System.out.println("Fail!!! Please choose again, Enter to continue");
          scanner.nextLine();
          addNewProduct();
      }
      }while (check);

  }

  public static void deleteProduct() {
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("--------Menu Services-------");

      System.out.println("1.Delete Import\n" +
              "2.Delete Export\n" +
              "3.Back to menu\n" +
              "4.Exit");
      System.out.print("Chon chu nang muon thuc hien: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
         ProductImportedManager.deleteImported();
          break;
        case 2:
         ProductExportManager.deleteExports();
          break;

        case 3:
          main.displayMainMenu();
          break;
        case 4:
          System.exit(0);
          break;
        default:
          System.out.println("Fail!!! Please choose again, Enter to continue");
          scanner.nextLine();
          deleteProduct();
      }
    } while (true);
  }

  public static void showProduct() {

    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("------Menu Show Product------");
      System.out.println("1.Product Imported\n" +
              "2.Product Export\n" +
              "3.Back to menu\n" +
              "4.Exit");
      System.out.print("Chon chuc nang muon thuc hien: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          ProductImportedManager.showImport();
          break;
        case 2:
          ProductExportManager.showExport();
          break;
        case 3:
          main.displayMainMenu();
          break;
        case 4:
          System.exit(0);
          break;
        default:
          System.out.println("Fail!!! Please choose again, Enter to continue");
          scanner.nextLine();
          showProduct();


      }
    }while (true);
  }
  }



