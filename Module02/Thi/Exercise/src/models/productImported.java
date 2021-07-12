package models;

public class productImported extends Product {

  private String pricesImport;
  private String provinceImport;
  private String taxImport;

  public productImported() {
  }

  public productImported(String id, String maSanpham, String name, String price, String quantity, String producers, String pricesImport, String provinceImport, String taxImport) {
    super(id, maSanpham, name, price, quantity, producers);
    this.pricesImport = pricesImport;
    this.provinceImport = provinceImport;
    this.taxImport = taxImport;
  }

  public String getPricesImport() {
    return pricesImport;
  }

  public void setPricesImport(String pricesImport) {
    this.pricesImport = pricesImport;
  }

  public String getProvinceImport() {
    return provinceImport;
  }

  public void setProvinceImport(String provinceImport) {
    this.provinceImport = provinceImport;
  }

  public String getTaxImport() {
    return taxImport;
  }

  public void setTaxImport(String taxImport) {
    this.taxImport = taxImport;
  }

  @Override
  public void showInfo() {
    System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%s\t%s\t%d\n",
            getId(),
            getMaSanpham(),
            getName(),
            getPrice(),
            getQuantity(),
            getQuantity(),
            getPricesImport(),
            getProvinceImport(),
            getTaxImport());
  }

}
