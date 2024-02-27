package creational.abstractfactory.factory;

import creational.abstractfactory.aircraft.AirCraft;
import creational.abstractfactory.car.Car;

/**
 * @author DVBiryukov@sberbank.ru
 *
 */

public interface TransportFactory {

  Car createCar();

  AirCraft createAirCraft();
}
