package behavioral.chain.request;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class LogHandler implements Handler {

  private Handler next;

  public LogHandler() {}

  public LogHandler(Handler next) {
    this.next = next;
  }

  @Override
  public Response handle() {
    System.out.println("Logging...");
    return next != null ? next.handle() : null;
  }
}
