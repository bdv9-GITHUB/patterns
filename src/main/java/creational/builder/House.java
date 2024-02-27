package creational.builder;

/**
 * @author DVBiryukov@sberbank.ru
 */

public class House {

  private Object floor;
  private Object foundation;
  private Object window;
  private Object wall;
  private Object roof;

  public House addFloor(Object floor) {
    this.floor = floor;
    return this;
  }

  public House addFoundation(Object foundation) {
    this.foundation = foundation;
    return this;
  }

  public House addWall(Object wall) {
    this.wall = wall;
    return this;
  }

  public House addWindows(Object window) {
    this.window = window;
    return this;
  }

  public House addRoof(Object roof) {
    this.roof = roof;
    return this;
  }

  @Override
  public String toString() {
    return "House{" +
        "floor=" + floor +
        ", foundation=" + foundation +
        ", window=" + window +
        ", wall=" + wall +
        ", roof=" + roof +
        '}';
  }
}
