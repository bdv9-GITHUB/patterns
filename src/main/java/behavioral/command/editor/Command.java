package behavioral.command.editor;

/**
 * @author DVBiryukov@sberbank.ru
 */
public interface Command {

  void execute(Document document);
  void undo(Document document);
}
