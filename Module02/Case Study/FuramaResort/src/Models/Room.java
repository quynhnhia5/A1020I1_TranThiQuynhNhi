package Models;

import Models.Services;

public class Room extends Services {
  private String accompaniedService;

  public Room() {
  }

  public Room(String id, String nameServices, String areaUse, String rentPrice, String maxNumberOfPeople, String rentalType, String freeService) {
    super(id, nameServices, areaUse, rentPrice, maxNumberOfPeople, rentalType);
    accompaniedService = accompaniedService;
  }

  public String getAccompaniedService() {
    return accompaniedService;
  }

  public void setAccompaniedService(String accompaniedService) {
    this.accompaniedService = accompaniedService;
  }

  @Override
  public void showInfo() {
    System.out.println("Services{" +
            "id='" + getId() + '\'' +
            ", nameServices='" + getNameServices() + '\'' +
            ", areUse='" + getAreaUse() + '\'' +
            ", rentPrice='" + getRentPrice() + '\'' +
            ", maxNumberOfPeople='" + getMaxNumberOfPeople() + '\'' +
            ", rentalType='" + getRentalType() + '\'' +
            ", accompaniedService='" + accompaniedService + '\'' +
            '}');
  }
}
