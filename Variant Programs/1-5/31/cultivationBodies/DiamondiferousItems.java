package cultivationBodies;

public class DiamondiferousItems {

  public DiamondiferousItems() {
    this.caller = (unleashedRecount++);
  }

  public static int unleashedRecount = 0;
  public int caller = 0;

  public static synchronized int streamCensus() {
    return unleashedRecount;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.caller;
  }
}
