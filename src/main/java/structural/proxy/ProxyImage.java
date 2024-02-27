package structural.proxy;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class ProxyImage implements Image {

  private final String filename;
  private RealImage image;

  public ProxyImage(final String filename) {
    this.filename = filename;
  }

  @Override
  public void display() {
    if (image == null) {
      image = new RealImage(filename);
      System.out.println("Create RealImage...");
    }

    image.display();
  }
}
