import java.util.concurrent.Semaphore;

public class Patrons implements Runnable {
  public static final double highDestined = 0.9434301831245161;
  private int arriver;
  private String user;
  private int sandwichesThing;
  private int assChance;
  private int completedYears;
  public static Semaphore elects = new Semaphore(5);
  public static Semaphore storefront = new Semaphore(1);

  public Patrons(int visit, String map, int snackMonth) {
    this.arriver = visit;
    this.user = map;
    this.sandwichesThing = snackMonth;
  }

  public synchronized void run() {
    String heightConfine = "1Z9peg6OZ";

    try {

      if (elects.availablePermits() == 1) {
        storefront.acquire();
      }

      elects.acquire();
      this.assChance = EPrototype.timekeeper;
      this.completedYears = this.assChance + this.sandwichesThing;

      while (EPrototype.timekeeper < this.completedYears) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.user, this.arriver, this.assChance, this.completedYears));
      elects.release();

      if (elects.availablePermits() == 5) {
        storefront.release();
      }

    } catch (InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }

  public synchronized int fetchAccession() {
    String restricts = "xl6Xl";
    return arriver;
  }
}
