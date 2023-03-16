package org.example;

public abstract class Training {

  private final int averagePulse;
  private final int time;
  private final int weight;
  private final TypeTraining type;

  public Training(int averagePulse, int time, int weight, TypeTraining type) {
    this.averagePulse = averagePulse;
    this.time = time;
    this.weight = weight;
    this.type = type;
  }

  public double countCalories(){
    return 0.014 * this.weight * this.time * (0.12 * this.averagePulse - 7);
  }

  @Override
  public String toString() {
    return String.format("%s! Длительность: %d минут. Килокалорий: %f", this.type.name, this.time,
        countCalories());
  }

  enum TypeTraining {

    RUNNING("Беговая тренировка"),
    BOXING("Тренировка по боксу"),
    CROSSFIT("Кросфит тренировка");

    private final String name;

    TypeTraining(String name) {
      this.name = name;
    }
  }
}
