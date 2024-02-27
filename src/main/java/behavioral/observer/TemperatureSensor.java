package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class TemperatureSensor implements Sensor {
  // Список слушателей датчика
  private final List<Observer> observers = new ArrayList<>();

  private final String name = "Temperature";
  private float temperature;

  // Регистрация слушателя
  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  // Удаление слушателя
  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  // Уведомление слушателя
  @Override
  public void notifyObservers() {
    for (Observer observer : observers)
      observer.update(temperature, name);
  }

  // Изменение параметра
  public void changeParameter(float temperature) {
    this.temperature = temperature;
    notifyObservers();
  }
}
