package structural.decorator;

/**
 * @author DVBiryukov@sberbank.ru
 * Декоратор (обертка) - используется, если нельзя применить наследование и нужно дополнить поведение объекта
 * 1. Есть интерфейс Component с методом draw()
 * 2. Есть класс TextView, реализующий Component: метод draw() печатает текст
 * Задача - дополнить функционал класса TextView
 * 1. Создаем абстрактный класс Decorator, реализующий Component (его наследниками будем оборачивать класс TextView)
 *    1.1. Объявляем там Component и передаем его в конструктор
 *    1.2. Метод draw() - вызываем метод draw() переданного компонента и после выполняем собственный метод afterDraw()
 * 2. Создаем классы, наследуемые от Decorator: BorderDecorator, ColorDecorator
 *    2.1. В конструктор передаем Component и выполняем метод родительского класса через super()
 *    2.2. Внутри реализуем дополнительный функционал afterDraw()
 * 3. Применяем (см. код ниже), можем даже вкладывать декораторы друг в друга
 */
public class Start {

  public static void main(String[] args) {
    // Создаем текст
    Component textView = new TextView();

    // Пример декоратора "текст в границе"
    Component textWithBorder = new BorderDecorator(textView);
    textWithBorder.draw();
    // Пример декоратора "текст в цвете"
    Component textWithColor = new ColorDecorator(textView);
    textWithColor.draw();

    // Пример вложенного декторатора "текст в границе и цвете одновременно"
    Component textWithColorBorder = new ColorDecorator(new BorderDecorator(new TextView()));
    textWithColorBorder.draw();
  }
}
