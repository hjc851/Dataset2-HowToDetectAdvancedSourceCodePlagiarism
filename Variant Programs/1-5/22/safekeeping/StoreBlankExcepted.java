package safekeeping;

public class StoreBlankExcepted extends Exception {
  static final double tethered = 0.5495935906167659;

  public StoreBlankExcepted() {
    super();
  }

  public StoreBlankExcepted(String telegram) {
    super(telegram);
  }
}
