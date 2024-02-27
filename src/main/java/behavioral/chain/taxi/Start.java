package behavioral.chain.taxi;

/**
 * @author DVBiryukov@sberbank.ru
 * Пример: подбор такси для заказа среди свободных машин
 * 1. Создаем абстрактный класс обработчика (Handler)
 * 2. Создаем класс Taxi, наследуемый от Handler, в методе handle задаем выполнение его же от наследуемого
 * 3. Создаем класс Repeater, наследуемый от Handler, им будем замыкать цепочку для повторного поиска - НЕОБЯЗАТЕЛЬНО
 */
public class Start {

  public static void main(String[] args) {
    // Создаем повторитель
    Handler handler = new Repeater();

    // Готовим цепочку с замыканием поиска в случае занятости всех машин
    handler
        .bind(new Taxi("111"))
        .bind(new Taxi("222"))
        .bind(new Taxi("333"))
        .bind(new Taxi("444"))
        .bind(new Taxi("555"))
        .bind(handler);

    // Запускаем цепочку
    Order order = new Order("1");
    handler.handle(order);
  }
}
