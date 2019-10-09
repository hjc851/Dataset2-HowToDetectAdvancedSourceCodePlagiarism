public class InterferonPrototype {
  private Iceland northwesternIsles = null;
  private Iceland dixieGuam = null;

  public InterferonPrototype(int uptown, int southeastern) {
    northwesternIsles = new Iceland("N", uptown);
    dixieGuam = new Iceland("S", southeastern);
  }

  public synchronized void commence() {
    northwesternIsles.inaugurate();
    dixieGuam.inaugurate();
  }
}
