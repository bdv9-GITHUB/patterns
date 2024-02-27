package behavioral.chain.taxi;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Taxi extends Handler {

  private final String number;

  public Taxi(String number) {
    this.number = number;
  }

  @Override
  public void handle(Order order) {
    if (checkIsBusy()) {
      System.out.println("Taxi number " + number + " is not free");
      super.handle(order);
    } else {
      System.out.println("Taxi number " + number + " drive to order");
    }
  }

  /**
   * Рандомная проверка занятости (для примера)
   */
  private Boolean checkIsBusy() {
    return Math.random() < 0.8;
  }
}
