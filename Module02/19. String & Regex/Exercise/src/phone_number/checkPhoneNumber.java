package phone_number;

public class checkPhoneNumber {
  private static String regex= "";

  public static boolean checkPhoneNumber(String str){
    regex="^[\\d]{1,2}[-][0][\\d]{9}$";
    return str.matches(regex);
  }

}
