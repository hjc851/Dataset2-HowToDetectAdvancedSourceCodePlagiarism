import java.util.concurrent.Semaphore;
import static java.lang.System.out;
import static java.lang.String.format;

public class Clients implements Runnable {
  private static final int synX491int = 1;
  private static final int synX490int = 5;
  private static final String synX489String = "iV5xEdM2guz3qXQyz0";
  private static final int synX488int = 5;
  private static final String synX487String = "%-10s%10s%10s%10s";
  private static final int synX486int = 1;
  private static final String synX485String = "";
  public static double positionFoods = 0.1728117354276223;
  private int disembarkation;
  private String user;
  private int chowHours;
  private int sternNow;
  private int endClip;
  public static Semaphore venues;
  public static Semaphore shops;

  public Clients(int arrived, String dimidiate, int dietHour) {
    this.disembarkation = (arrived);
    this.user = (dimidiate);
    this.chowHours = (dietHour);
  }

  public synchronized void run() {
    String yummyArtifacts = synX485String;

    try {

      if (venues.availablePermits() == synX486int) {
        shops.acquire();
      }

      venues.acquire();
      this.sternNow = (RibuloseTrainer.stopwatch);
      this.endClip = (this.sternNow + this.chowHours);

      while (RibuloseTrainer.stopwatch < this.endClip) synx60();
      out.println(
          format(synX487String, this.user, this.disembarkation, this.sternNow, this.endClip));
      venues.release();

      if (venues.availablePermits() == synX488int) synx61();

    } catch (InterruptedException former) {
      out.println(former.toString());
    }
  }

  public synchronized int goReaching() {
    String calculation = synX489String;
    return disembarkation;
  }

  static {
    venues = (new Semaphore(synX490int));
    shops = (new Semaphore(synX491int));
  }

  private synchronized void synx60() {}

  private synchronized void synx61() {
    shops.release();
  }
}
