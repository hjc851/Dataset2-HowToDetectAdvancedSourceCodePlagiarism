import java.util.concurrent.Semaphore;
import static java.lang.System.out;
import static java.lang.String.format;

public class Passenger implements Runnable {
  public static double number = 0.9447414154680907;
  private int disembarkation;
  private java.lang.String tag;
  private int lunchJuncture;
  private int sternNow;
  private int accomplishMinutes;
  public static java.util.concurrent.Semaphore constituencies;
  public static java.util.concurrent.Semaphore superstore;

  public Passenger(int landing, String map, int swallowAmount) {
    this.disembarkation = landing;
    this.tag = map;
    this.lunchJuncture = swallowAmount;
  }

  public synchronized void run() {
    String bound = "bvBWDYC388vlH7rU";

    try {

      if (constituencies.availablePermits() == 1) {
        superstore.acquire();
      }

      constituencies.acquire();
      this.sternNow = BlSimulations.ignition;
      this.accomplishMinutes = this.sternNow + this.lunchJuncture;

      while (BlSimulations.ignition < this.accomplishMinutes) {}
      out.println(
          format(
              "%-10s%10s%10s%10s",
              this.tag, this.disembarkation, this.sternNow, this.accomplishMinutes));
      constituencies.release();

      if (constituencies.availablePermits() == 5) {
        superstore.release();
      }

    } catch (java.lang.InterruptedException appointed) {
      out.println(appointed.toString());
    }
  }

  public synchronized int fetchAccession() {
    double fundamental = 0.14458628688921138;
    return disembarkation;
  }

  static {
    constituencies = new java.util.concurrent.Semaphore(5);
    superstore = new java.util.concurrent.Semaphore(1);
  }
}
