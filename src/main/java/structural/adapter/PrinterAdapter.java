package structural.adapter;

import java.util.List;

/**
 * @author DVBiryukov@sberbank.ru
 * Собственно это и есть адаптер
 */
public class PrinterAdapter implements PageListPrinter {

  private Printer printer = new Printer();

  @Override
  public void print(List<String> list) {
    for (String text : list) {
      printer.print(text);
    }
  }
}
