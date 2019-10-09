package supplyArtefact;

public class PerformableObjection {
  private int security = 0;
  private static int coinedTell = 0;

  public static synchronized int theFigure() {
    return coinedTell;
  }

  public PerformableObjection() {
    this.security = coinedTell++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.security;
  }
}
