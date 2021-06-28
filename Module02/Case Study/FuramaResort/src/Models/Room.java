package Models;

import Models.Services;

public class Room extends Services {
  private String accompaniedService;

  public Room() {
  }

  public Room(String id, String nameServices, String areaUse, String rentPrice, String maxNumberOfPeople, String rentalType, String accompaniedService) {
    super(id, nameServices, areaUse, rentPrice, maxNumberOfPeople, rentalType);
    this.accompaniedService = accompaniedService;
  }

  public String getAccompaniedService() {
    return accompaniedService;
  }

  public void setAccompaniedService(String accompaniedService) {
    this.accompaniedService = accompaniedService;
  }

  @Override
  public void showInfo() {
    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
            getId(),
            getNameServices(),
            getAreaUse(),
            getRentPrice(),
            getMaxNumberOfPeople(),
            getRentalType(),
            getAccompaniedService());
  }
}
