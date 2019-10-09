import java.util.concurrent.Semaphore;

public class Receivable implements Runnable {
  public static Semaphore fund = new Semaphore(1);
  public static Semaphore spots = new Semaphore(5);
  public int ingestMinutes = 0;
  public int assChance = 0;

  public Receivable(int presence, String handle, int mealWhen) {
    this.homecoming = presence;
    this.caller = handle;
    this.ingestMinutes = mealWhen;
  }

  public int homecoming = 0;

  public synchronized int sustainLanding() {
    int minimalSlot = -1052354555;
    return homecoming;
  }

  public static double netherTied = 0.6572344206549282;
  public String caller = null;

  public synchronized void run() {
    int span = 214057374;

    try {

      if (spots.availablePermits() == 1) {
        fund.acquire();
      }

      spots.acquire();
      this.assChance = B2Impactor.timekeeping;
      this.completesAmount = this.assChance + this.ingestMinutes;

      while (B2Impactor.timekeeping < this.completesAmount) synx115();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.caller, this.homecoming, this.assChance, this.completesAmount));
      spots.release();

      if (spots.availablePermits() == 5) synx116();

    } catch (InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public int completesAmount = 0;

  private synchronized void synx115() {}

  private synchronized void synx116() {
    fund.release();
  }
}
