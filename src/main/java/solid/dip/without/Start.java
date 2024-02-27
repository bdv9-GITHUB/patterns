package solid.dip.without;

/**
 * @author DVBiryukov@sberbank.ru
 * Принцип инверсии зависимостей (DIP или DI)
 *
 * 1. Создаем класс Car
 * 2. Создаем класс Bus
 * 3. Создаем класс Order, в котором метод add реализован только для класса Car
 *
 * Не можем просто так добавить в заказ автобус - нарушение принципа DIP!!!
 */
public class Start {

  public static void main(String[] args) {
    Order order = new Order();
    Car car = new Car();
    Bus bus = new Bus();

    order.add(car);

    // Ошибка - нарушение принципа
//    order.add(bus);
  }

}
