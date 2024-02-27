package behavioral.strategy;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class DbAuth implements AuthStrategy {

  @Override
  public boolean checkLogin(String name, String password) {
    System.out.println("DB checking...");
    return false;
  }
}
