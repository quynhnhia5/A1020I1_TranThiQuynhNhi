package Models;

import Models.Services;

public class Villa extends Services {

  private String standardRoom;
  private String describeConvenient;
  private String areaPool;
  private String numberOfFloors;

  public Villa() {
  }

  public Villa(String standardRoom, String describeConvenient, String areaPool, String numberOfFloors) {
    this.standardRoom = standardRoom;
    this.describeConvenient = describeConvenient;
    this.areaPool = areaPool;
    this.numberOfFloors = numberOfFloors;
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

  public String getNumberOfFloors() {
    return numberOfFloors;
  }

  public void setNumberOfFloors(String numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }


  @Override
  public String toString() {
    return "Villa{" +
            "standardRoom='" + standardRoom + '\'' +
            ", describeConvenient='" + describeConvenient + '\'' +
            ", areaPool='" + areaPool + '\'' +
            ", numberOfFloors='" + numberOfFloors + '\'' +
            '}';
  }

  @Override
  public void showInfor() {
     super.toString();
  }

}
