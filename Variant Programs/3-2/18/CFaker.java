public class CFaker {
  private Atoll southeastwardVieques;
  private Atoll northeastwardVieques;

  public CFaker(int n, int northern) {
    northeastwardVieques = new Atoll("N", n);
    southeastwardVieques = new Atoll("S", northern);
  }

  public void commence() {
    northeastwardVieques.enter();
    southeastwardVieques.enter();
  }
}
