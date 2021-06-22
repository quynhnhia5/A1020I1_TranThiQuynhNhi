package manager;

import Commons.FileUtils;
import Commons.Validate;
import Models.Room;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomManager {
  public static final String FILE_ROOM="D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Room.csv";
  public static final String COMMA= ",";
public static List<Room> listRoom=new ArrayList<>();

public static void addNewRoom(){

  Scanner scanner=new Scanner(System.in);
  Validate validate=new Validate();

  System.out.print("Nhap ID phong: ");
  String idRoom = scanner.nextLine();
  validate.inputID(idRoom);

  System.out.print("Nhap ten Phong: ");
  String nameRoom = scanner.nextLine();
  validate.inputName(nameRoom);

  System.out.print("Nhap dien tich su dung: ");
  String areaUseRoom=scanner.nextLine();
  validate.inputArea(areaUseRoom);

  System.out.print("Nhap chi phi thue: ");
  String rentPriceRoom=scanner.nextLine();
  validate.inputRentPrice(rentPriceRoom);

  System.out.print("Nhap so luong nguoi toi da: ");
  String maxNumberOfPeople=scanner.nextLine();
  validate.inputMaxNumber(maxNumberOfPeople);


  System.out.print("Nhap kieu thue (Theu theo nam thang hoac gio): ");
  String typeRentRoom=scanner.nextLine();
  validate.inputTypeRen(typeRentRoom);

  System.out.print("Nhap dich vu di kem: ");
  String accompaniedService=scanner.nextLine();
  validate.inputAccompanied(accompaniedService);

  Room room=new Room(idRoom,nameRoom,areaUseRoom,rentPriceRoom,
          maxNumberOfPeople,typeRentRoom,accompaniedService);

  listRoom.add(room);

  String lineRoom;
  lineRoom=room.getId()+COMMA+room.getNameServices()+COMMA
          +room.getAreaUse()+COMMA+room.getRentPrice()+COMMA
          +room.getMaxNumberOfPeople()+COMMA+room.getRentalType()+COMMA
          +room.getAccompaniedService();
  FileUtils.witerFile(FILE_ROOM,lineRoom);



}
public static void showRoom(){
  for (Room room : listRoom) {
    room.showInfo();
  }
}

}
