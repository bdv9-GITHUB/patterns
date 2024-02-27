package structural.proxy;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Заместитель
 */
public class Start {

  public static void main(String[] args) {
    final Image IMAGE1 = new ProxyImage("HiRes_10MB_Photo1");

    IMAGE1.display();
    IMAGE1.display();
  }
}
