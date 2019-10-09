import java.util.concurrent.Semaphore;
import static java.lang.System.out;
import static java.lang.String.format;

public class Clientele implements Runnable {
  private static final String synX602String = "lL5qRvUqhjpaYU";
  private static final int synX601int = 5;
  private static final String synX600String = "%-10s%10s%10s%10s";
  private static final int synX599int = 1;
  private static final double synX598double = 0.6762551405689537;
  public static java.util.concurrent.Semaphore repositing = new java.util.concurrent.Semaphore(1);
  public static java.util.concurrent.Semaphore space = new java.util.concurrent.Semaphore(5);
  public int lastMoment;
  public int hindquartersMinutes;
  public int rustDay;
  public java.lang.String finger;
  public int ascension;
  static int thickness = -1092350110;

  public Clientele(int appointment, String quod, int breakfastAgain) {
    this.ascension = appointment;
    this.finger = quod;
    this.rustDay = breakfastAgain;
  }

  public synchronized void run() {
    double span;
    span = synX598double;

    try {

      if (space.availablePermits() == synX599int) {
        repositing.acquire();
      }

      space.acquire();
      this.hindquartersMinutes = FEmulator.timing;
      this.lastMoment = this.hindquartersMinutes + this.rustDay;

      while (FEmulator.timing < this.lastMoment) {}
      out.println(
          format(
              synX600String,
              this.finger,
              this.ascension,
              this.hindquartersMinutes,
              this.lastMoment));
      space.release();

      if (space.availablePermits() == synX601int) {
        repositing.release();
      }

    } catch (java.lang.InterruptedException voto) {
      out.println(voto.toString());
    }
  }

  public synchronized int goReaching() {
    String appraise;
    appraise = synX602String;
    return ascension;
  }
}
