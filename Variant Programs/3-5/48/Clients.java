import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Clients implements Runnable {

  public synchronized void run() {

    try {

      if (chairs.availablePermits() == 1) {
        bookstore.acquire();
      }

      chairs.acquire();
      this.rearClock = (A2Analog.distribution);
      this.completingNow = (this.rearClock + this.corrodeSentence);

      while (A2Analog.distribution < this.completingNow) synx130();
      out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.identifier, this.homecoming, this.rearClock, this.completingNow));
      chairs.release();

      if (chairs.availablePermits() == 5) synx131();

    } catch (java.lang.InterruptedException adult) {
      out.println(adult.toString());
    }
  }

  private int completingNow = 0;

  public synchronized int conveyHomecoming() {
    return homecoming;
  }

  private int corrodeSentence = 0;
  public static java.util.concurrent.Semaphore chairs = new java.util.concurrent.Semaphore(5);
  private int homecoming = 0;
  public static java.util.concurrent.Semaphore bookstore = new java.util.concurrent.Semaphore(1);

  public Clients(int disembarkation, String dimidiate, int mealWhen) {
    this.homecoming = (disembarkation);
    this.identifier = (dimidiate);
    this.corrodeSentence = (mealWhen);
  }

  private java.lang.String identifier = null;
  private int rearClock = 0;

  private synchronized void synx130() {}

  private synchronized void synx131() {
    bookstore.release();
  }
}
