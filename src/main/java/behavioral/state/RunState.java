package behavioral.state;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class RunState implements State {

  @Override
  public void action() {
    System.out.println("Run...");
  }
}
