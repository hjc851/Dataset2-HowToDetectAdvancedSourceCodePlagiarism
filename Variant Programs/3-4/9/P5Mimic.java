public class P5Mimic {
  private Cypriot southwestwardIslander;
  private Cypriot northwesternIsles;

  public P5Mimic(int northern, int southbound) {
    northwesternIsles = new Cypriot("N", northern);
    southwestwardIslander = new Cypriot("S", southbound);
  }

  public synchronized void initiate() {
    northwesternIsles.opens();
    southwestwardIslander.opens();
  }
}
