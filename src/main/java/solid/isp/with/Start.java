package solid.isp.with;

/**
 * @author DVBiryukov@sberbank.ru
 * Принцип разделения интерфейса (ISP)
 *
 * 1. Создаем интерфейс Animal
 * 2. Создаем интерфейс Flyable, который содержит метод не для всех животных
 * 3. Создаем класс Cat, реализующий интерфейс Animal
 * 4. Создаем класс Duck, реализующий интерфейсы Animal и Flyable
 *
 * Класс Cat НЕ содержит методы, которые не может реализовать (не можем их даже вызвать) - следование принципу ISP!!!
 * Класс Duck содержит методы, все из которых может реализовать - следование принципу ISP!!!
 */
public class Start {

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.sound();
    cat.run();

    Duck duck = new Duck();
    duck.sound();
    duck.run();
    duck.fly();
  }

}
