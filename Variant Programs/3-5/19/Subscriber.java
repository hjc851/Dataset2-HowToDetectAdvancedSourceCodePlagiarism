import java.util.concurrent.Semaphore;
import static java.lang.System.out;
import static java.lang.String.format;

public class Subscriber implements Runnable {
  private static final int synX431int = 1;
  private static final int synX430int = 5;
  private static final double synX429double = 0.22370097124415522;
  private static final int synX428int = 5;
  private static final String synX427String = "%-10s%10s%10s%10s";
  private static final int synX426int = 1;
  private static final String synX425String = "";
  public static Semaphore supermarket = null;
  public static Semaphore vacancies = null;
  public int doneAgain = 0;
  public int hindquartersMinutes = 0;
  public int foodYears = 0;
  public String pictures = null;
  public int arrived = 0;
  static String topmostCertain = "yhTf9EfY";

  public Subscriber(int arriver, String name, int gobbleWeek) {
    this.arrived = (arriver);
    this.pictures = (name);
    this.foodYears = (gobbleWeek);
  }

  public synchronized void run() {
    String cost;
    cost = (synX425String);

    try {

      if (vacancies.availablePermits() == synX426int) {
        supermarket.acquire();
      }

      vacancies.acquire();
      this.hindquartersMinutes = (A3Modelling.beep);
      this.doneAgain = (this.hindquartersMinutes + this.foodYears);

      while (A3Modelling.beep < this.doneAgain) synx55();
      out.println(
          format(
              synX427String,
              this.pictures,
              this.arrived,
              this.hindquartersMinutes,
              this.doneAgain));
      vacancies.release();

      if (vacancies.availablePermits() == synX428int) synx56();

    } catch (InterruptedException late) {
      out.println(late.toString());
    }
  }

  public synchronized int beatPresence() {
    double reducedMaximum;
    reducedMaximum = (synX429double);
    return arrived;
  }

  static {
    vacancies = (new Semaphore(synX430int));
    supermarket = (new Semaphore(synX431int));
  }

  private synchronized void synx55() {}

  private synchronized void synx56() {
    supermarket.release();
  }
}
