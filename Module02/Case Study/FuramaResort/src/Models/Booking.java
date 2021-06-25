package Models;

public class Booking {

  private Customer customer;
  private Services service;

  public Booking() {
  }

  public Booking(Customer customer, Services service) {
    this.customer = customer;
    this.service = service;
  }

  @Override
  public String toString() {
    return customer.getIdCard() + ", " + customer.getNameCustomer() + ", " +
          service.getId() + ", " + service.getNameServices();
  }
}
