package caching;

public class CachingVoidExemptions extends Exception {

  public CachingVoidExemptions() {
    super();
  }

  public CachingVoidExemptions(String text) {
    super(text);
  }
}
