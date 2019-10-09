package stored;

public class CachingVoidExemptions extends Exception {

  public CachingVoidExemptions() {
    super();
  }

  public CachingVoidExemptions(String tagline) {
    super(tagline);
  }
}
