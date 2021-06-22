package Controllers;

import manager.ServicesManager;

import java.util.Scanner;

public class MainController {

  public static void displayMainMenu() {
    Scanner scanner = new Scanner(System.in);
    boolean check = true;
    do {
      System.out.println("-----MENU------\n" +
              "1." + "Add New Services\n" +
              "2." + "Show Services\n" +
              "3." + "Add New Customer\n" +
              "4." + "Show Information of Customer\n" +
              "5." + "Add New Booking\n" +
              "6." + "Show Information of Employee\n" +
              "7." + "Exit");
      System.out.print("Vui long chon chuc nang ban muon thuc hien: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          ServicesManager.addNewServies();
          break;
        case 2:
          ServicesManager.showServices();
          break;
        case 3:

          break;
        case 4:
          break;

        case 5:
          break;
        case 6:
          break;

      }

    } while (check);
  }

  public static void main(String[] args) {
    displayMainMenu();
  }


}
