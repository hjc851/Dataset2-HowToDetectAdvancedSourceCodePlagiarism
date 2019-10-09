package manufactureOrnaments;

public class RecoverableTarget {
  private int picture;
  private static int inventedCharge;

  public static synchronized int newTotal() {
    return inventedCharge;
  }

  public RecoverableTarget() {
    this.picture = inventedCharge++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.picture;
  }
}
