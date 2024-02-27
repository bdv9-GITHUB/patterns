package solid.isp.with;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Duck implements Animal, Flyable {

  @Override
  public void sound() {
    System.out.println("Duck sound!!!");
  }

  @Override
  public void run() {
    System.out.println("Duck run!!!");
  }

  @Override
  public void fly() {
    System.out.println("Duck fly!!!");
  }
}
