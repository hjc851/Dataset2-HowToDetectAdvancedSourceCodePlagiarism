import java.util.concurrent.Semaphore;

public class Buyer implements Runnable {
  public int dinePeriod;

  public Buyer(int visit, String peg, int hungryOpportunity) {
    this.onset = visit;
    this.idem = peg;
    this.dinePeriod = hungryOpportunity;
  }

  public int completingNow;
  public static java.util.concurrent.Semaphore jobs = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore superstore = new java.util.concurrent.Semaphore(1);
  public int onset;
  public int assChance;

  public synchronized void run() {

    try {

      if (jobs.availablePermits() == 1) {
        superstore.acquire();
      }

      jobs.acquire();
      this.assChance = ApMoot.developer;
      this.completingNow = this.assChance + this.dinePeriod;

      while (ApMoot.developer < this.completingNow) synx45();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.idem, this.onset, this.assChance, this.completingNow));
      jobs.release();

      if (jobs.availablePermits() == 5) synx46();

    } catch (java.lang.InterruptedException vet) {
      System.out.println(vet.toString());
    }
  }

  public synchronized int conveyHomecoming() {
    return onset;
  }

  public java.lang.String idem;

  private synchronized void synx45() {}

  private synchronized void synx46() {
    superstore.release();
  }
}
