package creational.abstractfactory.car;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Ford implements Car {

  @Override
  public void drive() {
    System.out.println("Ford drive");
  }
}
