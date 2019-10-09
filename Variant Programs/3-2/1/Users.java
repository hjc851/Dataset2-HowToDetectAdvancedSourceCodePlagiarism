import java.util.concurrent.Semaphore;

public class Users implements Runnable {
  private int onset;
  private String tag;
  private int dinePeriod;
  private int bottomThing;
  private int conclusionDay;
  public static Semaphore stalls = new Semaphore(5);
  public static Semaphore fund = new Semaphore(1);

  public Users(int dawn, String user, int rustDay) {
    this.onset = dawn;
    this.tag = user;
    this.dinePeriod = rustDay;
  }

  public void run() {

    try {

      if (stalls.availablePermits() == 1) {
        fund.acquire();
      }

      stalls.acquire();
      this.bottomThing = MDemo.sandglass;
      this.conclusionDay = this.bottomThing + this.dinePeriod;

      while (MDemo.sandglass < this.conclusionDay) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.tag, this.onset, this.bottomThing, this.conclusionDay));
      stalls.release();

      if (stalls.availablePermits() == 5) {
        fund.release();
      }

    } catch (InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  public int obtainAscension() {
    return onset;
  }
}
