package Models;

import Models.Services;

public class Villa extends Services {

  private String standardRoom;
  private String describeConvenient;
  private String areaPool;
  private String numberOfFloors;

  public Villa() {
  }


  public Villa(String id, String nameServices, String areaUse, String rentPrice, String maxNumberOfPeople, String rentalType, String standardRoom, String describeConvenient, String areaPool, String numberOfFloors) {
    super(id, nameServices,areaUse, rentPrice, maxNumberOfPeople, rentalType);
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
  public void showInfo() {

    System.out.println("Services{" +
            "id='" + getId() + '\'' +
            ", nameServices='" + getNameServices() + '\'' +
            ", areaUse='" + getAreaUse() + '\'' +
            ", rentPrice='" + getRentPrice() + '\'' +
            ", maxNumberOfPeople='" + getMaxNumberOfPeople() + '\'' +
            ", rentalType='" + getRentalType() + '\'' +
            ", standardRoom='" + standardRoom + '\'' +
            ", describeConvenient='" + describeConvenient + '\'' +
            ", areaPool='" + areaPool + '\'' +
            ", numberOfFloors='" + numberOfFloors + '\'' +
            '}');
  }

}
