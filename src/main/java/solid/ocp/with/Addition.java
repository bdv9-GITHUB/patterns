package solid.ocp.with;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Addition implements Operation {

  private double a;
  private double b;
  private double result = 0.0;

  public Addition(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public void setResult(double result) {
    this.result = result;
  }

  public double getResult() {
    return result;
  }

  @Override
  public void perform() {
    result = a + b;
    System.out.println(String.format("Summa %s and %s is: %s", a, b, result));
  }
}
