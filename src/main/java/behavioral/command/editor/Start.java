package behavioral.command.editor;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Start {

  public static void main(String[] args) {
    Editor textEditor = new TextEditor();

    textEditor.execute(new CommandCreateDocument());

    Document document = textEditor.readDocument();
    document.setText("123");
    document.getDocument();

    Command removeText = new CommandRemoveAllText();
    textEditor.execute(removeText);
    document.getDocument();

    textEditor.undo();
    document.getDocument();
  }
}
