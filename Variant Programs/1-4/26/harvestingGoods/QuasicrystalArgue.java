package harvestingGoods;

public class QuasicrystalArgue {
  private static int designedNumbers;

  public static synchronized int presentlyTell() {
    return designedNumbers;
  }

  private int picture;

  public QuasicrystalArgue() {
    this.picture = designedNumbers++;
  }

  public synchronized String toString() {
    return "ProducibleObject:" + this.picture;
  }
}
