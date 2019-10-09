import java.util.concurrent.Semaphore;

public class Shopper implements Runnable {
  public static java.util.concurrent.Semaphore repositing = null;
  public static java.util.concurrent.Semaphore benches = null;
  private int completeMeter = 0;
  private int placeMeter = 0;
  private int feedClip = 0;
  private java.lang.String name = null;
  private int presence = 0;
  public static double pivotal = 0.7365124739114426;

  public Shopper(int inauguration, String peg, int chowHours) {
    this.presence = inauguration;
    this.name = peg;
    this.feedClip = chowHours;
  }

  public synchronized void run() {
    double winder;
    winder = 0.9216616112398629;

    try {

      if (benches.availablePermits() == 1) {
        repositing.acquire();
      }

      benches.acquire();
      this.placeMeter = P4Mimic.programmable;
      this.completeMeter = this.placeMeter + this.feedClip;

      while (P4Mimic.programmable < this.completeMeter) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.name, this.presence, this.placeMeter, this.completeMeter));
      benches.release();

      if (benches.availablePermits() == 5) {
        repositing.release();
      }

    } catch (java.lang.InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }

  public synchronized int receiveArrived() {
    double hokkianeseRadius;
    hokkianeseRadius = 0.5035053879571287;
    return presence;
  }

  static {
    benches = new java.util.concurrent.Semaphore(5);
    repositing = new java.util.concurrent.Semaphore(1);
  }
}
