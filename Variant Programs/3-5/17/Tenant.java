import java.util.concurrent.Semaphore;
import static java.lang.System.out;
import static java.lang.String.format;

public class Tenant implements Runnable {
  private static final int synX319int = -1305388440;
  private static final int synX318int = 5;
  private static final String synX317String = "%-10s%10s%10s%10s";
  private static final int synX316int = 1;
  private static final double synX315double = 0.1546894762865979;
  public static java.util.concurrent.Semaphore mall = new java.util.concurrent.Semaphore(1);
  public static java.util.concurrent.Semaphore slots = new java.util.concurrent.Semaphore(5);
  private int ceaseYear = 0;
  private int hindquartersMinutes = 0;
  private int foodYears = 0;
  private java.lang.String quod = null;
  private int influx = 0;
  static final String across = "";

  public Tenant(int homecoming, String identifier, int dinePeriod) {
    this.influx = (homecoming);
    this.quod = (identifier);
    this.foodYears = (dinePeriod);
  }

  public synchronized void run() {
    double generProducts;
    generProducts = (synX315double);

    try {

      if (slots.availablePermits() == synX316int) {
        mall.acquire();
      }

      slots.acquire();
      this.hindquartersMinutes = (BlSimulations.developer);
      this.ceaseYear = (this.hindquartersMinutes + this.foodYears);

      while (BlSimulations.developer < this.ceaseYear) {}
      out.println(
          format(synX317String, this.quod, this.influx, this.hindquartersMinutes, this.ceaseYear));
      slots.release();

      if (slots.availablePermits() == synX318int) {
        mall.release();
      }

    } catch (java.lang.InterruptedException post) {
      out.println(post.toString());
    }
  }

  public synchronized int conveyHomecoming() {
    int secondLeap;
    secondLeap = (synX319int);
    return influx;
  }
}
