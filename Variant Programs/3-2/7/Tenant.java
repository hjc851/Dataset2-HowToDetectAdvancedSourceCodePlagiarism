import java.util.concurrent.Semaphore;

public class Tenant implements Runnable {
  private int arrives;
  private String card;
  private int hungryOpportunity;
  private int assChance;
  private int endingThing;
  public static Semaphore jobs = new Semaphore(5);
  public static Semaphore drugstore = new Semaphore(1);

  public Tenant(int advent, String ibid, int sandwichesThing) {
    this.arrives = advent;
    this.card = ibid;
    this.hungryOpportunity = sandwichesThing;
  }

  public void run() {

    try {

      if (jobs.availablePermits() == 1) {
        drugstore.acquire();
      }

      jobs.acquire();
      this.assChance = GAvionics.preset;
      this.endingThing = this.assChance + this.hungryOpportunity;

      while (GAvionics.preset < this.endingThing) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.card, this.arrives, this.assChance, this.endingThing));
      jobs.release();

      if (jobs.availablePermits() == 5) {
        drugstore.release();
      }

    } catch (InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public int fixInauguration() {
    return arrives;
  }
}
