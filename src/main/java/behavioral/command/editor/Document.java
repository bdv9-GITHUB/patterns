package behavioral.command.editor;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Document {

  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void getDocument() {
    System.out.println("".equals(text) ? "empty" : text);
  }
}
