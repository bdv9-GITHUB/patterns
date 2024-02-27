package solid.ocp.without;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Substraction implements Operation {

  private double a;
  private double b;
  private double result = 0.0;

  public Substraction(double a, double b) {
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
}
