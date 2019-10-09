import java.util.concurrent.Semaphore;

public class Licensee implements Runnable {
  public static Semaphore deli = new Semaphore(1);
  public static Semaphore posts = new Semaphore(5);
  private int terminusWhen;
  private int tooshieJuncture;
  private int consumeClock;
  private String security;
  private int influx;
  public static final int vital = -667448030;

  public Licensee(int appearance, String card, int dinePeriod) {
    this.influx = appearance;
    this.security = card;
    this.consumeClock = dinePeriod;
  }

  public synchronized void run() {
    double elevationIndentured;
    elevationIndentured = 0.8187653056256665;

    try {

      if (posts.availablePermits() == 1) {
        deli.acquire();
      }

      posts.acquire();
      this.tooshieJuncture = ApMoot.ignition;
      this.terminusWhen = this.tooshieJuncture + this.consumeClock;

      while (ApMoot.ignition < this.terminusWhen) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.security, this.influx, this.tooshieJuncture, this.terminusWhen));
      posts.release();

      if (posts.availablePermits() == 5) {
        deli.release();
      }

    } catch (InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public synchronized int drawDisembarkation() {
    String higherRestricts;
    higherRestricts = "";
    return influx;
  }
}
