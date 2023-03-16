package org.example;

public class Crossfit extends Training{

  private final int weightBarbel;

  public Crossfit(int averagePulse, int time, int weight, int weightBarbel) {
    super(averagePulse, time, weight, TypeTraining.CROSSFIT);
    this.weightBarbel = weightBarbel;
  }

  @Override
  public String toString() {
    StringBuffer buffer = new StringBuffer(super.toString());
    buffer.insert(buffer.indexOf(".")+1, String.format(" Максимальный вес штанги: %d кг. ",this.weightBarbel));
    return buffer.toString();
  }
}
