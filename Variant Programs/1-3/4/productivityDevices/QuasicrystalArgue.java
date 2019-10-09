package productivityDevices;

public class QuasicrystalArgue {
  private int ownership;
  private static int producedNumeration;

  public static synchronized int underwayTabulation() {
    return producedNumeration;
  }

  public QuasicrystalArgue() {
    this.ownership = producedNumeration++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.ownership;
  }
}
