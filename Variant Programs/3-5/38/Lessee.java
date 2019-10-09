import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Lessee implements Runnable {
  private int reaching = 0;
  private int bunsHour = 0;
  private int breakfastAgain = 0;

  public Lessee(int arrives, String name, int exhaustMoment) {
    this.reaching = (arrives);
    this.nerfling = (name);
    this.breakfastAgain = (exhaustMoment);
  }

  private int wrapMonth = 0;

  public synchronized int makeArrive() {
    double nominate;
    nominate = (0.8705771743182648);
    return reaching;
  }

  public static final String chained = "fDUANF3eZHl";
  public static Semaphore beds = new Semaphore(5);
  public static Semaphore grocery = new Semaphore(1);

  public synchronized void run() {
    double vital;
    vital = (0.4283918344264914);

    try {

      if (beds.availablePermits() == 1) {
        grocery.acquire();
      }

      beds.acquire();
      this.bunsHour = (C2Sim.counting);
      this.wrapMonth = (this.bunsHour + this.breakfastAgain);

      while (C2Sim.counting < this.wrapMonth) {}
      System.out.println(
          format("%-10s%10s%10s%10s", this.nerfling, this.reaching, this.bunsHour, this.wrapMonth));
      beds.release();

      if (beds.availablePermits() == 5) {
        grocery.release();
      }

    } catch (InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }

  private String nerfling = null;
}
