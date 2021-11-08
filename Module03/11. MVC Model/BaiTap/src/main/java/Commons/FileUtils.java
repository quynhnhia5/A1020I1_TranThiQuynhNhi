package Commons;

import Models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

  public static final String LINE_BENHNHAN = "id, nameServices, areaUse, rentPrice, maxNumberOfPeople, " +
          "typeRent, standardRoom, describeConvenient, areaPool, numberOfFloors " + "\n";


  public static void writeFile(String pathFile, String line) {
    try {
      FileWriter fileWriter = new FileWriter(pathFile, true); //true là ghi nối vào cuối file, //false là ghi đè
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      List<String> str = readFile(pathFile);
      if (str.isEmpty()) {

        switch (pathFile) {
          case "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Villa.csv":
            bufferedWriter.write(LINE_BENHNHAN);
            break;
        }
      }

      bufferedWriter.write(line);
      bufferedWriter.newLine();
      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public static void overwriteFile(String pathFile, String line) {
    try {
      FileWriter fileWriter = new FileWriter(pathFile, false); //true là ghi nối vào cuối file, //false là ghi đè
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      List<String> str = readFile(pathFile);
      if (str.isEmpty()) {

        switch (pathFile) {
          case "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Villa.csv":
            bufferedWriter.write(LINE_VILLA);
            break;
          case "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\House.csv":
            bufferedWriter.write(LINE_HOUSE);
            break;
          case "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Room.csv":
            bufferedWriter.write(LINE_ROOM);
            break;
          case "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Customer.csv":
            bufferedWriter.write(LINE_CUSTOMER);
            break;
          default:
            bufferedWriter.write(LINE_BOOKING);
            break;
        }
      }

      bufferedWriter.write(line);
      bufferedWriter.newLine();
      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static List<String> readFile(String pathFile) {
    ArrayList<String> listLine = new ArrayList<>();

    try {
      FileReader fileReader = new FileReader(pathFile);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      String line = null;
      while ((line = bufferedReader.readLine()) != null) {
        listLine.add(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return listLine;

  }

  public static ArrayList<Villa> CSVToListVilla() {
    BufferedReader lineReader = null;
    ArrayList<Villa> listVilla = new ArrayList<Villa>();

    try {
      String line;
      lineReader = new BufferedReader
              (new FileReader("D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Villa.csv"));
      lineReader.readLine(); //chỗ này sẽ đọc mất cái header
      while ((line = lineReader.readLine()) != null) {
        String[] splitData = line.split(" , ");
        if (splitData[0].equals("id")) {
          continue;
        }
        Villa villa = new Villa();
        villa.setId(splitData[0]);
        villa.setNameServices(splitData[1]);
        villa.setAreUse(splitData[2]);
        villa.setRentPrice(splitData[3]);
        villa.setMaxNumberOfPeople(splitData[4]);
        villa.setRentalType(splitData[5]);
        villa.setStandardRoom(splitData[6]);
        villa.setDescribeConvenient(splitData[7]);
        villa.setAreaPool(splitData[8]);
        villa.setNumberOfFloors(splitData[9]);
        listVilla.add(villa);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      try {
        lineReader.close();
      } catch (Exception exception) {
        exception.printStackTrace();
      }

    }
    return listVilla;
  }

  public static ArrayList<House> CSVToListHouse() {
    BufferedReader lineReader = null;
    ArrayList<House> listHouse = new ArrayList<House>();

    try {
      String line;
      lineReader = new BufferedReader
              (new FileReader("D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\House.csv"));
      lineReader.readLine();
      while ((line = lineReader.readLine()) != null) {
        String[] splitData = line.split(" , ");
        if (splitData[0].equals("id")) {
          continue;
        }
        House house = new House();

        house.setId(splitData[0]);
        house.setNameServices(splitData[1]);
        house.setAreUse(splitData[2]);
        house.setRentPrice(splitData[3]);
        house.setMaxNumberOfPeople(splitData[4]);
        house.setRentalType(splitData[5]);
        house.setStandardRoom(splitData[6]);
        house.setDescribeConvenient(splitData[7]);
        house.setNumberOfFloors(splitData[8]);
        listHouse.add(house);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      try {
        lineReader.close();
      } catch (Exception exception) {
        exception.printStackTrace();
      }

    }
    return listHouse;
  }

  public static ArrayList<Room> CSVToListRoom() {
    BufferedReader lineReader = null;
    ArrayList<Room> listRoom = new ArrayList<Room>();

    try {
      String line;
      lineReader = new BufferedReader
              (new FileReader("D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Room.csv"));
      lineReader.readLine();

      while ((line = lineReader.readLine()) != null) {
        String[] splitData = line.split(" , ");
        if (splitData[0].equals("id")) {
          continue;
        }
        Room room = new Room();

        room.setId(splitData[0]);
        room.setNameServices(splitData[1]);
        room.setAreUse(splitData[2]);
        room.setRentPrice(splitData[3]);
        room.setMaxNumberOfPeople(splitData[4]);
        room.setRentalType(splitData[5]);
        room.setAccompaniedService(splitData[6]);
        listRoom.add(room);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      try {
        lineReader.close();
      } catch (Exception exception) {
        exception.printStackTrace();
      }

    }
    return listRoom;
  }

  public static ArrayList<Customer> CSVToListCustomer() {
    BufferedReader lineReader = null;
    ArrayList<Customer> listCustomer = new ArrayList<Customer>();

    try {
      String line;
      lineReader = new BufferedReader
              (new FileReader("D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Customer.csv"));
      lineReader.readLine();
      while ((line = lineReader.readLine()) != null) {
        String[] splitData = line.split(" , ");
        if (splitData[0].equals("id")) {
          continue;
        }

        Customer customer = new Customer();
        customer.setNameCustomer(splitData[0]);
        customer.setDateOfBirth(splitData[1]);
        customer.setGender(splitData[2]);
        customer.setIdCard(splitData[3]);
        customer.setPhoneNumber(splitData[4]);
        customer.setEmail(splitData[5]);
        customer.setTypeClient(splitData[6]);
        customer.setAddress(splitData[7]);
        listCustomer.add(customer);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      try {
        lineReader.close();
      } catch (Exception exception) {
        exception.printStackTrace();
      }

    }
    return listCustomer;
  }

  public static ArrayList<Employee> CSVToListEmployee() {
    BufferedReader lineReader = null;
    ArrayList<Employee> listEmploy = new ArrayList<Employee>();

    try {
      String line;
      lineReader = new BufferedReader
              (new FileReader("D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\Employee.csv"));
      while ((line = lineReader.readLine()) != null) {
        String[] splitData = line.split(",");
        if (splitData[0].equals("id")) {
          continue;
        }
        Employee employee = new Employee();


        employee.setIdEmploy(splitData[0]);
        employee.setNameEmploy(splitData[1]);
        employee.setDateEmploy(splitData[2]);
        employee.setIdCardEmploy(splitData[3]);
        employee.setPhoneNumberEmploy(splitData[4]);
        employee.setEmailEmploy(splitData[5]);
        employee.setLevelEmploy(splitData[6]);
        employee.setPositionEmploy(splitData[7]);
        employee.setSalaryEmploy(splitData[8]);
        listEmploy.add(employee);
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    } finally {
      try {
        lineReader.close();
      } catch (Exception exception) {
        exception.printStackTrace();
      }

    }
    return listEmploy;
  }

}
