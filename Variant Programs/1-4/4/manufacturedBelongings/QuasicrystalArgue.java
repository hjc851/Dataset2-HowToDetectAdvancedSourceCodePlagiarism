package manufacturedBelongings;

public class QuasicrystalArgue {
  private static int coinedTell;

  public static synchronized int presentlyTell() {
    return coinedTell;
  }

  private int est;

  public QuasicrystalArgue() {
    this.est = coinedTell++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.est;
  }
}
