package creational.abstractfactory;


import creational.abstractfactory.aircraft.AirCraft;
import creational.abstractfactory.car.Car;
import creational.abstractfactory.factory.RussianFactory;
import creational.abstractfactory.factory.TransportFactory;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Абстрактная фабрика - нужен для создения СЕМЕЙСТВА объектов
 *
 * 1. Создаем интерфейсы car/Car, aircraft/AirCraft
 * 2. Создаем их реализации для разных моделей (Niva-Ford, Tu-Boeing)
 * 3. Создаем интерфейс factory/TransportFactory (собственно это и есть абстрактная фабрика - нужна для создания СЕМЕЙСТВА объектов)
 * 4. Создаем конкретную реализацию фабрики factory/RussianFactory, factory/UsaFactory, в которой создаем нужные нам объекты
 *
 * На основе созданной реализации получаем конкретную фабрику
 */

public class Start {

  public static void main(String[] args) {

    TransportFactory russianFactory = new RussianFactory();

    Car russianCar = russianFactory.createCar();
    russianCar.drive();

    AirCraft russianAirCraft = russianFactory.createAirCraft();
    russianAirCraft.fly();
  }
}
