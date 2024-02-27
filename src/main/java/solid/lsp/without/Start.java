package solid.lsp.without;

/**
 * @author DVBiryukov@sberbank.ru
 * Принцип подстановки Барбары Лисков (LSP)
 *
 * 1. Создаем класс Rectangle
 * 2. Создаем класс Square наследуемый от Rectangle
 * Задаем стороны, в результате при расчете площади разный результат - нарушение принципа LSP!!!
 */
public class Start {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setWidth(4);
    rectangle.setHeight(5);
    System.out.println(rectangle.getArea());

    Rectangle square = new Square();
    square.setWidth(4);
    square.setHeight(5);
    System.out.println(square.getArea());

    // В итоге разный результат
  }
}
