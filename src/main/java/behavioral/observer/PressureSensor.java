package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class PressureSensor implements Sensor {
  private final List<Observer> observers = new ArrayList<>();

  private final String name = "Pressure";
  private float pressure;

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers)
      observer.update(pressure, name);
  }

  public void changeParameter(float pressure) {
    this.pressure = pressure;
    notifyObservers();
  }
}
