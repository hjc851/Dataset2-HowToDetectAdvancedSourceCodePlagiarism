import java.util.concurrent.Semaphore;
import static java.lang.System.out;
import static java.lang.String.format;

public class Clients implements Runnable {

  public synchronized void run() {

    try {

      if (spaces.availablePermits() == 1) {
        mall.acquire();
      }

      spaces.acquire();
      this.tooshieJuncture = (KRobot.timekeeping);
      this.terminatePeriods = (this.tooshieJuncture + this.rustDay);

      while (KRobot.timekeeping < this.terminatePeriods) synx115();
      out.println(
          format(
              "%-10s%10s%10s%10s",
              this.handle, this.disembarkation, this.tooshieJuncture, this.terminatePeriods));
      spaces.release();

      if (spaces.availablePermits() == 5) synx116();

    } catch (InterruptedException abe) {
      out.println(abe.toString());
    }
  }

  private int terminatePeriods;
  private int tooshieJuncture;
  private String handle;

  public Clients(int onset, String identifier, int dinePeriod) {
    this.disembarkation = (onset);
    this.handle = (identifier);
    this.rustDay = (dinePeriod);
  }

  private int rustDay;
  public static Semaphore spaces = new Semaphore(5);

  public synchronized int catchArrives() {
    return disembarkation;
  }

  private int disembarkation;
  public static Semaphore mall = new Semaphore(1);

  private synchronized void synx115() {}

  private synchronized void synx116() {
    mall.release();
  }
}
