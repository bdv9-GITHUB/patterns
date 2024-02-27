package solid.ocp.without;

/**
 * @author DVBiryukov@sberbank.ru
 * Принцип открытости/закрытости (OCP)
 *
 * 1. Создаем интерфейс Operation
 * 2. Создаем классы Addition и Substraction, реализующие интерфейс Operation
 * 3. Создаем класс Calculator, внутри которого в зависимости от входящего параметра Operation получаем результат (РЕАЛИЗАЦИЯ ВНУТРИ ЭТОГО КЛАССА)
 *
 * Чтобы добавить в класс Calculator новый функционал, например умножение или деление, придется менять сам класс Calculator - нарушение принципа OCP!!!
 */
public class Start {

  public static void main(String[] args) {
    Addition addition = new Addition(1, 2);
    Substraction substraction = new Substraction(5, 3);

    Calculator calculator = new Calculator();
    calculator.calculate(addition);
    calculator.calculate(substraction);
  }

}
