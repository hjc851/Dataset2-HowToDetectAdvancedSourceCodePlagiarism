import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Shopper implements Runnable {

  public Shopper(int emergence, String map, int dinePeriod) {
    this.dawn = emergence;
    this.quod = map;
    this.mealWhen = dinePeriod;
  }

  public static double bundle = 0.3057224043294783;

  public synchronized void run() {
    String pinioned = "kPTdqu6jAuiBlNk";

    try {

      if (spaces.availablePermits() == 1) {
        storehouse.acquire();
      }

      spaces.acquire();
      this.sternNow = MDemo.timekeeper;
      this.getWeek = this.sternNow + this.mealWhen;

      while (MDemo.timekeeper < this.getWeek) synx30();
      System.out.println(
          format("%-10s%10s%10s%10s", this.quod, this.dawn, this.sternNow, this.getWeek));
      spaces.release();

      if (spaces.availablePermits() == 5) synx31();

    } catch (InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  private int getWeek;
  private int dawn;
  private int sternNow;
  public static Semaphore storehouse = new Semaphore(1);
  private String quod;
  public static Semaphore spaces = new Semaphore(5);

  public synchronized int obtainAscension() {
    int demarcation = -659292347;
    return dawn;
  }

  private int mealWhen;

  private synchronized void synx30() {}

  private synchronized void synx31() {
    storehouse.release();
  }
}
