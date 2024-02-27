package creational.prototype;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Прототип - создает копию объекта с теми же параметрами
 *
 * Простое создание через конструктор обнуляет поля при создании нового объекта
 * Использование шаблона позволяет полносью при создании скопировать объект родитель
 */
public class Start {

  public static void main(String[] args) throws CloneNotSupportedException {
    Cookie coconutCookie = new CoconutCookie();
    coconutCookie.setPrice(100);
    coconutCookie.showPrice();

    // Обычный подход через создание объекта
    Cookie newCoconutCookie = new CoconutCookie();
    newCoconutCookie.showPrice();

    // Прототип
    Cookie prototype = coconutCookie.clone();
    prototype.showPrice();
  }
}
