package structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Адаптер
 * Адаптер используется когда надо перенести логику в одно место из нескольких, чтобы не повторяться
 * 1. Есть класс Printer, который может печатать по одному листу
 * 2. Нам надо распечатать несколько листов
 * Можно пройти по списку и распечатать (обычный подход)
 * А можно сделать адаптер, который, в принципе, сделает то же самое но логика вызова в главном методе не поменяется
 */
public class Start {

  public static void main(String[] args) {
    List<String> list = new ArrayList();
    list.add("Text1");
    list.add("Text2");
    list.add("Text3");

    // Обычный подход
    Printer printer = new Printer();
    for (String text : list) {
      printer.print(text);
    }

    // Использование адаптера
    PrinterAdapter adapter = new PrinterAdapter();
    adapter.print(list);
  }

}
