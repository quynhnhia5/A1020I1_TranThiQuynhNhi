package Models.Commons;



import Models.BEAN.BenhNhan;
import Models.BEAN.BenhNhanBaoHiemXaHoi;
import Models.BEAN.BenhNhanBaoHiemYTe;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {


  public static final String LINE_BENHNHAN = "id, hoTen, ngayNhapVien, ngayRaVien, phongTheoYeuCau, " +
          "tinhHoaDonVienPhi " + "\n";


  public static void writeFile(String pathFile, String line) {
    try {
      FileWriter fileWriter = new FileWriter(pathFile, true); //true là ghi nối vào cuối file, //false là ghi đè
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      List<String> str = readFile(pathFile);
      if (str.isEmpty()) {

        switch (pathFile) {
          case "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\DSBENHNHAN.txt":
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
          case "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\DSBENHNHAN.txt":
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


  public static ArrayList<BenhNhanBaoHiemYTe> fileListBenhNhanBHYT() {
    BufferedReader lineReader = null;
    ArrayList<BenhNhanBaoHiemYTe> list = new ArrayList<BenhNhanBaoHiemYTe>();

    try {
      String line;
      lineReader = new BufferedReader
              (new FileReader("D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\DSBENHNHAN.txt"));
      lineReader.readLine();
      while ((line = lineReader.readLine()) != null) {
        String[] splitData = line.split(" , ");
        if (splitData[0].equals("id")) {
          continue;
        }
        BenhNhanBaoHiemYTe benhNhan= new BenhNhanBaoHiemYTe() {

        };
        benhNhan.setId(splitData[0]);
        benhNhan.setHoTen(splitData[1]);
        BenhNhan.setNgayNhapVien(splitData[2]);
        BenhNhan.setNgayRaVien(splitData[3]);
        BenhNhan.setPhongTheoYeuCau(Boolean.parseBoolean(splitData[4]));
        benhNhan.tinhHoaDonVienPhi();

        list.add(benhNhan);
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
    return list;
  }

  public static ArrayList<BenhNhanBaoHiemXaHoi> fileListBenhNhanBHXH() {
    BufferedReader lineReader = null;
    ArrayList<BenhNhanBaoHiemXaHoi> list = new ArrayList<BenhNhanBaoHiemXaHoi>();

    try {
      String line;
      lineReader = new BufferedReader
              (new FileReader("D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\Case Study\\FuramaResort\\src\\Data\\DSBENHNHAN.txt"));
      lineReader.readLine();
      while ((line = lineReader.readLine()) != null) {
        String[] splitData = line.split(" , ");
        if (splitData[0].equals("id")) {
          continue;
        }
        BenhNhanBaoHiemXaHoi benhNhan= new BenhNhanBaoHiemXaHoi() {

        };
        benhNhan.setId(splitData[0]);
        benhNhan.setHoTen(splitData[1]);
        BenhNhan.setNgayNhapVien(splitData[2]);
        BenhNhan.setNgayRaVien(splitData[3]);
        BenhNhan.setPhongTheoYeuCau(Boolean.parseBoolean(splitData[4]));
        benhNhan.tinhHoaDonVienPhi();

        list.add(benhNhan);
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
    return list;
  }


}
