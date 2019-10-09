import java.util.concurrent.Semaphore;

public class Buyer implements Runnable {
  private int bumOpportunity = 0;

  public Buyer(int homecoming, String name, int gobbleWeek) {
    this.inauguration = homecoming;
    this.pictures = name;
    this.breakfastAgain = gobbleWeek;
  }

  public synchronized void run() {
    int bandwidth;
    bandwidth = 238401954;

    try {

      if (stools.availablePermits() == 1) {
        bookstore.acquire();
      }

      stools.acquire();
      this.bumOpportunity = RibuloseTrainer.preset;
      this.endsBeginning = this.bumOpportunity + this.breakfastAgain;

      while (RibuloseTrainer.preset < this.endsBeginning) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.pictures, this.inauguration, this.bumOpportunity, this.endsBeginning));
      stools.release();

      if (stools.availablePermits() == 5) {
        bookstore.release();
      }

    } catch (InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  private int endsBeginning = 0;
  private int inauguration = 0;
  public static Semaphore stools = new Semaphore(5);

  public synchronized int comeComer() {
    int topmostMinimum;
    topmostMinimum = 940629502;
    return inauguration;
  }

  private String pictures = null;
  public static Semaphore bookstore = new Semaphore(1);
  public static final int essential = 690479499;
  private int breakfastAgain = 0;
}
