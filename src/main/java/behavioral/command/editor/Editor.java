package behavioral.command.editor;

/**
 * @author DVBiryukov@sberbank.ru
 */
public interface Editor {

  void execute(Command command);
  void undo();
  Document readDocument();
}
