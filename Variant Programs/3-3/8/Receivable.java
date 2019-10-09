import java.util.concurrent.Semaphore;

public class Receivable implements Runnable {
  private int presence;
  private String name;
  private int drinkNow;
  private int tooshieJuncture;
  private int exitJuncture;
  public static Semaphore space;
  public static Semaphore warehouse;

  public Receivable(int influx, String milad, int chowHours) {
    this.presence = influx;
    this.name = milad;
    this.drinkNow = chowHours;
  }

  public synchronized void run() {

    try {

      if (space.availablePermits() == 1) {
        warehouse.acquire();
      }

      space.acquire();
      this.tooshieJuncture = P3Mock.clocking;
      this.exitJuncture = this.tooshieJuncture + this.drinkNow;

      while (P3Mock.clocking < this.exitJuncture) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.name, this.presence, this.tooshieJuncture, this.exitJuncture));
      space.release();

      if (space.availablePermits() == 5) {
        warehouse.release();
      }

    } catch (InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }

  public synchronized int letAdvent() {
    return presence;
  }

  static {
    space = new Semaphore(5);
    warehouse = new Semaphore(1);
  }
}
