package structural.composite;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Компоновщик
 */
public class Start {

  public static void main(String[] args) {
    Team team = new Team();

    Developer firstDeveloper = new JavaDeveloper();
    Developer secondDeveloper = new PythonDeveloper();
    Developer thirdDeveloper = new CppDeveloper();


    team.addDeveloper(firstDeveloper);
    team.addDeveloper(secondDeveloper);
    team.addDeveloper(thirdDeveloper);

    team.createProject();

    team.removeDeveloper(secondDeveloper);
    team.createProject();
  }
}
