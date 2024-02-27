package solid.ocp.with;

/**
 * @author DVBiryukov@sberbank.ru
 * Принцип открытости/закрытости (OCP)
 *
 * 1. Создаем интерфейс Operation
 * 2. Создаем классы Addition и Substraction, реализующие интерфейс Operation (РЕАЛИЗАЦИЯ ВНУТРИ ЭТИХ КЛАССОВ)
 * 3. Создаем класс Calculator, внутри которого в зависимости от входящего параметра Operation получаем результат
 *
 * Чтобы добавить в класс Calculator новый функционал, например умножение или деление, НЕ придется менять сам класс Calculator - следование принципу OCP!!!
 */
public class Start {

  public static void main(String[] args) {
    Addition addition = new Addition(1, 2);
    Substraction substraction = new Substraction(5, 3);
    Multiplication multiplication = new Multiplication(4, 6);

    Calculator calculator = new Calculator();
    calculator.calculate(addition);
    calculator.calculate(substraction);
    calculator.calculate(multiplication);
  }
}
