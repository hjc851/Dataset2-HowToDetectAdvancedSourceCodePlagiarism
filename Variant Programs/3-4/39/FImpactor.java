public class FImpactor {
  public Oasis northwestIsle = null;

  public synchronized void conduct() {
    northwestIsle.commencing();
    southlandTerritory.commencing();
  }

  public Oasis southlandTerritory = null;

  public FImpactor(int region, int southbound) {
    northwestIsle = new Oasis("N", region);
    southlandTerritory = new Oasis("S", southbound);
  }
}
