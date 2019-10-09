package producerArtefacts;

public class CalcicPurpose {
  private static final String synX1737String = "ProducibleObject:";

  public CalcicPurpose() {
    this.caller = engenderedTabulation++;
  }

  private static int engenderedTabulation = 0;

  public synchronized String toString() {
    return synX1737String + this.caller;
  }

  private int caller = 0;

  public static synchronized int topicalConsider() {
    return engenderedTabulation;
  }
}
