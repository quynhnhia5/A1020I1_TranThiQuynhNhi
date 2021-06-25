package manager;

import Commons.FileUtils;
import Commons.Validate;
import Models.House;
import Commons.check.CheckService;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.*;

public class HouseManager {
  public static final String FILE_HOUSE="D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\House.csv";
  public static final String COMMA= " , ";
  public static List<House> listHouse = new ArrayList<>();


  public static void addNewHouse() {

    Scanner scanner = new Scanner(System.in);
    Validate validate=new Validate();

    System.out.print("Nhap ID House: ");
    String idHouse = validate.inputID();

    System.out.print("Nhap ten House: ");
    String nameHouse = validate.inputName();

    System.out.print("Nhap dien tich su dung: ");
    String areaUseHouse = validate.inputArea();

    System.out.print("Nhap chi phi thue: ");
    String rentPriceHouse = validate.inputRentPrice();

    System.out.print("Nhap so luong nguoi toi da: ");
    String maxNumberOfPeople = validate.inputMaxNumber();

    System.out.print("Nhap kieu thue (Theu theo nam thang hoac gio): ");
    String typeRentHouse = validate.inputTypeRen();

    System.out.print("Nhap tieu chuan phong: ");
    String standardRoomHouse = validate.inputtandardRoom();

    System.out.print("Nhap mo ta tien nghi khac: ");
    String describeConvenient = scanner.nextLine();

    System.out.print("Nhap so tang: ");
    String numberOfFloorsHouse =validate.inputNumberOfFloor();

    House house=new House(idHouse,nameHouse,areaUseHouse,
            rentPriceHouse,maxNumberOfPeople,typeRentHouse,
            standardRoomHouse,describeConvenient,numberOfFloorsHouse);

    listHouse.add(house);
    String lineHouse=house.getId()+COMMA+house.getNameServices()+COMMA
            +house.getAreaUse()+COMMA+house.getRentPrice()+COMMA
            +house.getMaxNumberOfPeople()+COMMA +house.getRentalType()+COMMA
            +house.getStandardRoom()+COMMA+house.getDescribeConvenient()+COMMA
            +house.getNumberOfFloors();
    FileUtils.witerFile(FILE_HOUSE,lineHouse);
  }

  public static void showHouse(){
    for (House house : listHouse) {
      house.showInfo();
    }
  }

  public static void showNameHouseNotDup(){
    Set<String> nameHouseNotDup=new TreeSet<>();
    List<House> houseList=new ArrayList<>();
    houseList=FileUtils.CSVToListHouse();
    for (int i = 0; i < houseList.size(); i++) {
      nameHouseNotDup.add(houseList.get(i).getNameServices());
    }
    System.out.println("Danh sach cac ten House khong trung nhau: ");
    for (String s : nameHouseNotDup) {
      System.out.println(s);

    }
  }
}
