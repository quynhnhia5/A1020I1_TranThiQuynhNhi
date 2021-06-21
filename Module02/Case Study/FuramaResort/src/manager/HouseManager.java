package manager;

import Models.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseManager {
  private List<House> listHouse=new ArrayList<>();


  public static void addNewHouse(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap ID House: ");
    String idHouse = scanner.nextLine();
    while (!CheckService.checkID(idHouse)){
      System.err.println("Invalid!!! please Input again!!!");
      idHouse=scanner.nextLine();
    }

    System.out.print("Nhap ten House: ");
    String nameHouse = scanner.nextLine();
    while (!CheckService.checkName(nameHouse)){
      System.err.println("Invalid!!! please Input again!!!");
      nameHouse=scanner.nextLine();
    }

    System.out.print("Nhap dien tich su dung: ");
    String areaUseHouse=scanner.nextLine();
    while (!CheckService.checkArea(areaUseHouse)){
      System.err.println("Invalid!!! please Input again!!!");
      areaUseHouse=scanner.nextLine();
    }


    System.out.print("Nhap chi phi thue: ");
    String rentPriceHouse=scanner.nextLine();
    while (!CheckService.checkrentPrice(rentPriceHouse)){
      System.err.println("Invalid!!! please Input again!!!");
      rentPriceHouse=scanner.nextLine();
    }

    System.out.print("Nhap so luong nguoi toi da: ");
    String maxNumberOfPeople=scanner.nextLine();
    while (!CheckService.checkMaxNumber(maxNumberOfPeople)){
      System.err.println("Invalid!!! please Input again!!!");
      maxNumberOfPeople=scanner.nextLine();
    }


    System.out.print("Nhap kieu thue (Theu theo nam thang hoac gio): ");
    String typeRentHouse=scanner.nextLine();
    while (!CheckService.checkTypeRen(typeRentHouse)){
      System.err.println("Invalid!!! please Input again!!!");
      typeRentHouse=scanner.nextLine();
    }

    System.out.print("Nhap tieu chuan phong: ");
    String standardRoomHouse=scanner.nextLine();
    while (!CheckService.checkStandardRoom(standardRoomHouse)){
      System.err.println("Invalid!!! please Input again!!!");
      standardRoomHouse=scanner.nextLine();
    }

    System.out.print("Nhap mo ta tien nghi khac: ");
    String describeConvenient=scanner.nextLine();

    System.out.print("Nhap so tang: ");
    String numberOfFloorsHouse=scanner.nextLine();
    while (!CheckService.checkNumberOfFloor(numberOfFloorsHouse)){
      System.err.println("Invalid!!! please Input again!!!");
      numberOfFloorsHouse=scanner.nextLine();
    }





  }
}
