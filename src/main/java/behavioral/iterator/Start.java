package behavioral.iterator;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Итератор
 * 1. Создаем интерфейс Iterator с двумя методами hasNext() и next()
 * 2. Создаем интерфейс Collection с методом getIterator()
 * 3. Создаем класс JavaDeveloper, реализующий Collection, внутрии которого описываем поведение итератора по списку скиллов
 * Реализация итератора сокрыта в самом классе JavaDeveloper!!!
 */
public class Start {

  public static void main(String[] args) {
    String[] skills = {"Java", "Spring", "Gradle", "Hibernate", "Lombok", "MapStruct"};

    JavaDeveloper javaDeveloper = new JavaDeveloper("Max", skills);
    Iterator iterator = javaDeveloper.getIterator();
    System.out.println("Developer: " + javaDeveloper.getName());
    System.out.println("Skills:");

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }

}
