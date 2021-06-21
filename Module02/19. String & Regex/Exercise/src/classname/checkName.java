package classname;

import javax.print.DocFlavor;

public class checkName {
 private static String regex= "";

 public static boolean checkName(String strName){
   regex = "^([CAP][\\d]{4}[GHIKLM])$";
   return strName.matches(regex);
 }
}
