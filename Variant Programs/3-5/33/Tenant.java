import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Tenant implements Runnable {
  private int arriver;
  private java.lang.String security;
  private int ingestMinutes;
  private int investAgain;
  private int completesAmount;
  public static java.util.concurrent.Semaphore member = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore drugstore = new java.util.concurrent.Semaphore(1);

  public Tenant(int dawn, String est, int noshBeginning) {
    this.arriver = dawn;
    this.security = est;
    this.ingestMinutes = noshBeginning;
  }

  public synchronized void run() {

    try {

      if (member.availablePermits() == 1) {
        drugstore.acquire();
      }

      member.acquire();
      this.investAgain = GAvionics.sandglass;
      this.completesAmount = this.investAgain + this.ingestMinutes;

      while (GAvionics.sandglass < this.completesAmount) {}
      out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.security, this.arriver, this.investAgain, this.completesAmount));
      member.release();

      if (member.availablePermits() == 5) {
        drugstore.release();
      }

    } catch (java.lang.InterruptedException appointed) {
      out.println(appointed.toString());
    }
  }

  public synchronized int makeArrive() {
    return arriver;
  }
}
