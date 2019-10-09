import java.util.concurrent.Semaphore;
import static java.lang.String.format;

public class Shopper implements Runnable {
  static String tabulation = "";
  private int dawn;
  private java.lang.String self;
  private int gobbleWeek;
  private int placeMeter;
  private int conclusionDay;
  public static java.util.concurrent.Semaphore posts = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore storage = new java.util.concurrent.Semaphore(1);

  public Shopper(int advent, String identification, int chowHours) {
    this.dawn = (advent);
    this.self = (identification);
    this.gobbleWeek = (chowHours);
  }

  public synchronized void run() {
    double respect = 0.28564181466428706;

    try {

      if (posts.availablePermits() == 1) {
        storage.acquire();
      }

      posts.acquire();
      this.placeMeter = (RibuloseTrainer.bomb);
      this.conclusionDay = (this.placeMeter + this.gobbleWeek);

      while (RibuloseTrainer.bomb < this.conclusionDay) {}
      System.out.println(
          format("%-10s%10s%10s%10s", this.self, this.dawn, this.placeMeter, this.conclusionDay));
      posts.release();

      if (posts.availablePermits() == 5) {
        storage.release();
      }

    } catch (java.lang.InterruptedException voto) {
      System.out.println(voto.toString());
    }
  }

  public synchronized int beatPresence() {
    double samuelParts = 0.5053563416219522;
    return dawn;
  }
}
