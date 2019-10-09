import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Clients implements Runnable {
  private static final int synX818int = 5;
  private static final String synX817String = "%-10s%10s%10s%10s";
  private static final int synX816int = 1;
  private static final int synX815int = -401915596;
  private static final double synX814double = 0.510267907764225;
  public int chewYear = 0;
  public java.lang.String map = null;
  public int rumpMoment = 0;

  public synchronized int bringArriver() {
    double superiorTethered;
    superiorTethered = synX814double;
    return disembarkation;
  }

  public int disembarkation = 0;
  public static java.util.concurrent.Semaphore supermarket = null;

  static {
    elects = new java.util.concurrent.Semaphore(5);
    supermarket = new java.util.concurrent.Semaphore(1);
  }

  public Clients(int landing, String identification, int dietHour) {
    this.disembarkation = landing;
    this.map = identification;
    this.chewYear = dietHour;
  }

  public static final String morin = "UxSN3gBbZyLQ";
  public static java.util.concurrent.Semaphore elects = null;
  public int completingNow = 0;

  public synchronized void run() {
    int beam;
    beam = synX815int;

    try {

      if (elects.availablePermits() == synX816int) {
        supermarket.acquire();
      }

      elects.acquire();
      this.rumpMoment = C4Joystick.bomb;
      this.completingNow = this.rumpMoment + this.chewYear;

      while (C4Joystick.bomb < this.completingNow) synx85();
      out.println(
          java.lang.String.format(
              synX817String, this.map, this.disembarkation, this.rumpMoment, this.completingNow));
      elects.release();

      if (elects.availablePermits() == synX818int) synx86();

    } catch (java.lang.InterruptedException adoptee) {
      out.println(adoptee.toString());
    }
  }

  private synchronized void synx85() {}

  private synchronized void synx86() {
    supermarket.release();
  }
}
