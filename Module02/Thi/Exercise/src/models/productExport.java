package models;

public class productExport extends Product {

  private String priceExport;
  private String countryOfExport;


  public productExport() {
  }

  public productExport(String id, String maSanpham, String name, String price, String quantity, String producers, String priceExport, String countryOfExport) {
    super(id, maSanpham, name, price, quantity, producers);
    this.priceExport = priceExport;
    this.countryOfExport = countryOfExport;
  }

  public String getPriceExport() {
    return priceExport;
  }


  public void setPriceExport(String priceExport) {
    this.priceExport = priceExport;
  }

  public String getCountryOfExport() {
    return countryOfExport;
  }

  public void setCountryOfExport(String countryOfExport) {
    this.countryOfExport = countryOfExport;
  }

  @Override
  public void showInfo() {
    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
            getId(),
            getMaSanpham(),
            getName(),
            getPrice(),
            getQuantity(),
            getProducers(),
            getPriceExport(),
            getCountryOfExport());
  }
  }

