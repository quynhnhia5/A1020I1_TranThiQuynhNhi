package Commons;

import Commons.check.CheckService;

import java.util.Scanner;

public class Validate {
  Scanner scanner = new Scanner(System.in);
  boolean check=true;

  public String inputID(String id) {
 //boolean check=true;
    do {
      try {
        if (CheckService.checkID(id)) {
          return id;
        } else {
          throw new Exception("ID sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai ID theo dung format SVXX-YYYY: ");
        id=scanner.nextLine();
      }
    }while (check);
    return null;
  }

  public String inputName(String name) {
 //boolean check=true;
    do {
      try {
        if (CheckService.checkName(name)) {
          return name;
        } else {
          throw new Exception("Name sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai ten: ");
        name=scanner.nextLine();
      }
    }while (check);
    return null;
  }

  public String inputArea(String area) {
   boolean check=true;
    do {
      try {
        if (CheckService.checkArea(area)) {
          return area;
        } else {
          throw new Exception("Area sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Dien tich phai >30m2: ");
        area=scanner.nextLine();

      }
    }while (check);
    return null;
  }

  public String inputRentPrice(String rentPrice) {
    boolean check=true;
    do {
      try {
        if (CheckService.checkrentPrice(rentPrice)) {
          return rentPrice;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Chi phi thue phai la so duong: ");
        rentPrice=scanner.nextLine();

      }
    }while (check);
    return null;
  }

  public String inputMaxNumber(String maxNumber) {
    boolean check=true;
    do {
      try {
        if (CheckService.checkMaxNumber(maxNumber)) {
          return maxNumber;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai So luong nguoi toi da(>0 va <20): ");
        maxNumber=scanner.nextLine();
      }
    }while (check);
    return null;
  }

  public String inputAccompanied(String accompanied) {
    boolean check=true;
    do {
      try {
        if (CheckService.checkAccompanied(accompanied)) {
          return accompanied;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Dich vu di kem(massage, karaoke, food, drink, car): ");
        accompanied=scanner.nextLine();
      }
    }while (check);
    return null;
  }

  public String inputNumberOfFloor(String numberofFloor) {
    boolean check=true;
    do {
      try {
        if (CheckService.checkNumberOfFloor(numberofFloor)) {
          return numberofFloor;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai So tang: ");
        numberofFloor=scanner.nextLine();
      }
    }while (check);
    return null;
  }

  public String inputTypeRen(String typeRen) {
    boolean check=true;
    do {
      try {
        if (CheckService.checkTypeRen(typeRen)) {
          return typeRen;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Kieu thue: ");
        typeRen=scanner.nextLine();
      }
    }while (check);
    return null;
  }

  public String inputtandardRoom(String standard) {
    boolean check=true;
    do {
      try {
        if (CheckService.checkStandardRoom(standard)) {
          return standard;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Tieu chuan phong: ");
        standard=scanner.nextLine();
      }
    }while (check);
    return null;
  }
}
