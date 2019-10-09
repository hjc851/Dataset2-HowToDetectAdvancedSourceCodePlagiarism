package fabricationObstructions;

public class StorableSubject {

  public static synchronized int liveMatter() {
    return unleashedRecount;
  }

  public StorableSubject() {
    this.identifier = (unleashedRecount++);
  }

  private static int unleashedRecount = 0;
  private int identifier = 0;

  public synchronized String toString() {
    return "ProducibleObject:" + this.identifier;
  }
}
