package manager;

import Commons.FileUtils;
import Commons.Validate;
import Models.Villa;
import sun.management.snmp.jvminstr.JvmRTInputArgsEntryImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VillaManager {
public static final String FILE_VILA="D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Villa.csv";
  public static final String COMMA = ",";

  public static List<Villa> listVilla = new ArrayList<>();

  public static void addNewVilla() {

    Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();

    System.out.print("Nhap ID Villa: ");
    String idVilla = scanner.nextLine();
    validate.inputID(idVilla);

    System.out.print("Nhap ten Villa: ");
    String nameVilla = scanner.nextLine();
    validate.inputName(nameVilla);


    System.out.print("Nhap dien tich su dung: ");
    String areaUseVilla = scanner.nextLine();
    validate.inputArea(areaUseVilla);

    System.out.print("Nhap chi phi thue: ");
    String rentPriceVilla = scanner.nextLine();
    validate.inputRentPrice(rentPriceVilla);


    System.out.print("Nhap so luong nguoi toi da: ");
    String maxNumberOfPeople = scanner.nextLine();
    validate.inputMaxNumber(maxNumberOfPeople);


    System.out.print("Nhap kieu thue (Theu theo nam thang hoac gio): ");
    String typeRentVilla = scanner.nextLine();
    validate.inputTypeRen(typeRentVilla);

    System.out.print("Nhap tieu chuan phong: ");
    String standardRoomVilla = scanner.nextLine();
    validate.inputtandardRoom(standardRoomVilla);

    System.out.print("Nhap mo ta tien nghi khac: ");
    String describeConvenient = scanner.nextLine();


    System.out.print("Nhap dien tich ho boi: ");
    String areaPoolVilla = scanner.nextLine();
    validate.inputArea(areaPoolVilla);


    System.out.print("Nhap so tang: ");
    String numberOfFloorsVilla = scanner.nextLine();
    validate.inputNumberOfFloor(numberOfFloorsVilla);
    Villa villa = new Villa(idVilla, nameVilla, areaUseVilla, rentPriceVilla, maxNumberOfPeople, typeRentVilla, standardRoomVilla, describeConvenient, areaPoolVilla, numberOfFloorsVilla);
    listVilla.add(villa);
    String line;
    line = villa.getId() + COMMA + villa.getNameServices() + COMMA
            + villa.getAreaUse() + COMMA + villa.getRentPrice() + COMMA
            + villa.getMaxNumberOfPeople() + COMMA + villa.getRentalType() + COMMA
            + villa.getStandardRoom() + COMMA + villa.getDescribeConvenient() + COMMA
            + villa.getAreaPool() + COMMA + villa.getNumberOfFloors();
    FileUtils.witerFile(FILE_VILA,line);

  }

  public static void showVilla() {

    for (Villa villa : listVilla) {
      villa.showInfo();

    }
  }


}
