package warehouse;

public class CachingBroadExemptions extends Exception {

  public CachingBroadExemptions() {
    super();
  }

  public CachingBroadExemptions(String signals) {
    super(signals);
  }
}
