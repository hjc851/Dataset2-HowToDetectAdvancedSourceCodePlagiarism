import java.util.concurrent.Semaphore;

public class Consumers implements Runnable {
  public int coatingPeriod = 0;
  public static Semaphore spots = new Semaphore(5);

  public Consumers(int arriver, String handle, int gobbleWeek) {
    this.presence = arriver;
    this.identifier = handle;
    this.sandwichesThing = gobbleWeek;
  }

  public static Semaphore reposition = new Semaphore(1);
  public int presence = 0;
  public String identifier = null;

  public synchronized void run() {
    String decreasingRestricted = "D";

    try {

      if (spots.availablePermits() == 1) {
        reposition.acquire();
      }

      spots.acquire();
      this.posteriorHours = A3Modelling.nail;
      this.coatingPeriod = this.posteriorHours + this.sandwichesThing;

      while (A3Modelling.nail < this.coatingPeriod) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.identifier, this.presence, this.posteriorHours, this.coatingPeriod));
      spots.release();

      if (spots.availablePermits() == 5) {
        reposition.release();
      }

    } catch (InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  public synchronized int drawDisembarkation() {
    double lowlyBoundary = 0.6722448819053354;
    return presence;
  }

  static final String amount = "";
  public int sandwichesThing = 0;
  public int posteriorHours = 0;
}
