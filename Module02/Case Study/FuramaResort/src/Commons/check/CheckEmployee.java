package Commons.check;

public class CheckEmployee {
  private static final String Level_REGEX="^[Trung Cap|Cao dang|Dai hoc|Sau dai hoc]$";
  private static final String position_REGEX="^[Le tan|Phuc vu|Chuyen vien |Giam sat |Quan ly|Gia doc ]$";
  private static final String name_REGEX="^[A-Z][a-z]*[\\s][A-Z][a-z]*";
  private static final String email_REGEX="^[a-z]*[@][gmail][.][a-z]*";

  public static boolean checkLevelEmp(String string){
    return string.matches(Level_REGEX);
  }
  public static boolean checkPositionEmp(String string){
   return string.matches(position_REGEX);
  }
  public static boolean checkNameEmp(String string){
    return string.matches(name_REGEX);
  }
  public static boolean checkEmailEmp(String string){
    return string.matches(email_REGEX);
  }



}
