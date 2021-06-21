package manager;

import java.util.Scanner;

public class ServicesManager {

  public static void addNewServies() {

    Scanner scanner = new Scanner(System.in);
    boolean check = true;

    do {
      System.out.println("------Menu---------");
      System.out.println("1.Add New Villa\n" +
              "2.Add New House\n" +
              "3.Add New Room\n" +
              "4.Back to menu\n" +
              "5.Exit");
      System.out.print("Vui long chon chuc nang ban muon thuc hien: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:

          break;
        case 2:

          break;
        case 3:

          break;
        case 4:

          break;
        case 5:

          break;
      }

    } while (check);
  }

  public static void ShowServices() {

    Scanner scanner = new Scanner(System.in);
    boolean check = true;

    do {

      System.out.println("-----Menu------" +
              "1. Show Services\n" +
              "2. Show all House\n" +
              "3. Show all Room\n" +
              "4. Show All Name Villa Not Duplicate\n" +
              "5. Show All Name House Not Duplicate\n" +
              "6. Show All Name Name Not Duplicate\n" +
              "7. Back to menu\n" +
              "8. Exit");

      System.out.print("Vui long chon chuc nang ban muon thuc hien: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:

          break;
        case 2:

          break;
        case 3:

          break;
        case 4:

          break;
        case 5:

          break;
        case 6:

          break;
        case 7:

          break;
        case 8:

          break;
       }

    } while (check);

  }


}
