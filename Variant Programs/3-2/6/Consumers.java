import java.util.concurrent.Semaphore;

public class Consumers implements Runnable {
  private int visit;
  private java.lang.String identifying;
  private int dinePeriod;
  private int fannyPeriod;
  private int completeMeter;
  public static java.util.concurrent.Semaphore vacancies = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore superstore = new java.util.concurrent.Semaphore(1);

  public Consumers(int inauguration, String milad, int devourDays) {
    this.visit = inauguration;
    this.identifying = milad;
    this.dinePeriod = devourDays;
  }

  public void run() {

    try {

      if (vacancies.availablePermits() == 1) {
        superstore.acquire();
      }

      vacancies.acquire();
      this.fannyPeriod = N1Simulated.scheduler;
      this.completeMeter = this.fannyPeriod + this.dinePeriod;

      while (N1Simulated.scheduler < this.completeMeter) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.identifying, this.visit, this.fannyPeriod, this.completeMeter));
      vacancies.release();

      if (vacancies.availablePermits() == 5) {
        superstore.release();
      }

    } catch (java.lang.InterruptedException eden) {
      System.out.println(eden.toString());
    }
  }

  public int takeIntroduction() {
    return visit;
  }
}
