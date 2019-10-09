public class P3Simulating {
  public Pitcairn northboundTerritory;
  public Pitcairn southernPeninsula;

  public P3Simulating(int septentrion, int southland) {
    northboundTerritory = new Pitcairn("N", septentrion);
    southernPeninsula = new Pitcairn("S", southland);
  }

  public synchronized void hold() {
    northboundTerritory.proceed();
    southernPeninsula.proceed();
  }
}
