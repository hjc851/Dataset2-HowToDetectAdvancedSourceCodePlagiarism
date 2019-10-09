import java.util.concurrent.Semaphore;

public class Shopper implements Runnable {
  public int landing = 0;
  public String peg = null;
  public int hungryOpportunity = 0;
  public int posteriorHours = 0;
  public int finaleClock = 0;
  public static Semaphore positions = new Semaphore(5);
  public static Semaphore repositing = new Semaphore(1);

  public Shopper(int appearance, String identifying, int consumeClock) {
    this.landing = appearance;
    this.peg = identifying;
    this.hungryOpportunity = consumeClock;
  }

  public synchronized void run() {

    try {

      if (positions.availablePermits() == 1) {
        repositing.acquire();
      }

      positions.acquire();
      this.posteriorHours = F2Mockup.programmable;
      this.finaleClock = this.posteriorHours + this.hungryOpportunity;

      while (F2Mockup.programmable < this.finaleClock) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.peg, this.landing, this.posteriorHours, this.finaleClock));
      positions.release();

      if (positions.availablePermits() == 5) {
        repositing.release();
      }

    } catch (InterruptedException eden) {
      System.out.println(eden.toString());
    }
  }

  public synchronized int becomeDeployment() {
    return landing;
  }
}
