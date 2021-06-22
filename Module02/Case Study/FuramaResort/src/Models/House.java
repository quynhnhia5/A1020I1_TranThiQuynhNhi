package Models;

import Models.Services;

public class House extends Services {

  private String standardRoom;
  private String describeConvenient;
  private String numberOfFloors;

  public House() {
  }

  public House(String id, String nameServices, String areaUse, String rentPrice, String maxNumberOfPeople, String rentalType, String standardRoom, String describeConvenient, String numberOfFloors) {
    super(id, nameServices, areaUse, rentPrice, maxNumberOfPeople, rentalType);
    this.standardRoom = standardRoom;
    this.describeConvenient = describeConvenient;
    this.numberOfFloors =numberOfFloors;
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

  public String getNumberOfFloors() {
    return numberOfFloors;
  }

  public void setNumberOfFloors(String numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }

//  @Override
//  public String toString() {
//    return "House{" +
//            "standardRoom='" + standardRoom + '\'' +
//            ", describeConvenient='" + describeConvenient + '\'' +
//            ", numberofFloors='" + numberOfFloors + '\'' +
//            '}';
//  }

  @Override
  public void showInfo() {
    System.out.println("Services{" +
            "id='" + getId() + '\'' +
            ", nameServices='" + getNameServices() + '\'' +
            ", areUse='" + getAreaUse() + '\'' +
            ", rentPrice='" + getRentPrice() + '\'' +
            ", maxNumberOfPeople='" + getMaxNumberOfPeople() + '\'' +
            ", rentalType='" + getRentalType() + '\'' +
            ", standardRoom='" + standardRoom + '\'' +
            ", describeConvenient='" + describeConvenient + '\'' +
            ", numberOfFloors='" + numberOfFloors + '\'' +
            '}');
  }
}
