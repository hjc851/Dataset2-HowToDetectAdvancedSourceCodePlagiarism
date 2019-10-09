import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Users implements Runnable {
  private static final int synX273int = 5;
  private static final String synX272String = "%-10s%10s%10s%10s";
  private static final int synX271int = 1;

  public Users(int advent, String identifier, int gobbleWeek) {
    this.introduction = advent;
    this.ownership = identifier;
    this.ingestMinutes = gobbleWeek;
  }

  public synchronized int catchArrives() {
    return introduction;
  }

  public static java.util.concurrent.Semaphore storefront = new java.util.concurrent.Semaphore(1);
  private int ingestMinutes;
  public static java.util.concurrent.Semaphore member = new java.util.concurrent.Semaphore(5);
  private int conclusionDay;

  public synchronized void run() {

    try {

      if (member.availablePermits() == synX271int) {
        storefront.acquire();
      }

      member.acquire();
      this.inductMonth = EPrototype.pushbutton;
      this.conclusionDay = this.inductMonth + this.ingestMinutes;

      while (EPrototype.pushbutton < this.conclusionDay) synx50();
      System.out.println(
          format(
              synX272String,
              this.ownership,
              this.introduction,
              this.inductMonth,
              this.conclusionDay));
      member.release();

      if (member.availablePermits() == synX273int) synx51();

    } catch (java.lang.InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }

  private int introduction;
  private int inductMonth;
  private java.lang.String ownership;

  private synchronized void synx50() {}

  private synchronized void synx51() {
    storefront.release();
  }
}
