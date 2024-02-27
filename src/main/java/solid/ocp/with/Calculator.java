package solid.ocp.with;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Calculator {

  public void calculate(Operation operation) {
    operation.perform();
  }
}
