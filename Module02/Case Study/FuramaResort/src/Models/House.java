package Models;

import Models.Services;

public class House extends Services {

  private String standardRoom;
  private String describeConvenient;
  private String areaPool;

  public House() {
  }

  public House(String standardRoom, String describeConvenient, String areaPool) {
    this.standardRoom = standardRoom;
    this.describeConvenient = describeConvenient;
    this.areaPool = areaPool;
  }

  public String getStandardRoom() {
    return standardRoom;
  }

  public void setStandardRoom(String standardRoom) {
    this.standardRoom = standardRoom;
  }

  public String getDescribeConvenient() {
    return describeConvenient;
  }

  public void setDescribeConvenient(String describeConvenient) {
    this.describeConvenient = describeConvenient;
  }

  public String getAreaPool() {
    return areaPool;
  }

  public void setAreaPool(String areaPool) {
    this.areaPool = areaPool;
  }

  @Override
  public String toString() {
    return "House{" +
            "standardRoom='" + standardRoom + '\'' +
            ", describeConvenient='" + describeConvenient + '\'' +
            ", areaPool='" + areaPool + '\'' +
            '}';
  }

  @Override
  public void showInfor() {
super.toString();
  }
}
