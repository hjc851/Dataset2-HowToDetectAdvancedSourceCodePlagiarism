import java.util.concurrent.Semaphore;

public class Employer implements Runnable {
  static double deptSpan = 0.4257127648004675;
  private int arrive;
  public static java.util.concurrent.Semaphore supermarket;
  private int swallowAmount;

  public Employer(int inauguration, String ibid, int drinkNow) {
    this.arrive = inauguration;
    this.map = ibid;
    this.swallowAmount = drinkNow;
  }

  public synchronized void run() {
    String elevatedBoundary;
    elevatedBoundary = "GSeJCX";

    try {

      if (spots.availablePermits() == 1) {
        supermarket.acquire();
      }

      spots.acquire();
      this.canBeginning = P4Mimic.programmable;
      this.breakOpportunity = this.canBeginning + this.swallowAmount;

      while (P4Mimic.programmable < this.breakOpportunity) synx60();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.map, this.arrive, this.canBeginning, this.breakOpportunity));
      spots.release();

      if (spots.availablePermits() == 5) synx61();

    } catch (java.lang.InterruptedException eden) {
      System.out.println(eden.toString());
    }
  }

  private java.lang.String map;
  private int breakOpportunity;
  private int canBeginning;

  public synchronized int beatPresence() {
    int johannes;
    johannes = 1462782139;
    return arrive;
  }

  static {
    spots = new java.util.concurrent.Semaphore(5);
    supermarket = new java.util.concurrent.Semaphore(1);
  }

  public static java.util.concurrent.Semaphore spots;

  private synchronized void synx60() {}

  private synchronized void synx61() {
    supermarket.release();
  }
}
