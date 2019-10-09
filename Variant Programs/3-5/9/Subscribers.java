import java.util.concurrent.Semaphore;

public class Subscribers implements Runnable {
  public static java.util.concurrent.Semaphore shops;
  public static java.util.concurrent.Semaphore members;
  private int breakOpportunity;
  private int behindWhen;
  private int sandwichesThing;
  private java.lang.String est;
  private int homecoming;
  public static final String less = "jPTS1bnG";

  public Subscribers(int reaching, String identifying, int exhaustMoment) {
    this.homecoming = (reaching);
    this.est = (identifying);
    this.sandwichesThing = (exhaustMoment);
  }

  public synchronized void run() {
    int ceilingSlot;
    ceilingSlot = (399506754);

    try {

      if (members.availablePermits() == 1) {
        shops.acquire();
      }

      members.acquire();
      this.behindWhen = (A2Analog.distribution);
      this.breakOpportunity = (this.behindWhen + this.sandwichesThing);

      while (A2Analog.distribution < this.breakOpportunity) synx25();
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.est, this.homecoming, this.behindWhen, this.breakOpportunity));
      members.release();

      if (members.availablePermits() == 5) synx26();

    } catch (java.lang.InterruptedException abbe) {
      System.out.println(abbe.toString());
    }
  }

  public synchronized int drawDisembarkation() {
    double modicum;
    modicum = (0.6011578337745849);
    return homecoming;
  }

  static {
    members = (new java.util.concurrent.Semaphore(5));
    shops = (new java.util.concurrent.Semaphore(1));
  }

  private synchronized void synx25() {}

  private synchronized void synx26() {
    shops.release();
  }
}
