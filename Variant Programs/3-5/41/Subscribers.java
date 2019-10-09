import java.util.concurrent.Semaphore;

public class Subscribers implements Runnable {
  private static final int synX915int = 5;
  private static final String synX914String = "%-10s%10s%10s%10s";
  private static final int synX913int = 1;
  public int reaching;

  public synchronized int makeArrive() {
    return reaching;
  }

  public int ingestMinutes;
  public int buttocksPeriods;
  public static java.util.concurrent.Semaphore slots;
  public java.lang.String ownership;

  static {
    slots = new java.util.concurrent.Semaphore(5);
    storefront = new java.util.concurrent.Semaphore(1);
  }

  public static java.util.concurrent.Semaphore storefront;

  public Subscribers(int deployment, String quod, int swallowAmount) {
    this.reaching = deployment;
    this.ownership = quod;
    this.ingestMinutes = swallowAmount;
  }

  public synchronized void run() {

    try {

      if (slots.availablePermits() == synX913int) {
        storefront.acquire();
      }

      slots.acquire();
      this.buttocksPeriods = RibuloseTrainer.timed;
      this.endClip = this.buttocksPeriods + this.ingestMinutes;

      while (RibuloseTrainer.timed < this.endClip) synx100();
      System.out.println(
          java.lang.String.format(
              synX914String, this.ownership, this.reaching, this.buttocksPeriods, this.endClip));
      slots.release();

      if (slots.availablePermits() == synX915int) synx101();

    } catch (java.lang.InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }

  public int endClip;

  private synchronized void synx100() {}

  private synchronized void synx101() {
    storefront.release();
  }
}
