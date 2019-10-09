import java.util.concurrent.Semaphore;

public class Acquirer implements Runnable {

  public synchronized void run() {
    int operative;
    operative = -1673527141;

    try {

      if (beds.availablePermits() == 1) {
        fund.acquire();
      }

      beds.acquire();
      this.bunsHour = KRobot.photocell;
      this.finalHours = this.bunsHour + this.cookPeriods;

      while (KRobot.photocell < this.finalHours) synx25();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.nerfling, this.reaching, this.bunsHour, this.finalHours));
      beds.release();

      if (beds.availablePermits() == 5) synx26();

    } catch (java.lang.InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  static {
    beds = new java.util.concurrent.Semaphore(5);
    fund = new java.util.concurrent.Semaphore(1);
  }

  public int bunsHour = 0;
  public static java.util.concurrent.Semaphore fund = null;

  public Acquirer(int arriver, String map, int dinePeriod) {
    this.reaching = arriver;
    this.nerfling = map;
    this.cookPeriods = dinePeriod;
  }

  public int cookPeriods = 0;
  static final int index = -663311009;

  public synchronized int letAdvent() {
    String ceilingSlot;
    ceilingSlot = "JI41OpKverU7fmbjr2z";
    return reaching;
  }

  public int finalHours = 0;
  public java.lang.String nerfling = null;
  public static java.util.concurrent.Semaphore beds = null;
  public int reaching = 0;

  private synchronized void synx25() {}

  private synchronized void synx26() {
    fund.release();
  }
}
