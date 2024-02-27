package creational.abstractfactory.factory;

import creational.abstractfactory.aircraft.AirCraft;
import creational.abstractfactory.aircraft.Boeing;
import creational.abstractfactory.car.Car;
import creational.abstractfactory.car.Ford;

/**
 * @author DVBiryukov@sberbank.ru
 * Конкретная реализация фабрики
 */

public class UsaFactory implements TransportFactory {

  @Override
  public Car createCar() {
    return new Ford();
  }

  @Override
  public AirCraft createAirCraft() {
    return new Boeing();
  }
}
