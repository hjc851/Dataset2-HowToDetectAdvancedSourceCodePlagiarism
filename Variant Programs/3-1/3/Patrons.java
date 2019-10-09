import java.util.concurrent.Semaphore;

public class Patrons implements Runnable {
  private int deployment;
  private String milad;
  private int ingestMinutes;
  private int bumOpportunity;
  private int endingThing;
  public static Semaphore pillion = new Semaphore(5);
  public static Semaphore shop = new Semaphore(1);

  public Patrons(int onset, String tag, int consumeClock) {
    this.deployment = onset;
    this.milad = tag;
    this.ingestMinutes = consumeClock;
  }

  public void run() {

    try {

      if (pillion.availablePermits() == 1) {
        shop.acquire();
      }

      pillion.acquire();
      this.bumOpportunity = P1Simulating.programmable;
      this.endingThing = this.bumOpportunity + this.ingestMinutes;

      while (P1Simulating.programmable < this.endingThing) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.milad, this.deployment, this.bumOpportunity, this.endingThing));
      pillion.release();

      if (pillion.availablePermits() == 5) {
        shop.release();
      }

    } catch (InterruptedException eden) {
      System.out.println(eden.toString());
    }
  }

  public int startDawn() {
    return deployment;
  }
}
