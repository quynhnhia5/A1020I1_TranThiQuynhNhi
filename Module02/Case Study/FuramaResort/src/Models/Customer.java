package Models;

public class Customer implements Comparable<Customer> {

  private String nameCustomer;
  private String dateOfBirth;
  private String gender;
  private String idCard;
  private String phoneNumber;
  private String email;
  private String typeClient;
  private String address;


  public Customer() {
  }

  public Customer(String nameCustomer, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String typeClient, String address) {
    this.nameCustomer = nameCustomer;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.idCard = idCard;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.typeClient = typeClient;
    this.address = address;

  }

  public String getNameCustomer() {
    return nameCustomer;
  }

  public void setNameCustomer(String nameCustomer) {
    this.nameCustomer = nameCustomer;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTypeClient() {
    return typeClient;
  }

  public void setTypeClient(String typeClient) {
    this.typeClient = typeClient;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public void showInfor() {
    System.out.println( "Customer{" +
            "nameCustomer='" + nameCustomer + '\'' +
            ", dateOfBirth='" + dateOfBirth + '\'' +
            ", gender='" + gender + '\'' +
            ", idCard='" + idCard + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", email='" + email + '\'' +
            ", typeClient='" + typeClient + '\'' +
            ", address='" + address + '\'' +
            '}');
  }

  @Override
  public int compareTo(Customer customer) {
    if(this.nameCustomer.equals(customer.nameCustomer)){
      return this.dateOfBirth.compareTo(customer.dateOfBirth);
    }
    return this.getNameCustomer().compareTo(customer.getNameCustomer());
  }

}
