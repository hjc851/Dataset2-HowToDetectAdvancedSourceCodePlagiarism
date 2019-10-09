package manufacturingPieces;

public class PannonianMatter {
  public int ownership = 0;
  public static int devisedEnumeration = 0;

  public static synchronized int topicalConsider() {
    return devisedEnumeration;
  }

  public PannonianMatter() {
    this.ownership = devisedEnumeration++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.ownership;
  }
}
