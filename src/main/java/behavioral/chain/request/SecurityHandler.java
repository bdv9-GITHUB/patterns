package behavioral.chain.request;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class SecurityHandler implements Handler {

  private Handler next;

  public SecurityHandler() {}

  public SecurityHandler(Handler next) {
    this.next = next;
  }

  @Override
  public Response handle() {
    System.out.println("Authorization...");
    return next != null ? next.handle() : null;
  }
}
