package manager;

import Commons.FileUtils;
import Commons.Validate;
import Models.Villa;

import java.util.*;

public class VillaManager {
  public static final String FILE_VILA = "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Villa.csv";
  public static final String COMMA = " , ";


  public static void addNewVilla() {

    Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();

    System.out.print("Nhap ID Villa: ");
    String idVilla = validate.inputID();

    System.out.print("Nhap ten Villa: ");
    String nameVilla = validate.inputName();

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


    String line;
    line = villa.getId() + COMMA + villa.getNameServices() + COMMA
            + villa.getAreaUse() + COMMA + villa.getRentPrice() + COMMA
            + villa.getMaxNumberOfPeople() + COMMA + villa.getRentalType() + COMMA
            + villa.getStandardRoom() + COMMA + villa.getDescribeConvenient() + COMMA
            + villa.getAreaPool() + COMMA + villa.getNumberOfFloors();

    FileUtils.writeFile(FILE_VILA, line);
  }

  public static void showVilla() {
    List<Villa> listVilla = FileUtils.CSVToListVilla();
    for (Villa villa : listVilla) {
      villa.showInfo();

    }
  }


  public static void showNameVillaNotDuplicate() {
    Set<String> listVillaNotDup = new TreeSet<String>();
    List<Villa> villaList = FileUtils.CSVToListVilla();

    for (int i = 0; i < villaList.size(); i++) {
      listVillaNotDup.add(villaList.get(i).getNameServices());
    }
    System.out.println("Danh sach ten cac villa khong trung nhau");
    for (String s : listVillaNotDup) {
      System.out.println(s);
    }

  }

  public static Villa searchVilla() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap id muon tim kiem: ");
    String id = scanner.nextLine();
    List<Villa> listVilla = new ArrayList<>();
    listVilla = FileUtils.CSVToListVilla();
    for (Villa villa : listVilla) {
      if (id.equals(villa.getId())) {
        return villa;

      }
    }
    return null;
  }

  public static void deleteVilla(){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Nhap id muon xoa: ");
    String id=scanner.nextLine();
    List<Villa> list=new ArrayList<>();
    list=FileUtils.CSVToListVilla();
String line;
    System.out.println("1.Yes\n" +
            "2.No");
    System.out.print("You choice: ");
    int choice=scanner.nextInt();
    switch (choice){
      case 1:
        list.removeIf(villa -> id.equals(villa.getId()));
        if(list.isEmpty()){
          FileUtils.overwriteFile(FILE_VILA,"");
        }else {
          for (Villa villa : list) {
            line=villa.getId() + COMMA + villa.getNameServices() + COMMA
                    + villa.getAreaUse() + COMMA + villa.getRentPrice() + COMMA
                    + villa.getMaxNumberOfPeople() + COMMA + villa.getRentalType() + COMMA
                    + villa.getStandardRoom() + COMMA + villa.getDescribeConvenient() + COMMA
                    + villa.getAreaPool() + COMMA + villa.getNumberOfFloors();
            FileUtils.overwriteFile(FILE_VILA,line);
          }}
        System.out.println("Xoa thanh cong");
        break;
      case 2:
        ServicesManager.deleteServices();
      default:
        System.out.println("Chi chon 1 hoac 2");
    }
  }


}
