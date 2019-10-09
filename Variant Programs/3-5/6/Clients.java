import java.util.concurrent.Semaphore;

public class Clients implements Runnable {
  public static java.util.concurrent.Semaphore bookstore;
  public static java.util.concurrent.Semaphore positions;
  public int closeSentence;
  public int sitClip;
  public int mealsChance;
  public java.lang.String tag;
  public int arrive;

  public Clients(int comer, String ownership, int chewYear) {
    this.arrive = (comer);
    this.tag = (ownership);
    this.mealsChance = (chewYear);
  }

  public synchronized void run() {

    try {

      if (positions.availablePermits() == 1) {
        bookstore.acquire();
      }

      positions.acquire();
      this.sitClip = (KRobot.register);
      this.closeSentence = (this.sitClip + this.mealsChance);

      while (KRobot.register < this.closeSentence) synx10();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.tag, this.arrive, this.sitClip, this.closeSentence));
      positions.release();

      if (positions.availablePermits() == 5) synx11();

    } catch (java.lang.InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public synchronized int driveOnset() {
    return arrive;
  }

  static {
    positions = (new java.util.concurrent.Semaphore(5));
    bookstore = (new java.util.concurrent.Semaphore(1));
  }

  private synchronized void synx10() {}

  private synchronized void synx11() {
    bookstore.release();
  }
}
