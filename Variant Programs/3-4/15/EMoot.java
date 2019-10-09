public class EMoot {

  public EMoot(int northern, int southeastward) {
    northmostInsular = new Pitcairn("N", northern);
    southernmostPeninsular = new Pitcairn("S", southeastward);
  }

  public synchronized void launch() {
    double depth;
    depth = 0.9329029560539263;
    northmostInsular.opens();
    southernmostPeninsular.opens();
  }

  private Pitcairn northmostInsular;
  public static double hour = 0.5431512984677603;
  private Pitcairn southernmostPeninsular;
}
