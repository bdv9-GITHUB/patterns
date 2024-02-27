package creational.singleton;

/**
 * Шаблон Одиночка
 * Проблемы могут быть при многопоточном приложении
 */
public class Singleton {
  // 1. Закрываем конструктор от доступа извне
  private Singleton() {}

  // 2. Добавляем статичную переменную
  private static Singleton uniqueInstance;

  // 3. Добавляем метод для доступа к объекту и внутри контролируем создание
  public static Singleton getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new Singleton();

    return uniqueInstance;
  }
}
