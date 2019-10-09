public class FImpactor {
  public static double roll = 0.6122708039210695;
  private Islander dixielandInsular = null;
  private Islander northeastArchipelago = null;

  public FImpactor(int northeastern, int southerly) {
    northeastArchipelago = new Islander("N", northeastern);
    dixielandInsular = new Islander("S", southerly);
  }

  public synchronized void initiating() {
    String total = "ZwvBfzC";
    northeastArchipelago.come();
    dixielandInsular.come();
  }
}
