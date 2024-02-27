package creational.factory;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Фабрика - создание ОДНОГО объекта
 *
 * 1. Создаем интерфейс Car
 * 2. Создаем реализации интерфейса Car: Jeep, Porshe
 * CarFactory это и есть фабрика
 * Основной принцип - в случае исправления объекта, правки производим не во всем коде, где был создан объект, а только в фабричном методе создания
 */
public class Start {

  public static void main(String[] args) {
    // "Обычный" подход - создание каждого объекта
    Car simpleJeep = new Jeep();
    simpleJeep.drive();
    Car simplePorsche = new Porsche();
    simplePorsche.drive();

    // "Фабричный" подход
    CarFactory carFactory = new CarFactory();
    Car factoryJeep = carFactory.getCar(RoadType.OFF_ROAD);
    factoryJeep.drive();
    Car factoryPorsche = carFactory.getCar(RoadType.CITY);
    factoryPorsche.drive();
  }
}
