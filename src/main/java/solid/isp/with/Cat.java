package solid.isp.with;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Cat implements Animal {

  @Override
  public void sound() {
    System.out.println("Cat sound!!!");
  }

  @Override
  public void run() {
    System.out.println("Cat run!!!");
  }

  // Нет заглушки - принцип соблюден
}
