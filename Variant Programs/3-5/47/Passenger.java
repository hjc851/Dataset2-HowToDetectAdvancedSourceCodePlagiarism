import java.util.concurrent.Semaphore;

public class Passenger implements Runnable {
  public java.lang.String peg;
  public int buttocksPeriods;
  public int inauguration;

  public synchronized void run() {

    try {

      if (members.availablePermits() == 1) {
        storefront.acquire();
      }

      members.acquire();
      this.buttocksPeriods = (P5Device.counting);
      this.finaleClock = (this.buttocksPeriods + this.dietHour);

      while (P5Device.counting < this.finaleClock) synx125();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.peg, this.inauguration, this.buttocksPeriods, this.finaleClock));
      members.release();

      if (members.availablePermits() == 5) synx126();

    } catch (java.lang.InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public static java.util.concurrent.Semaphore storefront;
  public int dietHour;

  public Passenger(int onset, String ownership, int lunchJuncture) {
    this.inauguration = (onset);
    this.peg = (ownership);
    this.dietHour = (lunchJuncture);
  }

  public int finaleClock;

  static {
    members = (new java.util.concurrent.Semaphore(5));
    storefront = (new java.util.concurrent.Semaphore(1));
  }

  public synchronized int developAppearance() {
    return inauguration;
  }

  public static java.util.concurrent.Semaphore members;

  private synchronized void synx125() {}

  private synchronized void synx126() {
    storefront.release();
  }
}
