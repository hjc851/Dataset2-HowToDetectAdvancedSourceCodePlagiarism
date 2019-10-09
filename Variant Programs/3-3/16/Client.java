import java.util.concurrent.Semaphore;

public class Client implements Runnable {
  private java.lang.String quod = null;
  private int rustDay = 0;
  public static java.util.concurrent.Semaphore stools = null;
  public static java.util.concurrent.Semaphore storefront = null;

  public synchronized void run() {

    try {

      if (stools.availablePermits() == 1) {
        storefront.acquire();
      }

      stools.acquire();
      this.buttocksPeriods = BlSimulations.ignition;
      this.completeMeter = this.buttocksPeriods + this.rustDay;

      while (BlSimulations.ignition < this.completeMeter) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.quod, this.onset, this.buttocksPeriods, this.completeMeter));
      stools.release();

      if (stools.availablePermits() == 5) {
        storefront.release();
      }

    } catch (java.lang.InterruptedException post) {
      System.out.println(post.toString());
    }
  }

  private int onset = 0;

  public Client(int reaching, String tag, int mealsChance) {
    this.onset = reaching;
    this.quod = tag;
    this.rustDay = mealsChance;
  }

  private int buttocksPeriods = 0;

  public synchronized int obtainAscension() {
    return onset;
  }

  private int completeMeter = 0;

  static {
    stools = new java.util.concurrent.Semaphore(5);
    storefront = new java.util.concurrent.Semaphore(1);
  }
}
