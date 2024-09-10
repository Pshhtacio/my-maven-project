package com.example.drone_dojo.exercise;

import java.util.Arrays;

public class DroneControl {

  private final Drone drone;

  public DroneControl(Drone drone) {
    this.drone = drone;
  }

  public void movement(String[] input) {

    for (String direction : input) {
      switch (direction) {
        case "U" -> drone.moveUp();
        case "D" -> drone.moveDown();
        case "R" -> drone.moveRight();
        case "L" -> drone.moveLeft();
        case "F" -> drone.moveForward();
        case "B" -> drone.moveBackward();
        default -> throw new IllegalArgumentException("Invalid command");
      }
    }
    System.out.println(drone.displayCoordinatesAndBatteryPercentage());
    drone.returnToBase();
  }


  public static void main(String[] args) {
    Drone drone = new Drone();
    DroneControl droneControl = new DroneControl(drone);

    droneControl.movement(new String[]{"R", "R", "U", "D", "D", "F", "F"});

    String returnToBaseMovement = drone.returnToBase();
    droneControl.movement(returnToBaseMovement.split(""));

    System.out.println(returnToBaseMovement + " " + drone.getBatteryPercentage());
  }
}
