package manager;

import commons.FileUtils;
import bean.productExport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductExportManager {

  public static final String FILE_EXPORT = "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Thi\\Exercise\\src\\data\\Export.csv";
  public static final String COMMA = " , ";

  public static void addNewProductExport() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap ID Ssan pham: ");
    String id = scanner.nextLine();

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

    System.out.print("Nhap gia xuat khau: ");
    String priceExport = scanner.nextLine();


    System.out.print("Nhap quoc gia nhap san pham ");
    String countryOfExport = scanner.nextLine();

    productExport export=new productExport(id,maSanPham,name,price,quantity,producer,priceExport,countryOfExport);

    String lineExport;

    lineExport=export.getId()+COMMA+export.getMaSanpham()+COMMA+export.getName()+COMMA+export.getPrice()+COMMA+
            export.getQuantity()+COMMA+COMMA+export.getPriceExport()+COMMA+export.getCountryOfExport();

    FileUtils.writeFile(FILE_EXPORT,lineExport);

  }

  public static void deleteExports() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap id muon xoa: ");
    String id = scanner.nextLine();
    List<bean.productExport> list = new ArrayList<>();
    list = FileUtils.CSVToListExport();
    String lineExport= null;
    System.out.println("1.Yes\n" +
            "2.No");
    System.out.print("You choice: ");
    int choice = scanner.nextInt();
    switch (choice) {
      case 1:
        list.removeIf(productExport -> id.equals(productExport.getId()));
        if (list.isEmpty()) {
          FileUtils.overwriteFile(FILE_EXPORT, "");
        } else {
          for (productExport export : list) {
            lineExport=export.getId()+COMMA+export.getMaSanpham()+COMMA+export.getName()+COMMA+export.getPrice()+COMMA+
                    export.getQuantity()+COMMA+COMMA+export.getPriceExport()+COMMA+export.getCountryOfExport();

          }
          FileUtils.overwriteFile(FILE_EXPORT, lineExport);
        }
        System.out.println("Xoa thanh cong");
        break;
      case 2:
        break;
      default:
        System.out.println("Chi chon 1 hoac 2");
    }

  }

  public static void showExport(){
    List<productExport> exportList=new ArrayList<>();
    exportList=FileUtils.CSVToListExport();
    for (productExport export : exportList) {
      export.showInfo();
    }
  }

  }
