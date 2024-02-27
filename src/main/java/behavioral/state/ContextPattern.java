package behavioral.state;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class ContextPattern implements State {

  private State contextState;

  public State getContextState() {
    return contextState;
  }

  public void setContextState(State contextState) {
    this.contextState = contextState;
  }

  @Override
  public void action() {
    // Это и есть СУТЬ ШАБЛОНА - выполнение метода из соответствующего состояния
    this.contextState.action();
  }
}
