package solid.isp.without;

/**
 * @author DVBiryukov@sberbank.ru
 * Принцип разделения интерфейса (ISP)
 *
 * 1. Создаем интерфейс Animal
 * 2. Создаем класс Cat, реализующий интерфейс Animal
 *
 * Класс содержит методы, которые не может реализовать, создаем "заглушку" - нарушение принципа ISP!!!
 */
public class Start {

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.sound();
    cat.run();

    // Ошибка
    cat.fly();
  }

}
