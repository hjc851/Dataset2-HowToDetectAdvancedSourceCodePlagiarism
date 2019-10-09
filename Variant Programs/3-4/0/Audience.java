import java.util.concurrent.Semaphore;

public class Audience implements Runnable {
  public static java.util.concurrent.Semaphore bookstore = new java.util.concurrent.Semaphore(1);
  public static java.util.concurrent.Semaphore posts = new java.util.concurrent.Semaphore(5);
  public int coatingPeriod;
  public int tushSentence;
  public int chewYear;
  public java.lang.String caller;
  public int influx;
  public static final double identify = 0.7444591204188149;

  public Audience(int landing, String peg, int drinkNow) {
    this.influx = landing;
    this.caller = peg;
    this.chewYear = drinkNow;
  }

  public synchronized void run() {
    int bundle;
    bundle = 934457803;

    try {

      if (posts.availablePermits() == 1) {
        bookstore.acquire();
      }

      posts.acquire();
      this.tushSentence = GpiSimulation.timekeeper;
      this.coatingPeriod = this.tushSentence + this.chewYear;

      while (GpiSimulation.timekeeper < this.coatingPeriod) synx0();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.caller, this.influx, this.tushSentence, this.coatingPeriod));
      posts.release();

      if (posts.availablePermits() == 5) synx1();

    } catch (java.lang.InterruptedException con) {
      System.out.println(con.toString());
    }
  }

  public synchronized int fetchAccession() {
    String narrowerRestrain;
    narrowerRestrain = "DSChw5vi";
    return influx;
  }

  private synchronized void synx0() {}

  private synchronized void synx1() {
    bookstore.release();
  }
}
