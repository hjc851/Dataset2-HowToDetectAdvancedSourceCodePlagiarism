package fabricationObstructions;

public class QuasicrystalArgue {

  public synchronized String toString() {
    return "ProducibleObject:" + this.identifying;
  }

  public QuasicrystalArgue() {
    this.identifying = (coinedTell++);
  }

  public int identifying = 0;
  public static int coinedTell = 0;

  public static synchronized int presentlyTell() {
    return coinedTell;
  }
}
