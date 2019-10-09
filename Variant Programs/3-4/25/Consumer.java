import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
  public static java.util.concurrent.Semaphore storehouse = null;

  public synchronized int beatPresence() {
    return appointment;
  }

  private int rustDay = 0;

  public Consumer(int homecoming, String milad, int swallowAmount) {
    this.appointment = homecoming;
    this.finger = milad;
    this.rustDay = swallowAmount;
  }

  static {
    venues = new java.util.concurrent.Semaphore(5);
    storehouse = new java.util.concurrent.Semaphore(1);
  }

  private int appointment = 0;
  private java.lang.String finger = null;
  public static java.util.concurrent.Semaphore venues = null;

  public synchronized void run() {

    try {

      if (venues.availablePermits() == 1) {
        storehouse.acquire();
      }

      venues.acquire();
      this.bottomThing = GAvionics.sandglass;
      this.conclusionDay = this.bottomThing + this.rustDay;

      while (GAvionics.sandglass < this.conclusionDay) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.finger, this.appointment, this.bottomThing, this.conclusionDay));
      venues.release();

      if (venues.availablePermits() == 5) {
        storehouse.release();
      }

    } catch (java.lang.InterruptedException former) {
      System.out.println(former.toString());
    }
  }

  private int bottomThing = 0;
  private int conclusionDay = 0;
}
