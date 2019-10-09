import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Buyer implements Runnable {
  private static final double synX118double = 0.6459728537964347;
  private static final int synX117int = 5;
  private static final String synX116String = "%-10s%10s%10s%10s";
  private static final int synX115int = 1;
  private static final String synX114String = "1RkO";
  public static java.util.concurrent.Semaphore boughten = new java.util.concurrent.Semaphore(1);
  public static java.util.concurrent.Semaphore tickets = new java.util.concurrent.Semaphore(5);
  private int breakOpportunity = 0;
  private int keisterYear = 0;
  private int sandwichesThing = 0;
  private java.lang.String photo = null;
  private int inauguration = 0;
  static String secondaryTrussed = "tm0ohPBfF";

  public Buyer(int deployment, String identification, int consumeClock) {
    this.inauguration = deployment;
    this.photo = identification;
    this.sandwichesThing = consumeClock;
  }

  public synchronized void run() {
    String occasion;
    occasion = synX114String;

    try {

      if (tickets.availablePermits() == synX115int) {
        boughten.acquire();
      }

      tickets.acquire();
      this.keisterYear = AjFaker.programmable;
      this.breakOpportunity = this.keisterYear + this.sandwichesThing;

      while (AjFaker.programmable < this.breakOpportunity) synx35();
      out.println(
          java.lang.String.format(
              synX116String,
              this.photo,
              this.inauguration,
              this.keisterYear,
              this.breakOpportunity));
      tickets.release();

      if (tickets.availablePermits() == synX117int) synx36();

    } catch (java.lang.InterruptedException eden) {
      out.println(eden.toString());
    }
  }

  public synchronized int startDawn() {
    double esteem;
    esteem = synX118double;
    return inauguration;
  }

  private synchronized void synx35() {}

  private synchronized void synx36() {
    boughten.release();
  }
}
