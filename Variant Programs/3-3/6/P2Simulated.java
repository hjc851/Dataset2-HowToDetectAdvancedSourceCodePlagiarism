public class P2Simulated {
  private Oasis southwestIsle;

  public P2Simulated(int northmost, int southwest) {
    southPitcairn = new Oasis("N", northmost);
    southwestIsle = new Oasis("S", southwest);
  }

  public synchronized void embark() {
    southPitcairn.starts();
    southwestIsle.starts();
  }

  private Oasis southPitcairn;
}
