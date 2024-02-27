package solid.lsp.with;

/**
 * @author DVBiryukov@sberbank.ru
 * Принцип подстановки Барбары Лисков (LSP)
 *
 * 1. Создаем класс Rectangle
 * 2. Создаем класс Square наследуемый от Rectangle, только теперь задействуем конструктор с вызовом метода в базовом классе
 * Задаем стороны, в результате при расчете площади получаем корректный результат - следование принципу LSP!!!
 */
public class Start {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(4, 5);
    System.out.println(rectangle.getArea());

    Rectangle square = new Square(4);
    System.out.println(square.getArea());
  }
}
