package solid.dip.with;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Order {

  private int total = 0;

  public void add(Product product) {
    total += product.getPrice();
  }

  public int getTotal() {
    return total;
  }

}
