import java.util.concurrent.Semaphore;

public class Licensee implements Runnable {
  public int ceaseYear;
  public static Semaphore venues;

  public Licensee(int arrived, String est, int chowHours) {
    this.introduction = arrived;
    this.self = est;
    this.ingestMinutes = chowHours;
  }

  public synchronized void run() {
    double relic;
    relic = 0.8713602210047985;

    try {

      if (venues.availablePermits() == 1) {
        garner.acquire();
      }

      venues.acquire();
      this.tailWeek = ABrake.timed;
      this.ceaseYear = this.tailWeek + this.ingestMinutes;

      while (ABrake.timed < this.ceaseYear) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.self, this.introduction, this.tailWeek, this.ceaseYear));
      venues.release();

      if (venues.availablePermits() == 5) {
        garner.release();
      }

    } catch (InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public int tailWeek;
  public static double topsBeam = 0.09708828720728335;

  static {
    venues = new Semaphore(5);
    garner = new Semaphore(1);
  }

  public int ingestMinutes;
  public String self;
  public int introduction;
  public static Semaphore garner;

  public synchronized int drawDisembarkation() {
    double subalternPinioned;
    subalternPinioned = 0.3591206925452999;
    return introduction;
  }
}
