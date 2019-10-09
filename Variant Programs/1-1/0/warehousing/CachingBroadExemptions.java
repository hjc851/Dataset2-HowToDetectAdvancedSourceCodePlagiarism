package warehousing;

public class CachingBroadExemptions extends Exception {

  public CachingBroadExemptions() {
    super();
  }

  public CachingBroadExemptions(String email) {
    super(email);
  }
}
