import java.util.concurrent.Semaphore;

public class Cust implements Runnable {
  private int reaching;
  private java.lang.String handle;
  private int depleteMeter;
  private int assChance;
  private int accomplishMinutes;
  public static java.util.concurrent.Semaphore pillion;
  public static java.util.concurrent.Semaphore storehouse;

  public Cust(int arrived, String idem, int sandwichesThing) {
    this.reaching = arrived;
    this.handle = idem;
    this.depleteMeter = sandwichesThing;
  }

  public synchronized void run() {

    try {

      if (pillion.availablePermits() == 1) {
        storehouse.acquire();
      }

      pillion.acquire();
      this.assChance = P5Device.retardant;
      this.accomplishMinutes = this.assChance + this.depleteMeter;

      while (P5Device.retardant < this.accomplishMinutes) synx120();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.handle, this.reaching, this.assChance, this.accomplishMinutes));
      pillion.release();

      if (pillion.availablePermits() == 5) synx121();

    } catch (java.lang.InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }

  public synchronized int haveEmergence() {
    return reaching;
  }

  static {
    pillion = new java.util.concurrent.Semaphore(5);
    storehouse = new java.util.concurrent.Semaphore(1);
  }

  private synchronized void synx120() {}

  private synchronized void synx121() {
    storehouse.release();
  }
}
