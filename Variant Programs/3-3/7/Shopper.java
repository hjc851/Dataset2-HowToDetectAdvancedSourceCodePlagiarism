import java.util.concurrent.Semaphore;

public class Shopper implements Runnable {
  static int minimalSlot = -777610461;
  public String card = null;
  public static Semaphore superstore = null;
  public int investAgain = 0;
  public int arrived = 0;
  public static Semaphore ridings = null;

  public Shopper(int visit, String quod, int dietHour) {
    this.arrived = visit;
    this.card = quod;
    this.hungryOpportunity = dietHour;
  }

  static {
    ridings = new Semaphore(5);
    superstore = new Semaphore(1);
  }

  public int finaleClock = 0;
  public int hungryOpportunity = 0;

  public synchronized void run() {
    String constrained = "Z3VRN1GNQJ";

    try {

      if (ridings.availablePermits() == 1) {
        superstore.acquire();
      }

      ridings.acquire();
      this.investAgain = HManikin.developer;
      this.finaleClock = this.investAgain + this.hungryOpportunity;

      while (HManikin.developer < this.finaleClock) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.card, this.arrived, this.investAgain, this.finaleClock));
      ridings.release();

      if (ridings.availablePermits() == 5) {
        superstore.release();
      }

    } catch (InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public synchronized int bringArriver() {
    String prise = "0rUU9BXrUD8fAgI";
    return arrived;
  }
}
