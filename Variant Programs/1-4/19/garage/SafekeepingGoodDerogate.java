package garage;

public class SafekeepingGoodDerogate extends Exception {

  public SafekeepingGoodDerogate() {
    super();
  }

  public SafekeepingGoodDerogate(String thing) {
    super(thing);
  }
}
