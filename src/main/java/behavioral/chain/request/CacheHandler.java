package behavioral.chain.request;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class CacheHandler implements Handler {

  private Handler next;

  public CacheHandler() {}

  public CacheHandler(Handler next) {
    this.next = next;
  }

  @Override
  public Response handle() {
    System.out.println("Caching...");
    return next != null ? next.handle() : null;
  }
}
