package models;

public  abstract  class Product {

  private String id;
  private String maSanpham;
  private String name;
  private String price;
  private String quantity;
  private String producers;

  public Product() {
  }

  public Product(String id, String maSanpham, String name, String price, String quantity, String producers) {
    this.id = id;
    this.maSanpham = maSanpham;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.producers = producers;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMaSanpham() {
    return maSanpham;
  }

  public void setMaSanpham(String maSanpham) {
    this.maSanpham = maSanpham;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public String getProducers() {
    return producers;
  }

  public void setProducers(String producers) {
    this.producers = producers;
  }

  public abstract void showInfo();
}
