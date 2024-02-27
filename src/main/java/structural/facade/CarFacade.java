package structural.facade;

/**
 * @author DVBiryukov@sberbank.ru
 * Собственно это и есть фасад, за которым скрываем реализацию
 */
public class CarFacade {

  private Door door = new Door();
  private Ignition ignition = new Ignition();

  public void go() {
    door.open();
    ignition.start();
  }
}
