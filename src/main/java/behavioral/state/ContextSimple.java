package behavioral.state;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class ContextSimple implements State {

  private State contextState;

  public State getContextState() {
    return contextState;
  }

  public void setContextState(State contextState) {
    this.contextState = contextState;
  }

  @Override
  public void action() {
    // Обычный подход через условие
    if (this.getContextState() instanceof RunState) {
      System.out.println("Simple run...");
    } else if (this.getContextState() instanceof StopState) {
      System.out.println("Simple stop!");
    } else if (this.getContextState() instanceof FlyState) {
      System.out.println("Simple fly!");
    }
  }
}
