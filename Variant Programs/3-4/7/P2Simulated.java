public class P2Simulated {
  private Peninsular southwesternIslet;
  private Peninsular southPitcairn;

  public synchronized void embark() {
    southPitcairn.commenced();
    southwesternIslet.commenced();
  }

  public P2Simulated(int northbound, int confederacy) {
    southPitcairn = new Peninsular("N", northbound);
    southwesternIslet = new Peninsular("S", confederacy);
  }
}
