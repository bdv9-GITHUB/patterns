package behavioral.strategy;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class FileAuth implements AuthStrategy {

  @Override
  public boolean checkLogin(String name, String password) {
    System.out.println("File checking...");
    return false;
  }
}
