package behavioral.command.developer;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class DeleteCommand implements Command {
  Database database;

  public DeleteCommand(Database database) {
    this.database = database;
  }

  @Override
  public void execute() {
    database.delete();
  }
}
