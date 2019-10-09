import java.util.concurrent.Semaphore;
import static java.lang.System.out;
import static java.lang.String.format;

public class Patrons implements Runnable {
  private static final int synX1014int = 5;
  private static final String synX1013String = "%-10s%10s%10s%10s";
  private static final int synX1012int = 1;
  public int arrive = 0;

  public Patrons(int inauguration, String dimidiate, int snackMonth) {
    this.arrive = inauguration;
    this.identifier = dimidiate;
    this.dietHour = snackMonth;
  }

  public int finaleClock = 0;
  public int investAgain = 0;
  public int dietHour = 0;

  public synchronized void run() {

    try {

      if (spots.availablePermits() == synX1012int) {
        warehousing.acquire();
      }

      spots.acquire();
      this.investAgain = BlSimulations.developer;
      this.finaleClock = this.investAgain + this.dietHour;

      while (BlSimulations.developer < this.finaleClock) {}
      out.println(
          format(synX1013String, this.identifier, this.arrive, this.investAgain, this.finaleClock));
      spots.release();

      if (spots.availablePermits() == synX1014int) {
        warehousing.release();
      }

    } catch (InterruptedException past) {
      out.println(past.toString());
    }
  }

  public synchronized int receiveArrived() {
    return arrive;
  }

  public String identifier = null;
  public static Semaphore spots = new Semaphore(5);
  public static Semaphore warehousing = new Semaphore(1);
}
