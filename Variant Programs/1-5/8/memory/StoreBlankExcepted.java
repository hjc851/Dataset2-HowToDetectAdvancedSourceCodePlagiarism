package memory;

public class StoreBlankExcepted extends Exception {
  static double positionFoods = 0.022551672833630576;

  public StoreBlankExcepted() {
    super();
  }

  public StoreBlankExcepted(String warning) {
    super(warning);
  }
}
