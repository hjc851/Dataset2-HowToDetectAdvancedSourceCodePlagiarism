import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Cust implements Runnable {
  static double symbolic = 0.8090726288727773;
  public int disembarkation = 0;
  public java.lang.String handle = null;
  public int mealWhen = 0;
  public int rearClock = 0;
  public int breakOpportunity = 0;
  public static java.util.concurrent.Semaphore pillion = null;
  public static java.util.concurrent.Semaphore warehousing = null;

  public Cust(int influx, String user, int depleteMeter) {
    this.disembarkation = influx;
    this.handle = user;
    this.mealWhen = depleteMeter;
  }

  public synchronized void run() {
    int kateOuter = 1807773437;

    try {

      if (pillion.availablePermits() == 1) {
        warehousing.acquire();
      }

      pillion.acquire();
      this.rearClock = ApMoot.timed;
      this.breakOpportunity = this.rearClock + this.mealWhen;

      while (ApMoot.timed < this.breakOpportunity) {}
      out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.handle, this.disembarkation, this.rearClock, this.breakOpportunity));
      pillion.release();

      if (pillion.availablePermits() == 5) {
        warehousing.release();
      }

    } catch (java.lang.InterruptedException libris) {
      out.println(libris.toString());
    }
  }

  public synchronized int startDawn() {
    String operative = "DDj0ro1cD3UVTYd7eB";
    return disembarkation;
  }

  static {
    pillion = new java.util.concurrent.Semaphore(5);
    warehousing = new java.util.concurrent.Semaphore(1);
  }
}
