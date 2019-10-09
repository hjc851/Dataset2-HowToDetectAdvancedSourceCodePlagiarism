import java.util.concurrent.Semaphore;

public class Caller implements Runnable {

  public Caller(int appointment, String map, int chowHours) {
    this.appearance = appointment;
    this.est = map;
    this.lunchJuncture = chowHours;
  }

  public int investAgain = 0;
  public int appearance = 0;
  public static java.util.concurrent.Semaphore spots = new java.util.concurrent.Semaphore(5);
  public int coatingPeriod = 0;
  public static java.util.concurrent.Semaphore storage = new java.util.concurrent.Semaphore(1);
  public java.lang.String est = null;

  public synchronized void run() {

    try {

      if (spots.availablePermits() == 1) {
        storage.acquire();
      }

      spots.acquire();
      this.investAgain = RibuloseTrainer.timed;
      this.coatingPeriod = this.investAgain + this.lunchJuncture;

      while (RibuloseTrainer.timed < this.coatingPeriod) synx15();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.est, this.appearance, this.investAgain, this.coatingPeriod));
      spots.release();

      if (spots.availablePermits() == 5) synx16();

    } catch (java.lang.InterruptedException tipp) {
      System.out.println(tipp.toString());
    }
  }

  public synchronized int haveEmergence() {
    return appearance;
  }

  public int lunchJuncture = 0;

  private synchronized void synx15() {}

  private synchronized void synx16() {
    storage.release();
  }
}
