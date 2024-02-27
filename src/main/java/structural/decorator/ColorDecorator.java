package structural.decorator;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class ColorDecorator extends Decorator {

  public ColorDecorator(Component component) {
    super(component);
  }

  @Override
  public void afterDraw() {
    System.out.println("... added color");
  }
}
