package org.example;

public class Running extends Training{

  private final int distance;

  public Running(int averagePulse, int time, int weight, int distance) {
    super(averagePulse, time, weight, TypeTraining.RUNNING);
    this.distance = distance;
  }

  @Override
  public String toString() {
    StringBuffer buffer = new StringBuffer(super.toString());
    buffer.insert(buffer.indexOf(".")+1, String.format(" Дистанция: %d км. ",this.distance));
    return buffer.toString();
  }
}
