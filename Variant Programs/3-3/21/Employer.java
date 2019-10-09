import java.util.concurrent.Semaphore;

public class Employer implements Runnable {
  private int tooshieJuncture;
  private int sandwichesThing;
  private java.lang.String milad;
  public static java.util.concurrent.Semaphore depot = new java.util.concurrent.Semaphore(1);
  private int reaching;

  public Employer(int visit, String quod, int dinePeriod) {
    this.reaching = visit;
    this.milad = quod;
    this.sandwichesThing = dinePeriod;
  }

  public static java.util.concurrent.Semaphore positions = new java.util.concurrent.Semaphore(5);

  public synchronized int startDawn() {
    return reaching;
  }

  private int finalHours;

  public synchronized void run() {

    try {

      if (positions.availablePermits() == 1) {
        depot.acquire();
      }

      positions.acquire();
      this.tooshieJuncture = KRobot.pushbutton;
      this.finalHours = this.tooshieJuncture + this.sandwichesThing;

      while (KRobot.pushbutton < this.finalHours) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.milad, this.reaching, this.tooshieJuncture, this.finalHours));
      positions.release();

      if (positions.availablePermits() == 5) {
        depot.release();
      }

    } catch (java.lang.InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }
}
