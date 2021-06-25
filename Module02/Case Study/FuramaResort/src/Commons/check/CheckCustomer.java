package Commons.check;


public class CheckCustomer {
  private static final String name_REGEX = "^([A-Z][a-z]*[\\s])*[A-Z][a-z]*$";
  private static final String email_REGEX = "^[A-Za-z]+@gmail.[a-z]*";
  private static final String gender_REGEX="^Male$|Female$|Unknow$";
  private static final String idCard_REGEX="[\\d]{3}[\\s][\\d]{3}[\\s][\\d]{3}$";
  private static final String dateOfBirth_REGEX="^([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/[([1][9][9][0-9])|([2][0][0][0-3])]$";

  public static boolean checkName(String string) {
    return string.matches(name_REGEX);
  }

  public static boolean checkEmail(String string) {
    return string.matches(email_REGEX);
  }

  public static boolean checkGender(String string){
    return string.matches(gender_REGEX);
  }

  public static boolean checkIdCard(String string){
    return string.matches(idCard_REGEX);
  }

  public static boolean checkDateOfBirth(String string){
    return string.matches(dateOfBirth_REGEX);
  }
}
