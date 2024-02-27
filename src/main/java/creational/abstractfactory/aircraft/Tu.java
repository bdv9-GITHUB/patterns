package creational.abstractfactory.aircraft;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Tu implements AirCraft {

  @Override
  public void fly() {
    System.out.println("Tu fly");
  }
}
