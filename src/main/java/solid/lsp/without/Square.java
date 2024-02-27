package solid.lsp.without;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Square extends Rectangle {

  @Override
  public void setWidth(int width) {
    super.setWidth(width);
    super.setHeight(width);
  }

  @Override
  public void setHeight(int height) {
    super.setHeight(height);
    super.setWidth(height);
  }
}
