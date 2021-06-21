package readfilecsv;

public class Country {
  private String startIp;
  private String endIp;
  private String str1;
  private String str2;
  private String countryCode;
  private String country;

  public Country() {
  }

  public Country(String startIp, String endIp, String str1, String str2, String countryCode, String country) {
    this.startIp = startIp;
    this.endIp = endIp;
    this.str1 = str1;
    this.str2 = str2;
    this.countryCode = countryCode;
    this.country = country;
  }

  public String getStartIp() {
    return startIp;
  }

  public void setStartIp(String startIp) {
    this.startIp = startIp;
  }

  public String getEndIp() {
    return endIp;
  }

  public void setEndIp(String endIp) {
    this.endIp = endIp;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getStr1() {
    return str1;
  }

  public void setStr1(String str1) {
    this.str1 = str1;
  }

  public String getStr2() {
    return str2;
  }

  public void setStr2(String str2) {
    this.str2 = str2;
  }

  @Override
  public String toString() {
    return "Country{" +
            "startIp='" + startIp + '\'' +
            ", endIp='" + endIp + '\'' +
            ", str1='" + str1 + '\'' +
            ", str2='" + str2 + '\'' +
            ", countryCode='" + countryCode + '\'' +
            ", country='" + country + '\'' +
            '}';
  }
}
