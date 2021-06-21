package Models;

import com.sun.scenario.effect.impl.prism.PrImage;

public class Employee {

  private String idEmploy;
  private String nameEmploy;
  private String dateEmploy;
  private String idCardEmploy;
  private String phoneNumberEmploy;
  private String emailEmploy;
  private String levelEmploy;
  private String positionEmploy;
  private String salaryEmploy;

  public Employee() {
  }

  public Employee(String idEmploy, String nameEmploy, String dateEmploy, String idCardEmploy, String phoneNumberEmploy, String emailEmploy, String levelEmploy, String positionEmploy, String salaryEmploy) {
    this.idEmploy = idEmploy;
    this.nameEmploy = nameEmploy;
    this.dateEmploy = dateEmploy;
    this.idCardEmploy = idCardEmploy;
    this.phoneNumberEmploy = phoneNumberEmploy;
    this.emailEmploy = emailEmploy;
    this.levelEmploy = levelEmploy;
    this.positionEmploy = positionEmploy;
    this.salaryEmploy = salaryEmploy;
  }

  public String getIdEmploy() {
    return idEmploy;
  }

  public void setIdEmploy(String idEmploy) {
    this.idEmploy = idEmploy;
  }

  public String getNameEmploy() {
    return nameEmploy;
  }

  public void setNameEmploy(String nameEmploy) {
    this.nameEmploy = nameEmploy;
  }

  public String getDateEmploy() {
    return dateEmploy;
  }

  public void setDateEmploy(String dateEmploy) {
    this.dateEmploy = dateEmploy;
  }

  public String getIdCardEmploy() {
    return idCardEmploy;
  }

  public void setIdCardEmploy(String idCardEmploy) {
    this.idCardEmploy = idCardEmploy;
  }

  public String getPhoneNumberEmploy() {
    return phoneNumberEmploy;
  }

  public void setPhoneNumberEmploy(String phoneNumberEmploy) {
    this.phoneNumberEmploy = phoneNumberEmploy;
  }

  public String getEmailEmploy() {
    return emailEmploy;
  }

  public void setEmailEmploy(String emailEmploy) {
    this.emailEmploy = emailEmploy;
  }

  public String getLevelEmploy() {
    return levelEmploy;
  }

  public void setLevelEmploy(String levelEmploy) {
    this.levelEmploy = levelEmploy;
  }

  public String getPositionEmploy() {
    return positionEmploy;
  }

  public void setPositionEmploy(String positionEmploy) {
    this.positionEmploy = positionEmploy;
  }

  public String getSalaryEmploy() {
    return salaryEmploy;
  }

  public void setSalaryEmploy(String salaryEmploy) {
    this.salaryEmploy = salaryEmploy;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "idEmploy='" + idEmploy + '\'' +
            ", nameEmploy='" + nameEmploy + '\'' +
            ", dateEmploy='" + dateEmploy + '\'' +
            ", idCardEmploy='" + idCardEmploy + '\'' +
            ", phoneNumberEmploy='" + phoneNumberEmploy + '\'' +
            ", emailEmploy='" + emailEmploy + '\'' +
            ", levelEmploy='" + levelEmploy + '\'' +
            ", positionEmploy='" + positionEmploy + '\'' +
            ", salaryEmploy='" + salaryEmploy + '\'' +
            '}';
  }
}
