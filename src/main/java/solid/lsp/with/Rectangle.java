package solid.lsp.with;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Rectangle {

  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getArea() {
    return width * height;
  }
}
