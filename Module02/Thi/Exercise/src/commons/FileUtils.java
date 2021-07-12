package commons;

import models.productExport;
import models.productImported;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

  public static void writeFile(String pathFile, String line) {
    try {
      FileWriter fileWriter = new FileWriter(pathFile, true);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      List<String> str = readFile(pathFile);

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

  public static ArrayList<productExport> CSVToListExport() {
    BufferedReader lineReader = null;
    ArrayList<productExport> listExport= new ArrayList<productExport>();

    try {
      String line;
      lineReader = new BufferedReader
              (new FileReader("D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Thi\\Exercise\\src\\data\\Export.csv"));
      lineReader.readLine(); //chỗ này sẽ đọc mất cái header
      while ((line = lineReader.readLine()) != null) {
        String[] splitData = line.split(" , ");
        if (splitData[0].equals("id")) {
          continue;
        }
        productExport export = new productExport();
        export.setId(splitData[0]);
        export.setMaSanpham(splitData[1]);
        export.setName(splitData[2]);
        export.setPrice(splitData[3]);
        export.setQuantity(splitData[4]);
        export.setProducers(splitData[5]);
        export.setPriceExport(splitData[6]);
        export.setCountryOfExport(splitData[7]);
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
    return listExport;
  }


  public static ArrayList<models.productImported> CSVToListImport() {
    BufferedReader lineReader = null;
    ArrayList<productImported> listImported= new ArrayList<productImported>();

    try {
      String line;
      lineReader = new BufferedReader
              (new FileReader("D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Thi\\Exercise\\src\\data\\Imported.csv"));
      while ((line = lineReader.readLine()) != null) {
        String[] splitData = line.split(" , ");
        if (splitData[0].equals("id")) {
          continue;
        }
        productImported imported = new productImported();
        imported.setId(splitData[0]);
        imported.setMaSanpham(splitData[1]);
        imported.setName(splitData[2]);
        imported.setPrice(splitData[3]);
        imported.setQuantity(splitData[4]);
        imported.setProducers(splitData[5]);
        imported.setPricesImport(splitData[6]);
        imported.setProvinceImport(splitData[7]);
        imported.setTaxImport(splitData[8]);
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
    return listImported;
  }

  public static void overwriteFile(String pathFile, String line) {
    try {
      FileWriter fileWriter = new FileWriter(pathFile, false); //true là ghi nối vào cuối file, //false là ghi đè
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      List<String> str = readFile(pathFile);
      bufferedWriter.write(line);
      bufferedWriter.newLine();
      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
