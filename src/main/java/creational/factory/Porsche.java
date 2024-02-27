package creational.factory;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Porsche implements Car {

  @Override
  public void drive() {
    System.out.println("Porsche drive");
  }

  @Override
  public void stop() {
    System.out.println("Porsche stop");
  }
}
