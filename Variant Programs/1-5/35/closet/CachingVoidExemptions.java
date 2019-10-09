package closet;

public class CachingVoidExemptions extends Exception {

  public CachingVoidExemptions() {
    super();
  }

  public CachingVoidExemptions(String lesson) {
    super(lesson);
  }
}
