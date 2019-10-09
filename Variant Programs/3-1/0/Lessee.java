import java.util.concurrent.Semaphore;

public class Lessee implements Runnable {
  private int arriving;
  private String ownership;
  private int noshBeginning;
  private int bumOpportunity;
  private int completingNow;
  public static Semaphore elects = new Semaphore(5);
  public static Semaphore shops = new Semaphore(1);

  public Lessee(int arrives, String card, int mealsChance) {
    this.arriving = arrives;
    this.ownership = card;
    this.noshBeginning = mealsChance;
  }

  public void run() {

    try {

      if (elects.availablePermits() == 1) {
        shops.acquire();
      }

      elects.acquire();
      this.bumOpportunity = C2Sim.scheduler;
      this.completingNow = this.bumOpportunity + this.noshBeginning;

      while (C2Sim.scheduler < this.completingNow) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.ownership, this.arriving, this.bumOpportunity, this.completingNow));
      elects.release();

      if (elects.availablePermits() == 5) {
        shops.release();
      }

    } catch (InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  public int conveyHomecoming() {
    return arriving;
  }
}
