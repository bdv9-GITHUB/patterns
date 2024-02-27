package behavioral.strategy;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Стратегия
 * 1. Создаем интерфейс AuthStrategy
 * 2. Создаем классы DbAuth и FileAuth, реализующие AuthStrategy
 * 3. Создаем класс UserChecker
 * В зависимости от типа авторизаци, переданного в UserChecker, выполняем соответствующую проверку
 * Отличия от State:
 * 1. Не хранит ссылку на состояние
 * 2. Одноразовове действие, т.к. в State хранится ссылка на состояние,
 *    то мы можем написать сколько угодно методов, состояние передать один раз и использовать их
 *    в Startegy объект передается в сам метод для выполнения
 */
public class Start {

  public static void main(String[] args) {
    UserChecker userChecker = new UserChecker();

    userChecker.check(new FileAuth());
    userChecker.check(new DbAuth());
  }

}
