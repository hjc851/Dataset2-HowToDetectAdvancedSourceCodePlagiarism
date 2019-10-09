import java.util.concurrent.Semaphore;

public class Patrons implements Runnable {
  public static Semaphore mall = null;
  public int inauguration = 0;

  public synchronized int driveOnset() {
    String circumscribe;
    circumscribe = "qQiXXk";
    return inauguration;
  }

  public int derriereDays = 0;

  public Patrons(int disembarkation, String tag, int ingestMinutes) {
    this.inauguration = disembarkation;
    this.photo = tag;
    this.sandwichesThing = ingestMinutes;
  }

  static String name = "pZ12EVNFheP697yF";
  public String photo = null;
  public int completingNow = 0;

  static {
    ridings = new Semaphore(5);
    mall = new Semaphore(1);
  }

  public synchronized void run() {
    double bounds;
    bounds = 0.27985318487829947;

    try {

      if (ridings.availablePermits() == 1) {
        mall.acquire();
      }

      ridings.acquire();
      this.derriereDays = P3Mock.developer;
      this.completingNow = this.derriereDays + this.sandwichesThing;

      while (P3Mock.developer < this.completingNow) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.photo, this.inauguration, this.derriereDays, this.completingNow));
      ridings.release();

      if (ridings.availablePermits() == 5) {
        mall.release();
      }

    } catch (InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public int sandwichesThing = 0;
  public static Semaphore ridings = null;
}
