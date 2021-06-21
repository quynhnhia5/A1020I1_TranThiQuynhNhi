package manager;

import Models.Room;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomManager {
private List<Room> listRoom=new ArrayList<>();

public static void addNewRoom(){

  Scanner scanner=new Scanner(System.in);

  System.out.print("Nhap ID phong: ");
  String idRoom = scanner.nextLine();
  while (!CheckService.checkID(idRoom)){
    System.err.println("Invalid!!! please Input again!!!");
    idRoom=scanner.nextLine();
  }

  System.out.print("Nhap ten Phong: ");
  String nameRoom = scanner.nextLine();
  while (!CheckService.checkName(nameRoom)){
    System.err.println("Invalid!!! please Input again!!!");
    nameRoom=scanner.nextLine();
  }

  System.out.print("Nhap dien tich su dung: ");
  String areaUseRoom=scanner.nextLine();
  while (!CheckService.checkArea(areaUseRoom)){
    System.err.println("Invalid!!! please Input again!!!");
    areaUseRoom=scanner.nextLine();
  }

  System.out.print("Nhap chi phi thue: ");
  String rentPriceRoom=scanner.nextLine();
  while (!CheckService.checkrentPrice(rentPriceRoom)){
    System.err.println("Invalid!!! please Input again!!!");
    rentPriceRoom=scanner.nextLine();
  }

  System.out.print("Nhap so luong nguoi toi da: ");
  String maxNumberOfPeople=scanner.nextLine();
  while (!CheckService.checkMaxNumber(maxNumberOfPeople)){
    System.err.println("Invalid!!! please Input again!!!");
    maxNumberOfPeople=scanner.nextLine();
  }

  System.out.print("Nhap kieu thue (Theu theo nam thang hoac gio): ");
  String typeRentRoom=scanner.nextLine();
  while (!CheckService.checkTypeRen(typeRentRoom)){
    System.err.println("Invalid!!! please Input again!!!");
    typeRentRoom=scanner.nextLine();
  }

  System.out.print("Nhap dich vu di kem: ");
  String accompaniedService=scanner.nextLine();
  while (!CheckService.checkAccompanied(accompaniedService)){
    System.err.println("Invalid!!! please Input again!!!");
    accompaniedService=scanner.nextLine();
  }


}

}
