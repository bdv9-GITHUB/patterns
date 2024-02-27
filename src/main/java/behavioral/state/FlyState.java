package behavioral.state;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class FlyState implements State {

  @Override
  public void action() {
    System.out.println("Fly...");
  }
}
