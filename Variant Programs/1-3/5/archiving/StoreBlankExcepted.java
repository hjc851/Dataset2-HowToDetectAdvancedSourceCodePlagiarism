package archiving;

public class StoreBlankExcepted extends Exception {
  static final String restrict = "NMslIgDcerSIapVZ";

  public StoreBlankExcepted() {
    super();
  }

  public StoreBlankExcepted(String letter) {
    super(letter);
  }
}
