import java.util.concurrent.Semaphore;

public class Patient implements Runnable {
  private int arrived = 0;
  private java.lang.String name = null;
  private int devourDays = 0;
  private int inductMonth = 0;
  private int finaleClock = 0;
  public static java.util.concurrent.Semaphore positions = null;
  public static java.util.concurrent.Semaphore repositing = null;

  public Patient(int landing, String milad, int corrodeSentence) {
    this.arrived = landing;
    this.name = milad;
    this.devourDays = corrodeSentence;
  }

  public synchronized void run() {

    try {

      if (positions.availablePermits() == 1) {
        repositing.acquire();
      }

      positions.acquire();
      this.inductMonth = MDemo.sandglass;
      this.finaleClock = this.inductMonth + this.devourDays;

      while (MDemo.sandglass < this.finaleClock) synx110();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.name, this.arrived, this.inductMonth, this.finaleClock));
      positions.release();

      if (positions.availablePermits() == 5) synx111();

    } catch (java.lang.InterruptedException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  public synchronized int beatPresence() {
    return arrived;
  }

  static {
    positions = new java.util.concurrent.Semaphore(5);
    repositing = new java.util.concurrent.Semaphore(1);
  }

  private synchronized void synx110() {}

  private synchronized void synx111() {
    repositing.release();
  }
}
