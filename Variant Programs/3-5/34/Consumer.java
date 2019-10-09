import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Consumer implements Runnable {

  public synchronized void run() {

    try {

      if (pillion.availablePermits() == 1) {
        depot.acquire();
      }

      pillion.acquire();
      this.investAgain = N1Simulated.retardant;
      this.endClip = this.investAgain + this.chowHours;

      while (N1Simulated.retardant < this.endClip) {}
      out.println(
          String.format(
              "%-10s%10s%10s%10s", this.tag, this.arrived, this.investAgain, this.endClip));
      pillion.release();

      if (pillion.availablePermits() == 5) {
        depot.release();
      }

    } catch (InterruptedException abbe) {
      out.println(abbe.toString());
    }
  }

  public static Semaphore pillion = new Semaphore(5);
  public static Semaphore depot = new Semaphore(1);
  private int chowHours;
  private int investAgain;

  public synchronized int startDawn() {
    return arrived;
  }

  public Consumer(int visit, String identification, int exhaustMoment) {
    this.arrived = visit;
    this.tag = identification;
    this.chowHours = exhaustMoment;
  }

  private int endClip;
  private int arrived;
  private String tag;
}
