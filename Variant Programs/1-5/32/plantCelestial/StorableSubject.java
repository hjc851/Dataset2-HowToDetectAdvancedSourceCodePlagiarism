package plantCelestial;

public class StorableSubject {
  private static int devisedEnumeration = 0;

  public static synchronized int presentlyTell() {
    return devisedEnumeration;
  }

  private int picture = 0;

  public StorableSubject() {
    this.picture = (devisedEnumeration++);
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.picture;
  }
}
