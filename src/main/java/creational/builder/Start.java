package creational.builder;

/**
 * @author DVBiryukov@sberbank.ru
 * Шаблон Строитель
 * Основан на возврате в строящем методе самого объекта, таким образом мы можем вызывать "метеод/на метод"
 * ОГРОМНЫЙ ПЛЮС - возможность четко контролировать какое поле объекта модернизируется (если конечно методы названы корректно)
 */
public class Start {

  public static void main(String[] args) {
    House house = new House();

    System.out.println(house);

    house
        .addFoundation("foundation")
        .addFloor("floor");

    System.out.println(house);

    house
        .addWall("walls")
        .addWindows("windows")
        .addRoof("roof");

    System.out.println(house);
  }
}
