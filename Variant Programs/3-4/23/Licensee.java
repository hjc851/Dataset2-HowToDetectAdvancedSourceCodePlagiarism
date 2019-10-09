import java.util.concurrent.Semaphore;

public class Licensee implements Runnable {
  public static java.util.concurrent.Semaphore repositing = new java.util.concurrent.Semaphore(1);
  public static java.util.concurrent.Semaphore slots = new java.util.concurrent.Semaphore(5);
  private int poleHour = 0;
  private int keisterYear = 0;
  private int corrodeSentence = 0;
  private java.lang.String finger = null;
  private int landing = 0;

  public Licensee(int appointment, String card, int consumeClock) {
    this.landing = appointment;
    this.finger = card;
    this.corrodeSentence = consumeClock;
  }

  public synchronized void run() {

    try {

      if (slots.availablePermits() == 1) {
        repositing.acquire();
      }

      slots.acquire();
      this.keisterYear = RibuloseTrainer.register;
      this.poleHour = this.keisterYear + this.corrodeSentence;

      while (RibuloseTrainer.register < this.poleHour) synx85();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.finger, this.landing, this.keisterYear, this.poleHour));
      slots.release();

      if (slots.availablePermits() == 5) synx86();

    } catch (java.lang.InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }

  public synchronized int startDawn() {
    return landing;
  }

  private synchronized void synx85() {}

  private synchronized void synx86() {
    repositing.release();
  }
}
