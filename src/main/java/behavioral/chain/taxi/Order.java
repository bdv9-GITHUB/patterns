package behavioral.chain.taxi;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Order {

  private final String id;

  public Order(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
}
