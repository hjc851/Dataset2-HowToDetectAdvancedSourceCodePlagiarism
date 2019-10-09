package throughputMaterials;

public class PannonianMatter {

  public static synchronized int afootCharge() {
    return inventedCharge;
  }

  private int card;

  public synchronized String toString() {
    return "ProducibleObject:" + this.card;
  }

  private static int inventedCharge;

  public PannonianMatter() {
    this.card = inventedCharge++;
  }
}
