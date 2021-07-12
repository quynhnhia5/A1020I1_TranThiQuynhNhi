package manager;

import commons.FileUtils;
import models.productExport;
import models.productImported;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImportedManager {

  public static final String FILE_IMPORTED = "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Thi\\Exercise\\src\\data\\Imported.csv";
  public static final String COMMA = " , ";



  public static void addNewProductImported() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap ID Ssan pham: ");
    String id= scanner.nextLine();

    System.out.print("Nhap ma san pham: ");
    String maSanPham = scanner.nextLine();

    System.out.print("Nhap ten san pham: ");
    String name = scanner.nextLine();

    System.out.print("Nhap gia ban: ");
    String price = scanner.nextLine();

    System.out.print("Nhap so luong: ");
    String quantity = scanner.nextLine();

    System.out.print("Nhap nha san xuat: ");
    String producer = scanner.nextLine();

    System.out.print("Nhap gia nhap khau: ");
    String priceImport = scanner.nextLine();

    System.out.print("Nhap tinh thanh nhap: ");
    String provinceImport = scanner.nextLine();

    System.out.print("Nhap theu nhap khau: ");
    String taxImport = scanner.nextLine();
productImported imported= new productImported(id,maSanPham,name,price,quantity,producer,priceImport,provinceImport,taxImport);
String lineImported;

lineImported=imported.getId()+ COMMA+imported.getMaSanpham()+COMMA+imported.getName()+COMMA+imported.getPrice()+COMMA+
        imported.getQuantity()+COMMA+imported.getPricesImport()+COMMA+imported.getProvinceImport()+COMMA+
        imported.getTaxImport();


    FileUtils.writeFile(FILE_IMPORTED,lineImported);

  }

  public static void deleteImported() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap id muon xoa: ");
    String id = scanner.nextLine();
    List<productImported> list = new ArrayList<>();
    list = FileUtils.CSVToListImport();
    String lineImport = null;
    System.out.println("1.Yes\n" +
            "2.No");
    System.out.print("You choice: ");
    int choice = scanner.nextInt();
    switch (choice) {
      case 1:
        list.removeIf(productImported -> id.equals(productImported.getId()));
        if (list.isEmpty()) {
          FileUtils.overwriteFile(FILE_IMPORTED, "");
        } else {
          for (productImported imported : list) {
            lineImport=imported.getId()+ COMMA+imported.getMaSanpham()+COMMA+imported.getName()+COMMA+imported.getPrice()+COMMA+
                    imported.getQuantity()+COMMA+imported.getPricesImport()+COMMA+imported.getProvinceImport()+COMMA+
                    imported.getTaxImport();
          }
          FileUtils.overwriteFile(FILE_IMPORTED, lineImport);
        }
        System.out.println("Xoa thanh cong");
        break;
      case 2:
        break;
      default:
        System.out.println("Chi chon 1 hoac 2");
    }

  }
  public static void showImport(){
    List<productImported> importedList=new ArrayList<>();
    importedList=FileUtils.CSVToListImport();
    for (productImported imported : importedList) {
      imported.showInfo();
    }
  }
  }
