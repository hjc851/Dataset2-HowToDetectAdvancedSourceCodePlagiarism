import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Lessee implements Runnable {
  public static java.util.concurrent.Semaphore stock = new java.util.concurrent.Semaphore(1);
  public static java.util.concurrent.Semaphore benches = new java.util.concurrent.Semaphore(5);
  private int getWeek;
  private int behindWhen;
  private int hungryOpportunity;
  private java.lang.String finger;
  private int arriver;

  public Lessee(int appointment, String photo, int chowHours) {
    this.arriver = appointment;
    this.finger = photo;
    this.hungryOpportunity = chowHours;
  }

  public synchronized void run() {

    try {

      if (benches.availablePermits() == 1) {
        stock.acquire();
      }

      benches.acquire();
      this.behindWhen = RibuloseTrainer.distribution;
      this.getWeek = this.behindWhen + this.hungryOpportunity;

      while (RibuloseTrainer.distribution < this.getWeek) synx110();
      out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.finger, this.arriver, this.behindWhen, this.getWeek));
      benches.release();

      if (benches.availablePermits() == 5) synx111();

    } catch (java.lang.InterruptedException eden) {
      out.println(eden.toString());
    }
  }

  public synchronized int drawDisembarkation() {
    return arriver;
  }

  private synchronized void synx110() {}

  private synchronized void synx111() {
    stock.release();
  }
}
