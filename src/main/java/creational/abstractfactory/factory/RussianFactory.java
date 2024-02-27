package creational.abstractfactory.factory;

import creational.abstractfactory.aircraft.AirCraft;
import creational.abstractfactory.aircraft.Tu;
import creational.abstractfactory.car.Car;
import creational.abstractfactory.car.Niva;

/**
 * @author DVBiryukov@sberbank.ru
 */

public class RussianFactory implements TransportFactory {

  @Override
  public Car createCar() {
    return new Niva();
  }

  @Override
  public AirCraft createAirCraft() {
    return new Tu();
  }
}
