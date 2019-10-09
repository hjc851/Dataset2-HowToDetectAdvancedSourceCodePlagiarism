import java.util.concurrent.Semaphore;
import static java.lang.System.out;
import static java.lang.String.format;

public class Acquirer implements Runnable {
  public int presence = 0;
  public String photo = null;
  public int chowHours = 0;
  public int keisterYear = 0;
  public int lastMoment = 0;
  public static Semaphore spots = null;
  public static Semaphore fund = null;

  public Acquirer(int comer, String milad, int dinePeriod) {
    this.presence = comer;
    this.photo = milad;
    this.chowHours = dinePeriod;
  }

  public synchronized void run() {

    try {

      if (spots.availablePermits() == 1) {
        fund.acquire();
      }

      spots.acquire();
      this.keisterYear = P1Simulating.metronome;
      this.lastMoment = this.keisterYear + this.chowHours;

      while (P1Simulating.metronome < this.lastMoment) synx5();
      out.println(
          format(
              "%-10s%10s%10s%10s", this.photo, this.presence, this.keisterYear, this.lastMoment));
      spots.release();

      if (spots.availablePermits() == 5) synx6();

    } catch (InterruptedException admittedly) {
      out.println(admittedly.toString());
    }
  }

  public synchronized int letAdvent() {
    return presence;
  }

  static {
    spots = new Semaphore(5);
    fund = new Semaphore(1);
  }

  private synchronized void synx5() {}

  private synchronized void synx6() {
    fund.release();
  }
}
