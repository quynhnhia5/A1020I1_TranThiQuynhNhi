package Commons.check;

public class CheckEmployee {
  private static final String Level_REGEX="^[Trung Cap|Cao dang|Dai hoc|Sau dai hoc]$";
  private static final String position_REGEX="^[Le tan|Phuc vu|Chuyen vien |Giam sat |Quan ly|Gia doc ]$";

  public static boolean checkLevelEmp(String string){
    return string.matches(Level_REGEX);
  }
  public static boolean checkPositionEmp(String string){
   return string.matches(position_REGEX);
  }



}
