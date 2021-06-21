package readfilecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static final String FILE_NAME = "D:\\Codegym\\A1020I1_TranThiQuynhNhi\\Module02\\16. IO Text File\\Exercise\\src\\data\\country.csv";
  public static final String COMMA = ",";

  public static void main(String[] args) throws IOException {
    List<Country> countryList = new ArrayList<>();

    Reader reader = new FileReader(FILE_NAME);
    BufferedReader bufferedReader = new BufferedReader(reader);

    String line;
    while ((line = bufferedReader.readLine()) != null) {
      String[] info = line.split(",");

      Country country = new Country(info[0], info[1], info[2], info[3], info[4], info[5]);
      countryList.add(country);
    }

    for (Country country : countryList) {
      System.out.println(country);
    }


  }
}
