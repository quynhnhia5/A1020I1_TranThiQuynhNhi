package Commons.check;

public class CheckService {
  private static final String ID_REGEX  = "^SV([VL]{2}|[HO]{2}|[RO]{2})-[\\d]{4}$";
  private static final String Name_REGEX = "^[A-Z][a-z\\s]*";
  private static final double min_Area = 30;
  private static final String rentPrice_REGEX = "^[\\d]*";
  private static final String maxNumber_REGEX = "^[1-9]|([1][\\d])$";
  private static final String Accompanied_REGEX = "^(massage|karaoke|food|drink|car)$";
  private static final String NumberOfFloor_REGEX = "^[\\d]$";
  private static final String TypeRen_REGEX = "^(nam|thang|ngay|gio)$";
  private static final String StandardRoom_REGEX = "^[A-Z][\\w]{1,100}$";


  public static boolean checkID(String strID) {
    return (strID.matches(ID_REGEX));
  }

  public static boolean checkName(String strName) {
    return strName.matches(Name_REGEX);
  }

  public static boolean checkArea(double strArea) {
    return strArea > 30;
  }

  public static boolean checkrentPrice(String strrentPrice) {
    return strrentPrice.matches(rentPrice_REGEX);
  }

  public static boolean checkMaxNumber(String strMaxNumber) {
    return strMaxNumber.matches(maxNumber_REGEX);
  }

  public static boolean checkAccompanied(String strAccompanied) {
    return strAccompanied.matches(Accompanied_REGEX);
  }

  public static boolean checkNumberOfFloor(String strNumberOfFloor) {
    return strNumberOfFloor.matches(NumberOfFloor_REGEX);
  }

  public static boolean checkTypeRen(String strTypeRen) {
    return strTypeRen.matches(TypeRen_REGEX);
  }

  public static boolean checkStandardRoom(String str) {
    return str.matches(StandardRoom_REGEX);
  }


}
