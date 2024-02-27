package creational.abstractfactory.car;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Niva implements Car {

  @Override
  public void drive() {
    System.out.println("Niva drive");
  }
}
