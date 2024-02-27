package creational.factory;

/**
 * Собственно это и есть фабрика - создание ОДНОГО объекта
 * Основной принцип - в случае исправления объекта, правки производим не во всем коде, где был создан объект, а только в фабричном методе создания
 */

public class CarFactory {

  public Car getCar(RoadType roadType) {
    Car car = null;

    switch (roadType) {
      case CITY:
        car = new Porsche();
        break;
      case OFF_ROAD:
        car = new Jeep();
        break;
    }

    return car;
  }
}
