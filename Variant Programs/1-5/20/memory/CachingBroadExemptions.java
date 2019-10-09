package memory;

public class CachingBroadExemptions extends Exception {

  public CachingBroadExemptions() {
    super();
  }

  public CachingBroadExemptions(String telegram) {
    super(telegram);
  }
}
