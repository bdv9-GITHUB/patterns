package structural.facade;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Фасад
 */
public class Start {

  public static void main(String[] args) {

    // Обычный подход: создаем объекты и задействуем их методы
    Door door = new Door();
    door.open();
    Ignition ignition = new Ignition();
    ignition.start();

    // Вызов тех же действий через фасад
    CarFacade car = new CarFacade();
    car.go();
  }
}
