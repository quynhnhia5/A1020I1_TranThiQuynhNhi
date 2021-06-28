package Commons;

import Commons.check.CheckCustomer;
import Commons.check.CheckEmployee;
import Commons.check.CheckService;
import org.omg.CORBA.TRANSACTION_UNAVAILABLE;

import java.util.Scanner;

public class Validate {
  Scanner scanner = new Scanner(System.in);

  public String inputID() {
    do {
      try {
        String id = scanner.nextLine();

        if (CheckService.checkID(id)) {
          return id;
        } else {
          throw new Exception("ID sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai ID theo dung format SVXX-YYYY: ");
      }
    } while (true);
  }

  public String inputName() {
    do {
      try {
        String name = scanner.nextLine();

        if (CheckService.checkName(name)) {
          return name;
        } else {
          throw new Exception("Nhap ten sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai ten: ");
      }
    } while (true);
  }

  public String inputArea() {
    do {
      try {
        double area = Double.parseDouble(scanner.nextLine());
        if (CheckService.checkArea(area)) {
          return String.valueOf(area);
        } else {
          throw new Exception("Area phai lon hon 30");
        }
      } catch (NumberFormatException e) {
        System.out.println("Chi duoc nhap so!");
        System.out.print("Nhap lai: ");
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Dien tich phai >30m2: ");

      }
    } while (true);
  }

  public String inputRentPrice() {
    do {
      try {
        String rentPrice = scanner.nextLine();
        if (CheckService.checkrentPrice(rentPrice)) {
          return rentPrice;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Chi phi thue phai la so duong: ");
      }
    } while (true);
  }

  public String inputMaxNumber() {
    do {
      try {
        String maxNumber = scanner.nextLine();
        if (CheckService.checkMaxNumber(maxNumber)) {
          return maxNumber;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai So luong nguoi toi da(>0 va <20): ");
      }
    } while (true);
  }

  public String inputAccompanied() {
    do {
      try {
        String accompanied = scanner.nextLine();
        if (CheckService.checkAccompanied(accompanied)) {
          return accompanied;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Dich vu di kem(massage, karaoke, food, drink, car): ");
      }
    } while (true);
  }

  public String inputNumberOfFloor() {
    do {
      try {
        String numberofFloor = scanner.nextLine();
        if (CheckService.checkNumberOfFloor(numberofFloor)) {
          return numberofFloor;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai So tang: ");
      }
    } while (true);
  }

  public String inputTypeRen() {
    do {
      try {
        String typeRen = scanner.nextLine();
        if (CheckService.checkTypeRen(typeRen)) {
          return typeRen;
        } else {
          throw new Exception("Nhap sai format (nam, thang, ngay, gio)");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Kieu thue: ");
      }
    } while (true);
  }

  public String inputtandardRoom() {
    do {
      try {
        String standard = scanner.nextLine();
        if (CheckService.checkStandardRoom(standard)) {
          return standard;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Tieu chuan phong: ");
      }
    } while (true);
  }

  public String inputNameCus() {
    do {
      try {
        String name = scanner.nextLine();
        if (CheckCustomer.checkName(name)) {
          return name;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai ten (in hoa ki tu dau tien): ");
      }

    } while (true);
  }

  public String inputEmail() {
    do {
      try {
        String email = scanner.nextLine();
        if (CheckCustomer.checkEmail(email)) {
          return email;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai email (theo dung dinh dang abc@abc.abc): ");
      }

    } while (true);
  }

  public String inputGender() {
    do {
      try {
        String gender = scanner.nextLine();
        if (CheckCustomer.checkGender(gender)) {
          return gender;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai Gender (Male, Female hoặc Unknow): ");
      }

    } while (true);
  }

  public String inputDateOfBirth() {
    do {
      try {
        String dateOfBirth = scanner.nextLine();
        if (CheckCustomer.checkDateOfBirth(dateOfBirth)) {
          return dateOfBirth;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai dateOfBirth (Nam sinh phai >1900 và nho hơn ngay hien tai 18 nam): ");
      }

    } while (true);
  }

  public String inputIdCard() {
    do {
      try {
        String idCard = scanner.nextLine();
        if (CheckCustomer.checkIdCard(idCard)) {
          return idCard;
        } else {
          throw new Exception("Nhap sai format");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.print("Nhap lai idCard (Phai co 9 so và theo dung dinh dang XXX XXX XXX : ");
      }

    } while (true);
  }


}
