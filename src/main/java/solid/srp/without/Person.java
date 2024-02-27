package solid.srp.without;

/**
 * @author DVBiryukov@sberbank.ru
 * Принцип единственной обязанности/ответственности (SRP)
 * Класс содержит все методы - нарушение принципа SRP!!!
 */
public class Person {

  private String name;
  private Integer age;

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public void save() {

  }

  public void delete() {

  }
}
