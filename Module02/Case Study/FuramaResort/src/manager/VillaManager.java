package manager;

import Models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaManager {

  private static List<Villa> listVilla = new ArrayList<>();

  public static void addNewVilla() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap ID Villa: ");
    String idVilla = scanner.nextLine();
    while (!CheckService.checkID(idVilla)){
      System.err.println("Invalid!!! please Input again!!!");
      idVilla=scanner.nextLine();
    }

    System.out.print("Nhap ten Villa: ");
    String nameVilla = scanner.nextLine();
    while (!CheckService.checkName(nameVilla)){
      System.err.println("Invalid!!! please Input again!!!");
      nameVilla=scanner.nextLine();
    }

    System.out.print("Nhap dien tich su dung: ");
    String areaUseVilla=scanner.nextLine();
    while (!CheckService.checkArea(areaUseVilla)){
      System.err.println("Invalid!!! please Input again!!!");
      areaUseVilla=scanner.nextLine();
    }

    System.out.print("Nhap chi phi thue: ");
    String rentPriceVilla=scanner.nextLine();
    while (!CheckService.checkrentPrice(rentPriceVilla)){
      System.err.println("Invalid!!! please Input again!!!");
      rentPriceVilla=scanner.nextLine();
    }

    System.out.print("Nhap so luong nguoi toi da: ");
    String maxNumberOfPeople=scanner.nextLine();
    while (!CheckService.checkMaxNumber(maxNumberOfPeople)){
      System.err.println("Invalid!!! please Input again!!!");
      maxNumberOfPeople=scanner.nextLine();
    }

    System.out.print("Nhap kieu thue (Theu theo nam thang hoac gio): ");
    String typeRentVilla=scanner.nextLine();
    while (!CheckService.checkTypeRen(typeRentVilla)){
      System.err.println("Invalid!!! please Input again!!!");
      typeRentVilla=scanner.nextLine();
    }

    System.out.print("Nhap tieu chuan phong: ");
    String standardRoomVilla=scanner.nextLine();
    while (!CheckService.checkStandardRoom(standardRoomVilla)){
      System.err.println("Invalid!!! please Input again!!!");
      standardRoomVilla=scanner.nextLine();
    }

    System.out.print("Nhap mo ta tien nghi khac: ");
    String describeConvenient=scanner.nextLine();


    System.out.print("Nhap dien tich ho boi: ");
    String areaPoolVilla=scanner.nextLine();
    while (!CheckService.checkArea(areaPoolVilla)){
      System.err.println("Invalid!!! please Input again!!!");
      areaPoolVilla=scanner.nextLine();
    }

    System.out.print("Nhap so tang: ");
    String numberOfFloorsVilla=scanner.nextLine();
    while (!CheckService.checkNumberOfFloor(numberOfFloorsVilla)){
      System.err.println("Invalid!!! please Input again!!!");
      numberOfFloorsVilla=scanner.nextLine();
    }

  }


}
