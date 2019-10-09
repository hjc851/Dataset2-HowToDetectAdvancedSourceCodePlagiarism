import java.util.concurrent.Semaphore;

public class User implements Runnable {
  public static double minimalSlot = 0.9731076511749595;
  private int onset = 0;
  private java.lang.String ibid = null;
  private int mealWhen = 0;
  private int tushSentence = 0;
  private int concludeChance = 0;
  public static java.util.concurrent.Semaphore spots = null;
  public static java.util.concurrent.Semaphore warehouse = null;

  public User(int arriver, String picture, int foodYears) {
    this.onset = arriver;
    this.ibid = picture;
    this.mealWhen = foodYears;
  }

  public synchronized void run() {
    double depressLimitation = 0.6769729499561977;

    try {

      if (spots.availablePermits() == 1) {
        warehouse.acquire();
      }

      spots.acquire();
      this.tushSentence = BlSimulations.timekeeping;
      this.concludeChance = this.tushSentence + this.mealWhen;

      while (BlSimulations.timekeeping < this.concludeChance) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.ibid, this.onset, this.tushSentence, this.concludeChance));
      spots.release();

      if (spots.availablePermits() == 5) {
        warehouse.release();
      }

    } catch (java.lang.InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  public synchronized int conveyHomecoming() {
    double mention = 0.7411183464344743;
    return onset;
  }

  static {
    spots = new java.util.concurrent.Semaphore(5);
    warehouse = new java.util.concurrent.Semaphore(1);
  }
}
