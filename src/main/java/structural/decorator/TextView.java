package structural.decorator;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class TextView implements Component {

  @Override
  public void draw() {
    System.out.println("Draw Text");
  }
}
