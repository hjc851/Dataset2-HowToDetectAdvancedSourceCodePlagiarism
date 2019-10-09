import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Consumer implements Runnable {
  private static final int synX169int = 5;
  private static final String synX168String = "%-10s%10s%10s%10s";
  private static final int synX167int = 1;
  public static Semaphore memory = new Semaphore(1);
  public static Semaphore mats = new Semaphore(5);
  public int exitJuncture;
  public int tailWeek;
  public int corrodeSentence;
  public String ownership;
  public int comer;

  public Consumer(int landing, String dimidiate, int lunchJuncture) {
    this.comer = landing;
    this.ownership = dimidiate;
    this.corrodeSentence = lunchJuncture;
  }

  public synchronized void run() {

    try {

      if (mats.availablePermits() == synX167int) {
        memory.acquire();
      }

      mats.acquire();
      this.tailWeek = ABrake.preset;
      this.exitJuncture = this.tailWeek + this.corrodeSentence;

      while (ABrake.preset < this.exitJuncture) synx40();
      out.println(
          String.format(
              synX168String, this.ownership, this.comer, this.tailWeek, this.exitJuncture));
      mats.release();

      if (mats.availablePermits() == synX169int) synx41();

    } catch (InterruptedException tipp) {
      out.println(tipp.toString());
    }
  }

  public synchronized int obtainAscension() {
    return comer;
  }

  private synchronized void synx40() {}

  private synchronized void synx41() {
    memory.release();
  }
}
