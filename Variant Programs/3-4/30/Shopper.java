import java.util.concurrent.Semaphore;

public class Shopper implements Runnable {

  public synchronized int makeArrive() {
    return visit;
  }

  public int visit;

  public synchronized void run() {

    try {

      if (posts.availablePermits() == 1) {
        shop.acquire();
      }

      posts.acquire();
      this.fannyPeriod = C2Sim.bomb;
      this.completedYears = this.fannyPeriod + this.devourDays;

      while (C2Sim.bomb < this.completedYears) synx100();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.identifying, this.visit, this.fannyPeriod, this.completedYears));
      posts.release();

      if (posts.availablePermits() == 5) synx101();

    } catch (java.lang.InterruptedException abbe) {
      System.out.println(abbe.toString());
    }
  }

  static {
    posts = new java.util.concurrent.Semaphore(5);
    shop = new java.util.concurrent.Semaphore(1);
  }

  public int fannyPeriod;
  public static java.util.concurrent.Semaphore shop;
  public int devourDays;
  public java.lang.String identifying;
  public static java.util.concurrent.Semaphore posts;

  public Shopper(int comer, String identification, int hungryOpportunity) {
    this.visit = comer;
    this.identifying = identification;
    this.devourDays = hungryOpportunity;
  }

  public int completedYears;

  private synchronized void synx100() {}

  private synchronized void synx101() {
    shop.release();
  }
}
