package solid.dip.without;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Order {

  private int total = 0;

  public void add(Car car) {
    total += car.getPrice();
  }

  public int getTotal() {
    return total;
  }
}
