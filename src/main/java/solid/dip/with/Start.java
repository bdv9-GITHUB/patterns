package solid.dip.with;

/**
 * @author DVBiryukov@sberbank.ru
 * Принцип инверсии зависимостей (DIP или DI)
 *
 * 1. Создаем интерфейс Product
 * 2. Создаем класс Car
 * 3. Создаем класс Bus
 * 4. Создаем класс Order, в котором метод add реализован для интерфейса Product
 *
 * Можем просто добавить в заказ автобус через метод add - следование принципу DIP!!!
 */
public class Start {

  public static void main(String[] args) {
    Order order = new Order();
    Car car = new Car();
    Bus bus = new Bus();

    order.add(car);

    // Ошибки нет - следование принципу
    order.add(bus);
  }

}
