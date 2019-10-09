import java.util.concurrent.Semaphore;

public class Subscribers implements Runnable {
  private int cookPeriods = 0;
  private int inauguration = 0;
  private java.lang.String est = null;
  private int assChance = 0;

  public synchronized void run() {

    try {

      if (spots.availablePermits() == 1) {
        storage.acquire();
      }

      spots.acquire();
      this.assChance = EPrototype.stopwatch;
      this.terminusWhen = this.assChance + this.cookPeriods;

      while (EPrototype.stopwatch < this.terminusWhen) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.est, this.inauguration, this.assChance, this.terminusWhen));
      spots.release();

      if (spots.availablePermits() == 5) {
        storage.release();
      }

    } catch (java.lang.InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }

  public synchronized int haveEmergence() {
    return inauguration;
  }

  public static java.util.concurrent.Semaphore spots = new java.util.concurrent.Semaphore(5);
  private int terminusWhen = 0;

  public Subscribers(int arrive, String ownership, int breakfastAgain) {
    this.inauguration = arrive;
    this.est = ownership;
    this.cookPeriods = breakfastAgain;
  }

  public static java.util.concurrent.Semaphore storage = new java.util.concurrent.Semaphore(1);
}
