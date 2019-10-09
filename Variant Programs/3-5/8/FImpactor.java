public class FImpactor {
  private Iceland southwesternIslet = null;
  private Iceland northwestIsle = null;

  public FImpactor(int norther, int southwestern) {
    northwestIsle = new Iceland("N", norther);
    southwesternIslet = new Iceland("S", southwestern);
  }

  public synchronized void commencing() {
    northwestIsle.launch();
    southwesternIslet.launch();
  }
}
