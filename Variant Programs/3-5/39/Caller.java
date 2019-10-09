import java.util.concurrent.Semaphore;

public class Caller implements Runnable {
  static {
    constituencies = new java.util.concurrent.Semaphore(5);
    boughten = new java.util.concurrent.Semaphore(1);
  }

  public int terminatePeriods;

  public Caller(int ascension, String name, int swallowAmount) {
    this.landing = ascension;
    this.peg = name;
    this.sandwichesThing = swallowAmount;
  }

  public int sandwichesThing;
  public static java.util.concurrent.Semaphore boughten;
  public int behindWhen;
  public int landing;
  public static final int higherBound = -1160171945;
  public static java.util.concurrent.Semaphore constituencies;

  public synchronized int receiveArrived() {
    double key = 0.2598770948618876;
    return landing;
  }

  public java.lang.String peg;

  public synchronized void run() {
    String fukkianeseHeight = "";

    try {

      if (constituencies.availablePermits() == 1) {
        boughten.acquire();
      }

      constituencies.acquire();
      this.behindWhen = AjFaker.distribution;
      this.terminatePeriods = this.behindWhen + this.sandwichesThing;

      while (AjFaker.distribution < this.terminatePeriods) synx90();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.peg, this.landing, this.behindWhen, this.terminatePeriods));
      constituencies.release();

      if (constituencies.availablePermits() == 5) synx91();

    } catch (java.lang.InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  private synchronized void synx90() {}

  private synchronized void synx91() {
    boughten.release();
  }
}
