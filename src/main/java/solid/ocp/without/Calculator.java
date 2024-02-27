package solid.ocp.without;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Calculator {

  public void calculate(Operation operation) {
    if (operation instanceof Addition) {
      Addition addition = (Addition) operation;
      addition.setResult(addition.getA() + addition.getB());
      System.out.println("Result: " + addition.getResult());
    } else if (operation instanceof Substraction) {
      Substraction substraction = (Substraction) operation;
      substraction.setResult(substraction.getA() - substraction.getB());
      System.out.println("Result: " + substraction.getResult());
    }
  }
}
