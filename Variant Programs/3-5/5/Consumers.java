import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Consumers implements Runnable {
  private static final int synX67int = 1;
  private static final int synX66int = 5;
  private static final int synX65int = 5;
  private static final String synX64String = "%-10s%10s%10s%10s";
  private static final int synX63int = 1;
  public int arriver = 0;
  public java.lang.String peg = null;
  public int feedClip = 0;
  public int derriereDays = 0;
  public int finisDays = 0;
  public static java.util.concurrent.Semaphore members = null;
  public static java.util.concurrent.Semaphore superstore = null;

  public Consumers(int inauguration, String pictures, int dietHour) {
    this.arriver = (inauguration);
    this.peg = (pictures);
    this.feedClip = (dietHour);
  }

  public synchronized void run() {

    try {

      if (members.availablePermits() == synX63int) {
        superstore.acquire();
      }

      members.acquire();
      this.derriereDays = (P1Simulating.beep);
      this.finisDays = (this.derriereDays + this.feedClip);

      while (P1Simulating.beep < this.finisDays) {}
      System.out.println(
          format(synX64String, this.peg, this.arriver, this.derriereDays, this.finisDays));
      members.release();

      if (members.availablePermits() == synX65int) {
        superstore.release();
      }

    } catch (java.lang.InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }

  public synchronized int canAppointment() {
    return arriver;
  }

  static {
    members = (new java.util.concurrent.Semaphore(synX66int));
    superstore = (new java.util.concurrent.Semaphore(synX67int));
  }
}
