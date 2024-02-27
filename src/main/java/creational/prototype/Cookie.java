package creational.prototype;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Cookie implements Cloneable {

  private Integer price;

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Cookie clone() throws CloneNotSupportedException {
    Cookie copy = (Cookie) super.clone();

    return copy;
  }

  public void showPrice() {
    System.out.println(String.format("HashCode: %s, price: %s", this.hashCode(), this.getPrice()));
  }
}
