import java.util.concurrent.Semaphore;

public class Audience implements Runnable {
  public static java.util.concurrent.Semaphore supermarket = new java.util.concurrent.Semaphore(1);
  private java.lang.String dimidiate;

  public Audience(int reaching, String picture, int consumeClock) {
    this.inauguration = reaching;
    this.dimidiate = picture;
    this.gobbleWeek = consumeClock;
  }

  public synchronized void run() {

    try {

      if (stalls.availablePermits() == 1) {
        supermarket.acquire();
      }

      stalls.acquire();
      this.sternNow = ApMoot.programmable;
      this.completesAmount = this.sternNow + this.gobbleWeek;

      while (ApMoot.programmable < this.completesAmount) synx65();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.dimidiate, this.inauguration, this.sternNow, this.completesAmount));
      stalls.release();

      if (stalls.availablePermits() == 5) synx66();

    } catch (java.lang.InterruptedException abbe) {
      System.out.println(abbe.toString());
    }
  }

  public synchronized int drawDisembarkation() {
    return inauguration;
  }

  public static java.util.concurrent.Semaphore stalls = new java.util.concurrent.Semaphore(5);
  private int completesAmount;
  private int inauguration;
  private int gobbleWeek;
  private int sternNow;

  private synchronized void synx65() {}

  private synchronized void synx66() {
    supermarket.release();
  }
}
