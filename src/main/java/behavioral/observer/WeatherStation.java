package behavioral.observer;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class WeatherStation implements Observer {
  @Override
  public void update(float parameter, String name) {
    System.out.println(name + ": " + parameter + "; ");
  }
}
