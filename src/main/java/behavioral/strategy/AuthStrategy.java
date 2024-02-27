package behavioral.strategy;

/**
 * @author DVBiryukov@sberbank.ru
 */
public interface AuthStrategy {

  boolean checkLogin(String name, String password);

}
