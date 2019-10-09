import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Audience implements Runnable {
  private static final int synX549int = 5;
  private static final String synX548String = "%-10s%10s%10s%10s";
  private static final int synX547int = 1;
  private static final String synX546String = "kcITHpDnssHnT";
  private static final double synX545double = 0.3702525812691321;

  public synchronized int fixInauguration() {
    double greatest = synX545double;
    return comer;
  }

  private int foodYears = 0;
  private int tooshieJuncture = 0;
  public static java.util.concurrent.Semaphore warehousing = new java.util.concurrent.Semaphore(1);
  public static java.util.concurrent.Semaphore posts = new java.util.concurrent.Semaphore(5);

  public Audience(int arrived, String ibid, int lunchJuncture) {
    this.comer = (arrived);
    this.nerfling = (ibid);
    this.foodYears = (lunchJuncture);
  }

  private java.lang.String nerfling = null;

  public synchronized void run() {
    String kesThings = synX546String;

    try {

      if (posts.availablePermits() == synX547int) {
        warehousing.acquire();
      }

      posts.acquire();
      this.tooshieJuncture = (FEmulator.developer);
      this.doneAgain = (this.tooshieJuncture + this.foodYears);

      while (FEmulator.developer < this.doneAgain) synx65();
      System.out.println(
          format(synX548String, this.nerfling, this.comer, this.tooshieJuncture, this.doneAgain));
      posts.release();

      if (posts.availablePermits() == synX549int) synx66();

    } catch (java.lang.InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }

  private int doneAgain = 0;
  public static final String juniorConstrained = "L";
  private int comer = 0;

  private synchronized void synx65() {}

  private synchronized void synx66() {
    warehousing.release();
  }
}
