package behavioral.state;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class StopState implements State {

  @Override
  public void action() {
    System.out.println("Stop!");
  }
}
