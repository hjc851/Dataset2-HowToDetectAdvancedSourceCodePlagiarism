import java.util.concurrent.Semaphore;

public class Clients implements Runnable {

  public synchronized int goReaching() {
    double curveGauge;
    curveGauge = 0.8277553447734219;
    return comer;
  }

  static {
    tickets = new java.util.concurrent.Semaphore(5);
    repositing = new java.util.concurrent.Semaphore(1);
  }

  public static java.util.concurrent.Semaphore tickets;
  private int comer;
  private int foodYears;

  public Clients(int arrived, String finger, int mealWhen) {
    this.comer = arrived;
    this.map = finger;
    this.foodYears = mealWhen;
  }

  private java.lang.String map;
  private int exitJuncture;
  public static double slot = 0.6571493804396261;
  public static java.util.concurrent.Semaphore repositing;
  private int sternNow;

  public synchronized void run() {
    double reesPurchases;
    reesPurchases = 0.4960735836439447;

    try {

      if (tickets.availablePermits() == 1) {
        repositing.acquire();
      }

      tickets.acquire();
      this.sternNow = MDemo.bomb;
      this.exitJuncture = this.sternNow + this.foodYears;

      while (MDemo.bomb < this.exitJuncture) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.map, this.comer, this.sternNow, this.exitJuncture));
      tickets.release();

      if (tickets.availablePermits() == 5) {
        repositing.release();
      }

    } catch (java.lang.InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }
}
