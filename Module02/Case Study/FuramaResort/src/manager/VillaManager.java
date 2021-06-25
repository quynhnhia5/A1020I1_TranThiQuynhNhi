package manager;

import Commons.FileUtils;
import Commons.Validate;
import Models.Villa;
import sun.management.snmp.jvminstr.JvmRTInputArgsEntryImpl;

import java.util.*;

public class VillaManager {
public static final String FILE_VILA="D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Villa.csv";
  public static final String COMMA = " , ";

  public static List<Villa> listVilla = new ArrayList<>();

  public static void addNewVilla() {

    Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();

    System.out.print("Nhap ID Villa: ");
    String idVilla = validate.inputID();

    System.out.print("Nhap ten Villa: ");
    String nameVilla =validate.inputName();

    System.out.print("Nhap dien tich su dung: ");
    String areaUseVilla = validate.inputArea();

    System.out.print("Nhap chi phi thue: ");
    String rentPriceVilla = validate.inputRentPrice();

    System.out.print("Nhap so luong nguoi toi da: ");
    String maxNumberOfPeople = validate.inputMaxNumber();

    System.out.print("Nhap kieu thue (Theu theo nam thang hoac gio): ");
    String typeRentVilla = validate.inputTypeRen();

    System.out.print("Nhap tieu chuan phong: ");
    String standardRoomVilla = validate.inputtandardRoom();


    System.out.print("Nhap mo ta tien nghi khac: ");
    String describeConvenient = scanner.nextLine();


    System.out.print("Nhap dien tich ho boi: ");
    String areaPoolVilla = validate.inputArea();


    System.out.print("Nhap so tang: ");
    String numberOfFloorsVilla = validate.inputNumberOfFloor();

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


  public static void showNameVillaNotDuplicate(){
    Set <String> listVillaNotDup=new TreeSet<String>();
    List<Villa> villaList=FileUtils.CSVToListVilla();
    for (int i = 0; i < villaList.size(); i++) {
      listVillaNotDup.add(villaList.get(i).getNameServices());
    }
    System.out.println("Danh sach ten cac villa khong trung nhau");
    for (String s : listVillaNotDup) {
      System.out.println(s);
    }
  }





}
