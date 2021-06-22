package manager;

import Commons.FileUtils;
import Commons.Validate;
import Models.House;
import Commons.check.CheckService;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseManager {
  public static final String FILE_HOUSE="D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\House.csv";
  public static final String COMMA= " , ";
  public static List<House> listHouse = new ArrayList<>();


  public static void addNewHouse() {

    Scanner scanner = new Scanner(System.in);
    Validate validate=new Validate();

    System.out.print("Nhap ID House: ");
    String idHouse = scanner.nextLine();
    validate.inputID(idHouse);

    System.out.print("Nhap ten House: ");
    String nameHouse = scanner.nextLine();
    validate.inputName(nameHouse);


    System.out.print("Nhap dien tich su dung: ");
    String areaUseHouse = scanner.nextLine();
    validate.inputArea(areaUseHouse);



    System.out.print("Nhap chi phi thue: ");
    String rentPriceHouse = scanner.nextLine();
    validate.inputRentPrice(rentPriceHouse);


    System.out.print("Nhap so luong nguoi toi da: ");
    String maxNumberOfPeople = scanner.nextLine();
    validate.inputMaxNumber(maxNumberOfPeople);



    System.out.print("Nhap kieu thue (Theu theo nam thang hoac gio): ");
    String typeRentHouse = scanner.nextLine();
    validate.inputTypeRen(typeRentHouse);
    while (!CheckService.checkTypeRen(typeRentHouse)) {
      System.err.println("Invalid!!! please Input again!!!");
      typeRentHouse = scanner.nextLine();
    }

    System.out.print("Nhap tieu chuan phong: ");
    String standardRoomHouse = scanner.nextLine();
    validate.inputtandardRoom(standardRoomHouse);


    System.out.print("Nhap mo ta tien nghi khac: ");
    String describeConvenient = scanner.nextLine();

    System.out.print("Nhap so tang: ");
    String numberOfFloorsHouse = scanner.nextLine();
    validate.inputNumberOfFloor(numberOfFloorsHouse);

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
}
