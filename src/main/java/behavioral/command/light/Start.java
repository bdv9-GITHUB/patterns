package behavioral.command.light;

/**
 * @author DVBiryukov@sberbank.ru
 * Паттерн Команда
 * 1. Создаем Light - класс-приемник (receiver)
 * 2. Создаем интерфейс Command - команда (command)
 * 3. Необходимо инкапсулировать выполнение умений класса Light:
 *    3.1. Создаем класс TurnOnLightCommand, реализующий Command, в конструкторе передаем Light
 *    3.2. Создаем класс TurnOffLightCommand, реализующий Command, в конструкторе передаем Light
 *    3.3. Каждый будет выполнять одно действие объекта Light в методе execute()
 * 4. Создаем класс Switch - класс-вызов (invoker)
 */

public class Start {

  public static void main(String[] args) {
    // 1. Создаем объект, который будет использоваться
    Light light = new Light();

    // 2. Создаем объекты для всех действий объекта Light
    Command switchUp = new TurnOnLightCommand(light);
    Command switchDown = new TurnOffLightCommand(light);

    // 3. Создаем invoker, с которым будем непосредственно контактировать
    Switch switchWork = new Switch(switchUp, switchDown);

    // 4. Используем методы
    switchWork.flipUp();
    switchWork.flipDown();
  }
}
