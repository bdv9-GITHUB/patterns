package structural.proxy;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class RealImage implements Image {

  private final String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;

  }

  private void loadImageFromDisk() {
    System.out.println("Loading " + fileName + " ...");
  }

  @Override
  public void display() {
    System.out.println("Display " + fileName);
  }
}
