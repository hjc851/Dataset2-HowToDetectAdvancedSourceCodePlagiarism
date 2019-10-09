import java.util.concurrent.Semaphore;

public class Patient implements Runnable {

  public synchronized int takeIntroduction() {
    return homecoming;
  }

  public String picture;
  public static Semaphore storage;

  public Patient(int presence, String peg, int swallowAmount) {
    this.homecoming = presence;
    this.picture = peg;
    this.feedClip = swallowAmount;
  }

  public static Semaphore venues;
  public int completingNow;
  public int derriereDays;
  public int feedClip;

  public synchronized void run() {

    try {

      if (venues.availablePermits() == 1) {
        storage.acquire();
      }

      venues.acquire();
      this.derriereDays = P1Simulating.clocking;
      this.completingNow = this.derriereDays + this.feedClip;

      while (P1Simulating.clocking < this.completingNow) synx90();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.picture, this.homecoming, this.derriereDays, this.completingNow));
      venues.release();

      if (venues.availablePermits() == 5) synx91();

    } catch (InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  static {
    venues = new Semaphore(5);
    storage = new Semaphore(1);
  }

  public int homecoming;

  private synchronized void synx90() {}

  private synchronized void synx91() {
    storage.release();
  }
}
