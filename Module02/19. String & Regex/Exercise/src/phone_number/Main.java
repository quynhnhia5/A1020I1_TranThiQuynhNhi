package phone_number;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter phone number: ");
    String phoneNumber=scanner.nextLine();
    while (!checkPhoneNumber.checkPhoneNumber(phoneNumber)){
      System.out.println("Invalid!!! please Input again!!!");
      phoneNumber=scanner.nextLine();
    }

  }
}
