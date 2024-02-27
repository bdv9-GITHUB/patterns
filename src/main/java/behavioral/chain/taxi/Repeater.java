package behavioral.chain.taxi;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Repeater extends Handler {

  private Order order;

  @Override
  public void handle(Order order) {
    if (order.equals(this.order)) {
      System.out.println("Continue search for order " + order + "...");
    } else {
      this.order = order;
    }
    super.handle(order);
  }
}
