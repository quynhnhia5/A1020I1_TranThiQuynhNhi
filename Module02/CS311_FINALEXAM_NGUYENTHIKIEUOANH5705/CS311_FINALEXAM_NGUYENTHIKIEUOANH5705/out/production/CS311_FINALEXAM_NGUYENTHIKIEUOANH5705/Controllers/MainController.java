package Controllers;


import manager.*;

import java.util.Scanner;

public class MainController {

  public static void displayMainMenu() {
    Scanner scanner = new Scanner(System.in);
    boolean check = true;
    do {
      System.out.println("-----MENU------\n" +
              "1." + "Add New Benh Nhan\n" +
              "2." + "Show List Benh Nhan Bao Hiem Y te\n" +
              "3." + "Show List Benh Nhan Bao Hiem Xã Hội\n" +
              "4." + "Search Benh Nhan theo id\n" +
              "5." +"Delete Benh Nhan\n"+
              "6." + "Exit");
      System.out.print("Vui long chon chuc nang ban muon thuc hien: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:

          DS_BenhNhan.themBenhNhan();
          break;
        case 2:
          DS_BenhNhan.showListBNBHYT();
          break;
        case 3:
          DS_BenhNhan.showListBNBHXH();
          break;
        case 4:
          DS_BenhNhan.timKiemBenhNhan();
          break;
        case 5:

          DS_BenhNhan.delete();
          break;

        default:
          return;
      }

    } while (check);
  }

  public void exit(){
    System.exit(0);
  }
}
