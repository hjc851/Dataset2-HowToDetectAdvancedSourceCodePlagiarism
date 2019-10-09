import java.util.concurrent.Semaphore;

public class Licensee implements Runnable {
  private int accomplishMinutes = 0;

  public synchronized int comeComer() {
    return comer;
  }

  public synchronized void run() {

    try {

      if (mats.availablePermits() == 1) {
        garner.acquire();
      }

      mats.acquire();
      this.investAgain = NKinematics.distribution;
      this.accomplishMinutes = this.investAgain + this.dietHour;

      while (NKinematics.distribution < this.accomplishMinutes) synx40();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.pictures, this.comer, this.investAgain, this.accomplishMinutes));
      mats.release();

      if (mats.availablePermits() == 5) synx41();

    } catch (InterruptedException abbe) {
      System.out.println(abbe.toString());
    }
  }

  private String pictures = null;
  public static Semaphore garner = new Semaphore(1);
  public static Semaphore mats = new Semaphore(5);
  private int investAgain = 0;

  public Licensee(int visit, String name, int lunchJuncture) {
    this.comer = visit;
    this.pictures = name;
    this.dietHour = lunchJuncture;
  }

  private int dietHour = 0;
  private int comer = 0;

  private synchronized void synx40() {}

  private synchronized void synx41() {
    garner.release();
  }
}
