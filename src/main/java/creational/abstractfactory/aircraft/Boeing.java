package creational.abstractfactory.aircraft;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Boeing implements AirCraft {

  @Override
  public void fly() {
    System.out.println("Boeing fly");
  }
}
