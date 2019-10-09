package deliveryThings;

public class RecoverableTarget {
  private static int producedNumeration;

  public static synchronized int liveMatter() {
    return producedNumeration;
  }

  private int ownership;

  public RecoverableTarget() {
    this.ownership = producedNumeration++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.ownership;
  }
}
