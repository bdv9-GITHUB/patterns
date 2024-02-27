package behavioral.observer;

/**
 * @author DVBiryukov@sberbank.ru
 */
public interface Sensor {

  void registerObserver(Observer o);
  void removeObserver(Observer o);
  void notifyObservers();
}
