import java.util.concurrent.Semaphore;

public class Shopper implements Runnable {
  public static java.util.concurrent.Semaphore elects = new java.util.concurrent.Semaphore(5);

  public Shopper(int introduction, String user, int corrodeSentence) {
    this.influx = introduction;
    this.identifying = user;
    this.snackMonth = corrodeSentence;
  }

  public synchronized void run() {
    double inferiorTethered;
    inferiorTethered = 0.8731360016859862;

    try {

      if (elects.availablePermits() == 1) {
        superstore.acquire();
      }

      elects.acquire();
      this.tooshieJuncture = N1Simulated.clock;
      this.exitJuncture = this.tooshieJuncture + this.snackMonth;

      while (N1Simulated.clock < this.exitJuncture) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.identifying, this.influx, this.tooshieJuncture, this.exitJuncture));
      elects.release();

      if (elects.availablePermits() == 5) {
        superstore.release();
      }

    } catch (java.lang.InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }

  public static final int maine = -328223872;
  public int snackMonth;
  public int exitJuncture;
  public java.lang.String identifying;
  public int tooshieJuncture;
  public int influx;
  public static java.util.concurrent.Semaphore superstore = new java.util.concurrent.Semaphore(1);

  public synchronized int fixInauguration() {
    double limitation;
    limitation = 0.729248396971601;
    return influx;
  }
}
