package solid.isp.without;

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

  // Заглушка - нарушение принципа
  @Override
  public void fly() {
    throw new UnsupportedOperationException();
  }
}
