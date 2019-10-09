import java.util.concurrent.Semaphore;

public class Receivable implements Runnable {
  private int visit;
  private String name;
  private int foodYears;
  private int pratAmount;
  private int coatingPeriod;
  public static Semaphore jobs = new Semaphore(5);
  public static Semaphore boughten = new Semaphore(1);

  public Receivable(int dawn, String handle, int sandwichesThing) {
    this.visit = dawn;
    this.name = handle;
    this.foodYears = sandwichesThing;
  }

  public void run() {

    try {

      if (jobs.availablePermits() == 1) {
        boughten.acquire();
      }

      jobs.acquire();
      this.pratAmount = GAvionics.programmable;
      this.coatingPeriod = this.pratAmount + this.foodYears;

      while (GAvionics.programmable < this.coatingPeriod) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.name, this.visit, this.pratAmount, this.coatingPeriod));
      jobs.release();

      if (jobs.availablePermits() == 5) {
        boughten.release();
      }

    } catch (InterruptedException tipp) {
      System.out.println(tipp.toString());
    }
  }

  public int developAppearance() {
    return visit;
  }
}
