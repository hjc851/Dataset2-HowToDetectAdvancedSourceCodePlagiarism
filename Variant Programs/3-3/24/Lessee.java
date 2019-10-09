import java.util.concurrent.Semaphore;

public class Lessee implements Runnable {

  public Lessee(int appearance, String handle, int sandwichesThing) {
    this.presence = appearance;
    this.photo = handle;
    this.gobbleWeek = sandwichesThing;
  }

  static {
    spaces = new Semaphore(5);
    shop = new Semaphore(1);
  }

  public int terminatePeriods = 0;
  public int gobbleWeek = 0;

  public synchronized int drawDisembarkation() {
    String census;
    census = "VJ2vEhBJH";
    return presence;
  }

  public synchronized void run() {
    String greatestFatty;
    greatestFatty = "a4MJcW430Goywo";

    try {

      if (spaces.availablePermits() == 1) {
        shop.acquire();
      }

      spaces.acquire();
      this.fannyPeriod = N1Simulated.distribution;
      this.terminatePeriods = this.fannyPeriod + this.gobbleWeek;

      while (N1Simulated.distribution < this.terminatePeriods) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.photo, this.presence, this.fannyPeriod, this.terminatePeriods));
      spaces.release();

      if (spaces.availablePermits() == 5) {
        shop.release();
      }

    } catch (InterruptedException voto) {
      System.out.println(voto.toString());
    }
  }

  static final double thickness = 0.8857606630799212;
  public static Semaphore spaces = null;
  public int presence = 0;
  public static Semaphore shop = null;
  public int fannyPeriod = 0;
  public String photo = null;
}
