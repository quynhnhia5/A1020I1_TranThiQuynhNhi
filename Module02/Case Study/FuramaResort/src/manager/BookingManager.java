package manager;

import Commons.FileUtils;
import Models.*;

import java.util.*;

public class BookingManager {
  public final static String FILE_Booking = "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Booking.csv";
  public final static String COMMA = ", ";
  public static List<Booking> bookingList = new ArrayList<>();

  public static void addNewBook() {

    Scanner scanner = new Scanner(System.in);
    List<Customer> customerList = FileUtils.CSVToListCustomer();
    Collections.sort(customerList);
    Booking booking;
    for (int i = 0; i < customerList.size(); i++) {
      System.out.println("STT: " + i + ". " +
              customerList.get(i).getNameCustomer() + " " +
              customerList.get(i).getDateOfBirth() + " " +
              customerList.get(i).getGender() + " " +
              customerList.get(i).getIdCard() + " " +
              customerList.get(i).getPhoneNumber() + " " +
              customerList.get(i).getEmail() + " " +
              customerList.get(i).getTypeClient());

    }
    System.out.print("Please choice Customer to booking: ");
    int iCustomer = scanner.nextInt();
    Customer customer = customerList.get(iCustomer);


    System.out.println("----Menu Booking-----\n" +
            "1.Booking Villa\n" +
            "2.Booking House\n" +
            "3.Booking Room");
    System.out.print("Chon chuc nang muon thuc hien: ");
    int choice = scanner.nextInt();


    switch (choice) {
      case 1:
        Villa villa = (Villa) chooseService("Villa");

        booking = new Booking(customer, villa);
        bookingList.add(booking);
        String line;
        for (Booking booking1 : bookingList) {
          line = booking1.toString();
          FileUtils.writeFile(FILE_Booking, line);
        }
        System.out.println("Ban da Booking Villa thanh cong");

        break;
      case 2:
        House house = (House) chooseService("House");

        booking = new Booking(customer, house);
        bookingList.add(booking);
        String lineBooking;
        for (Booking booking1 : bookingList) {
          lineBooking = booking1.toString();
          FileUtils.writeFile(FILE_Booking, lineBooking);
        }
        System.out.println("Ban da Booking House thanh cong");
        break;
      default:
        Room room = (Room) chooseService("Room");

        booking = new Booking(customer, room);
        bookingList.add(booking);
        String lineBookingRoom;
        for (Booking booking1 : bookingList) {
          lineBookingRoom = booking1.toString();
          FileUtils.writeFile(FILE_Booking, lineBookingRoom);
        }
        System.out.println("Ban da Booking Room thanh cong");
        break;
    }


  }

  public static Services chooseService(String service) {
    Scanner sc = new Scanner(System.in);
    switch (service) {
      case "Villa": {
        ArrayList<Villa> listVilla = FileUtils.CSVToListVilla();

        for (int i = 0; i < listVilla.size(); i++) {
          System.out.print("\t" + i + ". ");
          listVilla.get(0).showInfo();
        }

        System.out.print("Choose service for booking: ");
        int choice = sc.nextInt();

        return listVilla.get(choice);
      }

      case "House": {
        ArrayList<House> listHouse = FileUtils.CSVToListHouse();

        for (int i = 0; i < listHouse.size(); i++) {
          System.out.print("\t" + i + ". ");
          listHouse.get(0).showInfo();
        }

        System.out.print("Choose service for booking: ");
        int choice = sc.nextInt();

        return listHouse.get(choice);
      }

      case "Room": {
        ArrayList<Room> listRoom = FileUtils.CSVToListRoom();

        for (int i = 0; i < listRoom.size(); i++) {
          System.out.print("\t" + i + ". ");
          listRoom.get(0).showInfo();
        }

        System.out.print("Choose service for booking: ");
        int choice = sc.nextInt();

        return listRoom.get(choice);
      }
    }
    return null;
  }
}
