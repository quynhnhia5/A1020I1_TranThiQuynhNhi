package manager;

import Commons.FileUtils;
import Commons.Validate;
import Models.Employee;

import java.security.KeyStore;
import java.util.*;

public class EmployManager {
  public static final String FILE_EMPLOY="D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Employee.csv";
  public static final String COMMA= ",";

  public static List<Employee> employeeList=new ArrayList<>();


  public static void addEmployee(){
     Scanner scanner=new Scanner(System.in);
    Validate validate=new Validate();

    System.out.print("Enter ID: ");
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
    String emailEmp=validate.inputEmail();

    System.out.print("Nhap trinh do cua nhan vien: ");
    String levelEmp=scanner.nextLine();

    System.out.print("Nhap vi tri cua nhan vien: ");
    String posEmp=scanner.nextLine();

    System.out.print("Nhap luong cua nhan vien: ");
    String salaryEmp=scanner.nextLine();

    Employee employee=new Employee(idEmp,nameEmp,dateEmp,idCardEmp,phoneNumberEmp,emailEmp,
            levelEmp,posEmp,salaryEmp);
    employeeList.add(employee);

    String lineEmp;
    lineEmp=employee.getIdEmploy()+COMMA+employee.getNameEmploy()+COMMA
            +employee.getDateEmploy()+COMMA+employee.getIdCardEmploy()+COMMA
            +employee.getPhoneNumberEmploy()+COMMA+employee.getEmailEmploy()+COMMA
            +employee.getLevelEmploy()+COMMA+employee.getPositionEmploy()+COMMA
            +employee.getSalaryEmploy();
    FileUtils.witerFile(FILE_EMPLOY,lineEmp);



  }
  public static void showEmp(){
    Map<String, Employee> empMap=new TreeMap<>();
    List<Employee> employeeList=new ArrayList<>();
    employeeList=FileUtils.CSVToListEmployee();
    for (int i = 0; i < employeeList.size(); i++) {
      empMap.put(employeeList.get(i).getIdEmploy(), employeeList.get(i));
    }
    for (Map.Entry<String, Employee> stringEmployeeEntry : empMap.entrySet()) {
      System.out.println(stringEmployeeEntry.getKey()+stringEmployeeEntry.getValue());
    }

  }


}
