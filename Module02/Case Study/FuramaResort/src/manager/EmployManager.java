package manager;

import Models.Employee;
import sun.security.timestamp.TSRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EmployManager {

  public static List<Employee> employeeList=new ArrayList<>();


  public static void addEmployee(){
     Scanner scanner=new Scanner(System.in);

    System.out.print("Nhap id nhan vien: ");
    String idEmp=scanner.nextLine();

    System.out.print("Nhap ho ten nhan vien: ");
    String nameEmp=scanner.nextLine();

    System.out.print("Nhap ngay sinh nhan vien: ");
    String dateEmp=scanner.nextLine();

    System.out.print("Nhap so CMND nhan vien: ");
    String idCardEmp=scanner.nextLine();

    System.out.print("Nhap so dien thoai cua nhan vien: ");
    String phoneNumberEmp=scanner.nextLine();

    System.out.print("Nhap Email cua nhan vien: ");
    String emailEmp=scanner.nextLine();

    System.out.print("Nhap trinh do cua nhan vien: ");
    String levelEmp=scanner.nextLine();

    System.out.print("Nhap vi tri cua nhan vien: ");
    String posEmp=scanner.nextLine();

    System.out.print("Nhap luong cua nhan vien: ");
    String salaryEmp=scanner.nextLine();

    employeeList.add(e)




  }


}
