package behavioral.command.developer;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Start {

  public static void main(String[] args) {
    Database database = new Database();
    Developer developer = new Developer(
        new InsertCommand(database),
        new DeleteCommand(database),
        new UpdateCommand(database),
        new SelectCommand(database)
    );

    developer.insertRecord();
    developer.updateRecord();
    developer.selectRecord();
    developer.deleteRecord();
  }

}
