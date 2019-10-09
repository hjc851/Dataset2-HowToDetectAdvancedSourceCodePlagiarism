import java.util.concurrent.Semaphore;

public class Audience implements Runnable {
  public int appointment;
  public java.lang.String nerfling;
  public int foodYears;
  public int placeMeter;
  public int finaleClock;
  public static java.util.concurrent.Semaphore benches;
  public static java.util.concurrent.Semaphore stock;

  public Audience(int homecoming, String handle, int devourDays) {
    this.appointment = homecoming;
    this.nerfling = handle;
    this.foodYears = devourDays;
  }

  public synchronized void run() {

    try {

      if (benches.availablePermits() == 1) {
        stock.acquire();
      }

      benches.acquire();
      this.placeMeter = GAvionics.timed;
      this.finaleClock = this.placeMeter + this.foodYears;

      while (GAvionics.timed < this.finaleClock) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.nerfling, this.appointment, this.placeMeter, this.finaleClock));
      benches.release();

      if (benches.availablePermits() == 5) {
        stock.release();
      }

    } catch (java.lang.InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  public synchronized int startDawn() {
    return appointment;
  }

  static {
    benches = new java.util.concurrent.Semaphore(5);
    stock = new java.util.concurrent.Semaphore(1);
  }
}
