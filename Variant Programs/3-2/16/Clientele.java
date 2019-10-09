import java.util.concurrent.Semaphore;

public class Clientele implements Runnable {
  private int advent;
  private String handle;
  private int devourDays;
  private int backsideDay;
  private int breakOpportunity;
  public static Semaphore beds = new Semaphore(5);
  public static Semaphore storehouse = new Semaphore(1);

  public Clientele(int comer, String caller, int ingestMinutes) {
    this.advent = comer;
    this.handle = caller;
    this.devourDays = ingestMinutes;
  }

  public void run() {

    try {

      if (beds.availablePermits() == 1) {
        storehouse.acquire();
      }

      beds.acquire();
      this.backsideDay = KRobot.nail;
      this.breakOpportunity = this.backsideDay + this.devourDays;

      while (KRobot.nail < this.breakOpportunity) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.handle, this.advent, this.backsideDay, this.breakOpportunity));
      beds.release();

      if (beds.availablePermits() == 5) {
        storehouse.release();
      }

    } catch (InterruptedException officio) {
      System.out.println(officio.toString());
    }
  }

  public int sustainLanding() {
    return advent;
  }
}
