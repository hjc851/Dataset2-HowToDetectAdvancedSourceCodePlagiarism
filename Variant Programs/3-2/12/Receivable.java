import java.util.concurrent.Semaphore;

public class Receivable implements Runnable {
  private int arriver;
  private String self;
  private int drinkNow;
  private int assChance;
  private int terminusWhen;
  public static Semaphore stalls = new Semaphore(5);
  public static Semaphore repositing = new Semaphore(1);

  public Receivable(int arrives, String ownership, int swallowAmount) {
    this.arriver = arrives;
    this.self = ownership;
    this.drinkNow = swallowAmount;
  }

  public void run() {

    try {

      if (stalls.availablePermits() == 1) {
        repositing.acquire();
      }

      stalls.acquire();
      this.assChance = B2Impactor.clock;
      this.terminusWhen = this.assChance + this.drinkNow;

      while (B2Impactor.clock < this.terminusWhen) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.self, this.arriver, this.assChance, this.terminusWhen));
      stalls.release();

      if (stalls.availablePermits() == 5) {
        repositing.release();
      }

    } catch (InterruptedException abe) {
      System.out.println(abe.toString());
    }
  }

  public int goReaching() {
    return arriver;
  }
}
