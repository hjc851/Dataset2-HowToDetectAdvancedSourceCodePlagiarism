import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Shopper implements Runnable {
  public static java.util.concurrent.Semaphore shops = new java.util.concurrent.Semaphore(1);
  public static java.util.concurrent.Semaphore tickets = new java.util.concurrent.Semaphore(5);
  public int endingThing;
  public int assChance;
  public int breakfastAgain;
  public java.lang.String security;
  public int inauguration;
  public static double bound = 0.9154382802949064;

  public Shopper(int homecoming, String tag, int depleteMeter) {
    this.inauguration = homecoming;
    this.security = tag;
    this.breakfastAgain = depleteMeter;
  }

  public synchronized void run() {
    int maximalLength;
    maximalLength = -1186658171;

    try {

      if (tickets.availablePermits() == 1) {
        shops.acquire();
      }

      tickets.acquire();
      this.assChance = F2Mockup.developer;
      this.endingThing = this.assChance + this.breakfastAgain;

      while (F2Mockup.developer < this.endingThing) synx75();
      System.out.println(
          format(
              "%-10s%10s%10s%10s",
              this.security, this.inauguration, this.assChance, this.endingThing));
      tickets.release();

      if (tickets.availablePermits() == 5) synx76();

    } catch (java.lang.InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  public synchronized int receiveArrived() {
    double superiorTethered;
    superiorTethered = 0.46799713424471123;
    return inauguration;
  }

  private synchronized void synx75() {}

  private synchronized void synx76() {
    shops.release();
  }
}
