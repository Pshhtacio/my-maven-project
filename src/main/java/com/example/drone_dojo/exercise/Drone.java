package com.example.drone_dojo.exercise;

public class Drone {

  private static int y = 0;
  private static int x = 0;
  private static int z = 0;
  private int batteryPercentage = 100;

  public void moveUp() {
    y++;
    batteryPercentage--;
  }

  public void moveDown() {
    y--;
    batteryPercentage--;
  }

  public void moveRight() {
    x++;
    batteryPercentage--;
  }

  public void moveLeft() {
    x--;
    batteryPercentage--;
  }

  public void moveForward() {
    z++;
    batteryPercentage--;
  }

  public void moveBackward() {
    z--;
    batteryPercentage--;
  }

  public String returnToBase() {
    StringBuilder movement = new StringBuilder();
    int leftRightMovement = x - 0;
    int upDownMovement = y - 0;
    int frontBackMovement = z - 0;

    if (leftRightMovement != 0) {
      String direction = leftRightMovement > 0 ? "L" : "R";
      while (leftRightMovement != 0) {
        movement.append(direction);
        leftRightMovement = leftRightMovement > 0 ? leftRightMovement - 1 : leftRightMovement + 1;
      }
    }
    if (upDownMovement != 0) {
      String direction = upDownMovement > 0 ? "D" : "U";
      while (upDownMovement != 0) {
        movement.append(direction);
        upDownMovement = upDownMovement > 0 ? upDownMovement - 1 : upDownMovement + 1;
      }
    }
    if (frontBackMovement != 0) {
      String direction = frontBackMovement > 0 ? "B" : "F";
      while (frontBackMovement != 0) {
        movement.append(direction);
        frontBackMovement = frontBackMovement > 0 ? frontBackMovement - 1 : frontBackMovement + 1;
      }
    }
    return movement.toString();
  }

  public int getBatteryPercentage() {
    return batteryPercentage;
  }

  public String displayCoordinatesAndBatteryPercentage() {
    return String.format("output: %d, %d, %d Battery Percentage: %d", x, y, z, batteryPercentage);
  }
}
