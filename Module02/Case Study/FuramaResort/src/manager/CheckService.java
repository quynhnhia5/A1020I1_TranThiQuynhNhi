package manager;

public class CheckService {

  private static String regex=" ";
  public static boolean checkID(String strID){
    regex="^(SV[VL]|[HO]|[RO])-[\\d]{4}$";
    return strID.matches(regex);
  }
  public static boolean checkName(String strName){
    regex="^[A-Z][\\w]$";
    return strName.matches(regex);
  }
  public static boolean checkArea(String strArea){
    regex="^[3-9][\\d]{1,2}|[\\d]{3}$";
    return strArea.matches(regex);
  }

  public static boolean checkrentPrice(String strrentPrice){
    regex="^[\\d]$";
    return strrentPrice.matches(regex);
  }

  public static boolean checkMaxNumber(String strMaxNumber){
    regex="^[1-9]|([1][\\d])$";
    return strMaxNumber.matches(regex);
  }

  public static boolean checkAccompanied(String strAccompanied){
    regex="^(massage|karaoke|food|drink|car)$";
    return strAccompanied.matches(regex);
  }

  public static boolean checkNumberOfFloor(String strNumberOfFloor){
    regex="^[\\d]$";
    return strNumberOfFloor.matches(regex);
  }

  public static boolean checkTypeRen(String strTypeRen){
    regex="^(nam|thang|ngay|gio)$";
    return strTypeRen.matches(regex);
  }
  public static boolean checkStandardRoom(String str) {
    regex = "^[A-Z][\\w]{1,100}$";
    return str.matches(regex);
  }


}
