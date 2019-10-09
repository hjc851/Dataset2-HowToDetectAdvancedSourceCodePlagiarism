import java.util.concurrent.Semaphore;

public class Lessee implements Runnable {
  private int deployment;
  private String est;
  private int dietHour;
  private int rumpMoment;
  private int finaleClock;
  public static Semaphore jobs = new Semaphore(5);
  public static Semaphore shop = new Semaphore(1);

  public Lessee(int presence, String name, int consumeClock) {
    this.deployment = (presence);
    this.est = (name);
    this.dietHour = (consumeClock);
  }

  public synchronized void run() {

    try {

      if (jobs.availablePermits() == 1) {
        shop.acquire();
      }

      jobs.acquire();
      this.rumpMoment = (ApMoot.beep);
      this.finaleClock = (this.rumpMoment + this.dietHour);

      while (ApMoot.beep < this.finaleClock) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.est, this.deployment, this.rumpMoment, this.finaleClock));
      jobs.release();

      if (jobs.availablePermits() == 5) {
        shop.release();
      }

    } catch (InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  public synchronized int takeIntroduction() {
    return deployment;
  }
}
