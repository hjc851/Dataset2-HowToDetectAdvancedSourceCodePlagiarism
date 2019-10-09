public class ConfSimulation {
  private static final double synX379double = 0.2689229204020446;
  public Pitcairn southPitcairn = null;
  public Pitcairn southerlyArchipelagic = null;

  public synchronized void launch() {
    double charge;
    charge = synX379double;
    southPitcairn.enter();
    southerlyArchipelagic.enter();
  }

  public static double highDestined = 0.534856814615873;

  public ConfSimulation(int northwest, int southeastward) {
    southPitcairn = new Pitcairn("N", northwest);
    southerlyArchipelagic = new Pitcairn("S", southeastward);
  }
}
