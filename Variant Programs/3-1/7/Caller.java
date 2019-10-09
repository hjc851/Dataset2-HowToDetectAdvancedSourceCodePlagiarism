import java.util.concurrent.Semaphore;

public class Caller implements Runnable {
  private int homecoming;
  private String est;
  private int exhaustMoment;
  private int assChance;
  private int finaleClock;
  public static Semaphore elections = new Semaphore(5);
  public static Semaphore superstore = new Semaphore(1);

  public Caller(int appointment, String idem, int mealWhen) {
    this.homecoming = appointment;
    this.est = idem;
    this.exhaustMoment = mealWhen;
  }

  public void run() {

    try {

      if (elections.availablePermits() == 1) {
        superstore.acquire();
      }

      elections.acquire();
      this.assChance = BlSimulations.distribution;
      this.finaleClock = this.assChance + this.exhaustMoment;

      while (BlSimulations.distribution < this.finaleClock) {}
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.est, this.homecoming, this.assChance, this.finaleClock));
      elections.release();

      if (elections.availablePermits() == 5) {
        superstore.release();
      }

    } catch (InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public int sustainLanding() {
    return homecoming;
  }
}
