public class FlSimulations {
  public Province northboundTerritory = null;
  public Province southeasterlyCay = null;

  public synchronized void take() {
    northboundTerritory.opens();
    southeasterlyCay.opens();
  }

  public FlSimulations(int northern, int southeasterly) {
    northboundTerritory = new Province("N", northern);
    southeasterlyCay = new Province("S", southeasterly);
  }
}
