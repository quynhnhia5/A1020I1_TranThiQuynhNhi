package Models;

import Models.Services;

public class Room extends Services {
   private String FreeService;

  public Room() {
  }

  public Room(String freeService) {
    FreeService = freeService;
  }

  public String getFreeService() {
    return FreeService;
  }

  public void setFreeService(String freeService) {
    FreeService = freeService;
  }

  @Override
  public String toString() {
    return "Room{" +
            "FreeService='" + FreeService + '\'' +
            '}';
  }

  @Override
  public void showInfor() {
super.toString();
  }
}
