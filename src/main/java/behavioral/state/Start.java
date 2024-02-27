package behavioral.state;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Состояние
 * Понятие контекста и состояния
 * 1. Создаем интерфейс State
 * 2. Создаем реализации этого интерфейса в различных состояних (RunState, StopState)
 * 3. Обычная реализация через условие:
 *    3.1. Создаем контекст (ContextSimple), реализация интерфейса состояние, добавим в него само состояние (contextState)
 *    3.2. В методе action по условию (ИМЕННО В ЭТОМ ОТЛИЧИЕ) выполняем метод соответствующего класса
 * 4. Реализация через шаблон:
 *    4.1. Создаем контекст (ContextPattern), тоже реализация интерфейса состояние, добавим в него само состояние (contextState)
 *    4.2. В зависимости от типа состояния вызывается соответствующий метод action() класса, указанного в поле contextState (СУТЬ ШАБЛОНА)
 */
public class Start {

  public static void main(String[] args) {
    State runState = new RunState();
    State stopState = new StopState();
    State flyState = new FlyState();

    // Обычный подход (реализация условий в классе SimpleContext)
//    ContextSimple contextSimple = new ContextSimple();
//    contextSimple.setContextState(runState);
//    contextSimple.action();
//    contextSimple.setContextState(stopState);
//    contextSimple.action();
//    contextSimple.setContextState(flyState);
//    contextSimple.action();

    // Паттерн Состояние (реализация действия в отдельных экземплярах состояний)
    ContextPattern contextPattern = new ContextPattern();
    contextPattern.setContextState(runState);
    contextPattern.action();
    contextPattern.setContextState(stopState);
    contextPattern.action();
    contextPattern.action();
    contextPattern.action();
    contextPattern.setContextState(flyState);
    contextPattern.action();
  }
}
