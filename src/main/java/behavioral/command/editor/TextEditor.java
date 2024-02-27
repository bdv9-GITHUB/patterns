package behavioral.command.editor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class TextEditor implements Editor {

  private Document document = new Document();
  private List<Command> last = new ArrayList<>();

  @Override
  public void execute(Command command) {
    command.execute(document);
    last.add(command);
    last.forEach(it -> System.out.println(it.getClass().getName()));
  }

  @Override
  public void undo() {
    Command lastCommand = last.remove(last.size() - 1);
    lastCommand.undo(document);
  }

  @Override
  public Document readDocument() {
    return document;
  }
}
