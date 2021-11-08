package Model.BEAN.contract;

public class attach_service {
  private int attach_service_id;
  private  String attach_service_name;
  private int attach_service_unit;
  private String attach_service_status;

  public attach_service() {
  }

  public attach_service(int attach_service_id, String attach_service_name, int attach_service_unit, String attach_service_status) {
    this.attach_service_id = attach_service_id;
    this.attach_service_name = attach_service_name;
    this.attach_service_unit = attach_service_unit;
    this.attach_service_status = attach_service_status;
  }

  public int getAttach_service_id() {
    return attach_service_id;
  }

  public void setAttach_service_id(int attach_service_id) {
    this.attach_service_id = attach_service_id;
  }

  public String getAttach_service_name() {
    return attach_service_name;
  }

  public void setAttach_service_name(String attach_service_name) {
    this.attach_service_name = attach_service_name;
  }

  public int getAttach_service_unit() {
    return attach_service_unit;
  }

  public void setAttach_service_unit(int attach_service_unit) {
    this.attach_service_unit = attach_service_unit;
  }

  public String getAttach_service_status() {
    return attach_service_status;
  }

  public void setAttach_service_status(String attach_service_status) {
    this.attach_service_status = attach_service_status;
  }
}
