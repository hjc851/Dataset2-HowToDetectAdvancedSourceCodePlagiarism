import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
  public static Semaphore stow = new Semaphore(1);
  public static Semaphore passengers = new Semaphore(5);
  public int finisDays = 0;
  public int rearClock = 0;
  public int dietHour = 0;
  public String milad = null;
  public int introduction = 0;

  public Consumer(int arrives, String finger, int noshBeginning) {
    this.introduction = arrives;
    this.milad = finger;
    this.dietHour = noshBeginning;
  }

  public synchronized void run() {

    try {

      if (passengers.availablePermits() == 1) {
        stow.acquire();
      }

      passengers.acquire();
      this.rearClock = B2Impactor.timekeeper;
      this.finisDays = this.rearClock + this.dietHour;

      while (B2Impactor.timekeeper < this.finisDays) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.milad, this.introduction, this.rearClock, this.finisDays));
      passengers.release();

      if (passengers.availablePermits() == 5) {
        stow.release();
      }

    } catch (InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }

  public synchronized int letAdvent() {
    return introduction;
  }
}
