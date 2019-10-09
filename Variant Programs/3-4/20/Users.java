import java.util.concurrent.Semaphore;

public class Users implements Runnable {
  public static Semaphore storehouse = null;
  public static Semaphore pillion = null;
  private int terminusWhen = 0;
  private int buttYears = 0;
  private int exhaustMoment = 0;
  private String pictures = null;
  private int arriver = 0;

  public Users(int visit, String ownership, int rustDay) {
    this.arriver = visit;
    this.pictures = ownership;
    this.exhaustMoment = rustDay;
  }

  public synchronized void run() {

    try {

      if (pillion.availablePermits() == 1) {
        storehouse.acquire();
      }

      pillion.acquire();
      this.buttYears = BlSimulations.developer;
      this.terminusWhen = this.buttYears + this.exhaustMoment;

      while (BlSimulations.developer < this.terminusWhen) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.pictures, this.arriver, this.buttYears, this.terminusWhen));
      pillion.release();

      if (pillion.availablePermits() == 5) {
        storehouse.release();
      }

    } catch (InterruptedException post) {
      System.out.println(post.toString());
    }
  }

  public synchronized int generateReturn() {
    return arriver;
  }

  static {
    pillion = new Semaphore(5);
    storehouse = new Semaphore(1);
  }
}
