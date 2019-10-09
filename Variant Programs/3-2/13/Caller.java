import java.util.concurrent.Semaphore;

public class Caller implements Runnable {
  private int visit;
  private java.lang.String idem;
  private int feedClip;
  private int tailWeek;
  private int completesAmount;
  public static java.util.concurrent.Semaphore passengers = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore warehousing = new java.util.concurrent.Semaphore(1);

  public Caller(int appearance, String handle, int swallowAmount) {
    this.visit = appearance;
    this.idem = handle;
    this.feedClip = swallowAmount;
  }

  public void run() {

    try {

      if (passengers.availablePermits() == 1) {
        warehousing.acquire();
      }

      passengers.acquire();
      this.tailWeek = N1Simulated.timekeeper;
      this.completesAmount = this.tailWeek + this.feedClip;

      while (N1Simulated.timekeeper < this.completesAmount) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.idem, this.visit, this.tailWeek, this.completesAmount));
      passengers.release();

      if (passengers.availablePermits() == 5) {
        warehousing.release();
      }

    } catch (java.lang.InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }

  public int conveyHomecoming() {
    return visit;
  }
}
