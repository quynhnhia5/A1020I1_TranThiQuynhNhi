package manager;

import Commons.FileUtils;
import Commons.Validate;
import Models.Room;

import javax.swing.*;
import java.util.*;

public class RoomManager {
  public static final String FILE_ROOM = "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Room.csv";
  //"src//data//Room.csv"
  public static final String COMMA = " , ";

  public static void addNewRoom() {

    Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();

    System.out.print("Nhap ID phong: ");
    String idRoom = validate.inputID();

    System.out.print("Nhap ten Phong: ");
    String nameRoom = validate.inputName();

    System.out.print("Nhap dien tich su dung: ");
    String areaUseRoom = validate.inputArea();

    System.out.print("Nhap chi phi thue: ");
    String rentPriceRoom = validate.inputRentPrice();

    System.out.print("Nhap so luong nguoi toi da: ");
    String maxNumberOfPeople = validate.inputMaxNumber();

    System.out.print("Nhap kieu thue (Theo theo nam thang hoac gio): ");
    String typeRentRoom = validate.inputTypeRen();

    System.out.print("Nhap dich vu di kem: ");
    String accompaniedService = validate.inputAccompanied();

    Room room = new Room(idRoom, nameRoom, areaUseRoom, rentPriceRoom,
            maxNumberOfPeople, typeRentRoom, accompaniedService);

    String lineRoom;
    lineRoom = room.getId() + COMMA + room.getNameServices() + COMMA
            + room.getAreaUse() + COMMA + room.getRentPrice() + COMMA
            + room.getMaxNumberOfPeople() + COMMA + room.getRentalType() + COMMA
            + room.getAccompaniedService();
    FileUtils.writeFile(FILE_ROOM, lineRoom);


  }

  public static void showRoom() {
    List<Room> listRoom = FileUtils.CSVToListRoom();
    for (Room room : listRoom) {
      room.showInfo();
    }
    System.out.println();
  }

  public static void showNameRoomNotDup() {
    Set<String> nameRoomNotDup = new TreeSet<>();
    List<Room> roomList = new ArrayList<>();
    roomList = FileUtils.CSVToListRoom();
    for (int i = 0; i < roomList.size(); i++) {
      nameRoomNotDup.add(roomList.get(i).getNameServices());
    }
    System.out.println("Danh sach cac ten Room khong trung nhau: ");
    for (String s : nameRoomNotDup) {
      System.out.println(s);
    }
  }

}
