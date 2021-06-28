package manager;

import Commons.FileUtils;
import Commons.Validate;
import Models.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static Controllers.MainController.displayMainMenu;

public class CustomerManager {

  public static final String FILE_CUSTOMER="D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Customer.csv";
  public static final String COMMA= " , ";
  public static List<Customer> listCustomer=new ArrayList<>();

  public static void addNewCustomer(){

    Scanner scanner=new Scanner(System.in);
    Validate validate=new Validate();

    System.out.print("Nhap ten Customer: ");
    String nameCustomer=validate.inputNameCus();

    System.out.print("Nhap Ngay sinh: ");
    String dateOfBirth=scanner.nextLine();
//    validate.inputDateOfBirth(dateOfBirth);

    System.out.print("Nhap Gioi tinh: ");
    String gender=validate.inputGender();

    System.out.print("Nhap so CMND: ");
    String idCard=validate.inputIdCard();

    System.out.print("Nhap so Dien Thoai: ");
    String phoneNumber=scanner.nextLine();

    System.out.print("Nhap Email: ");
    String email=validate.inputEmail();

    System.out.print("Nhap Loại Khach hang: ");
    String typeClient=scanner.nextLine();

    System.out.print("Nhap Dia chi: ");
    String address=scanner.nextLine();

    System.out.print("Su dung dich vu: ");
    String service=scanner.nextLine();

   Customer customer=new Customer(nameCustomer,dateOfBirth,gender,idCard,phoneNumber,email,typeClient,address);
   listCustomer.add(customer);

   String lineCustomer;
   lineCustomer=customer.getNameCustomer()+COMMA+customer.getDateOfBirth()+COMMA
           +customer.getGender()+COMMA+customer.getIdCard()+COMMA+customer.getPhoneNumber()+COMMA
           +customer.getEmail()+COMMA+customer.getTypeClient()+COMMA
           +customer.getAddress();
    FileUtils.writeFile(FILE_CUSTOMER,lineCustomer);
  }

  public static void showInformationCustomers(){
    System.out.println("-----List customer-------");


    listCustomer = FileUtils.CSVToListCustomer();
    Collections.sort(listCustomer);
    for (Customer customer : listCustomer) {
      customer.showInfor();
    }
    displayMainMenu();
  }

}
