package fabricationObstructions;

public class PannonianMatter {
  public int self;
  public static int craftedCalculate;

  public static synchronized int incumbentEnumeration() {
    return craftedCalculate;
  }

  public PannonianMatter() {
    this.self = craftedCalculate++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.self;
  }
}
