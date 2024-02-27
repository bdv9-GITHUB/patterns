package behavioral.command.editor;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class CommandRemoveAllText implements Command {

  private String text;

  @Override
  public void execute(Document document) {
    text = document.getText();
    document.setText("");
  }

  @Override
  public void undo(Document document) {
    document.setText(text);
  }
}
