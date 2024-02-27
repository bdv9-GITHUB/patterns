package behavioral.observer;

/**
 * @author DVBiryukov@sberbank.ru
 */
public class Start {

  public static void main(String[] args) {
    // 1. Создаем датчики (TemperatureSensor, PressureSensor) с реализацией интерфейса регистрации слушателя/наблюдателя (Sensor)
    // Внутри содержатся списки наблюдателей/слушателей (Observer)
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    PressureSensor pressureSensor = new PressureSensor();

    // 2. Создаем погодную станцию (WeatherStation) с реализацией интерфейса подписки (Observer), которая НИЧЕГО НЕ ЗНАЕТ о датчиках до момента подписки
    WeatherStation weatherStation = new WeatherStation();

    // 3. Подписываем станцию на датчики (фактически регистрируем станцию внутри датчика)
    temperatureSensor.registerObserver(weatherStation);
    pressureSensor.registerObserver(weatherStation);

    // 4. При обновлении данных отображатель покажет, что изменилось
    temperatureSensor.changeParameter(1.1f);
    pressureSensor.changeParameter(2.1f);

    // 5. Удалаяем подписку на один датчик и снова обновляем данные
    temperatureSensor.removeObserver(weatherStation);

    // 6. При обновлении данных отображатель покажет, что изменилось
    temperatureSensor.changeParameter(1.2f);
    // Не покажет, т.к. для этого датчика удален слушатель
    pressureSensor.changeParameter(2.2f);
  }
}
