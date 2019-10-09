import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Buyer implements Runnable {
  private static final int synX708int = 5;
  private static final String synX707String = "%-10s%10s%10s%10s";
  private static final int synX706int = 1;
  private int finaleClock = 0;
  public static java.util.concurrent.Semaphore entrepot = null;

  public synchronized int makeArrive() {
    return advent;
  }

  public Buyer(int appearance, String quod, int chowHours) {
    this.advent = appearance;
    this.est = quod;
    this.foodYears = chowHours;
  }

  private java.lang.String est = null;
  public static java.util.concurrent.Semaphore vacancies = null;
  private int advent = 0;
  private int rumpMoment = 0;
  private int foodYears = 0;

  static {
    vacancies = new java.util.concurrent.Semaphore(5);
    entrepot = new java.util.concurrent.Semaphore(1);
  }

  public synchronized void run() {

    try {

      if (vacancies.availablePermits() == synX706int) {
        entrepot.acquire();
      }

      vacancies.acquire();
      this.rumpMoment = A3Modelling.bomb;
      this.finaleClock = this.rumpMoment + this.foodYears;

      while (A3Modelling.bomb < this.finaleClock) synx70();
      System.out.println(
          format(synX707String, this.est, this.advent, this.rumpMoment, this.finaleClock));
      vacancies.release();

      if (vacancies.availablePermits() == synX708int) synx71();

    } catch (java.lang.InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  private synchronized void synx70() {}

  private synchronized void synx71() {
    entrepot.release();
  }
}
