import java.util.concurrent.Semaphore;

public class Passenger implements Runnable {
  public int exhaustMoment = 0;

  static {
    beds = new Semaphore(5);
    drugstore = new Semaphore(1);
  }

  public String milad = null;
  public static Semaphore drugstore = null;

  public Passenger(int arriver, String map, int drinkNow) {
    this.comer = arriver;
    this.milad = map;
    this.exhaustMoment = drinkNow;
  }

  public static Semaphore beds = null;
  public int comer = 0;
  public int finalHours = 0;

  public synchronized int beatPresence() {
    return comer;
  }

  public synchronized void run() {

    try {

      if (beds.availablePermits() == 1) {
        drugstore.acquire();
      }

      beds.acquire();
      this.sitClip = FEmulator.ignition;
      this.finalHours = this.sitClip + this.exhaustMoment;

      while (FEmulator.ignition < this.finalHours) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.milad, this.comer, this.sitClip, this.finalHours));
      beds.release();

      if (beds.availablePermits() == 5) {
        drugstore.release();
      }

    } catch (InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  public int sitClip = 0;
}
