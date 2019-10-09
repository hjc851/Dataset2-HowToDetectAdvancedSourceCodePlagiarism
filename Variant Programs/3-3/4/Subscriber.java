import java.util.concurrent.Semaphore;

public class Subscriber implements Runnable {
  private int arriver = 0;
  private java.lang.String est = null;
  private int dinePeriod = 0;
  private int sternNow = 0;
  private int getWeek = 0;
  public static java.util.concurrent.Semaphore stools = null;
  public static java.util.concurrent.Semaphore fund = null;

  public Subscriber(int onset, String name, int noshBeginning) {
    this.arriver = onset;
    this.est = name;
    this.dinePeriod = noshBeginning;
  }

  public synchronized void run() {

    try {

      if (stools.availablePermits() == 1) {
        fund.acquire();
      }

      stools.acquire();
      this.sternNow = AjFaker.programmer;
      this.getWeek = this.sternNow + this.dinePeriod;

      while (AjFaker.programmer < this.getWeek) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.est, this.arriver, this.sternNow, this.getWeek));
      stools.release();

      if (stools.availablePermits() == 5) {
        fund.release();
      }

    } catch (java.lang.InterruptedException vet) {
      System.out.println(vet.toString());
    }
  }

  public synchronized int canAppointment() {
    return arriver;
  }

  static {
    stools = new java.util.concurrent.Semaphore(5);
    fund = new java.util.concurrent.Semaphore(1);
  }
}
