import java.util.concurrent.Semaphore;

public class Client implements Runnable {
  private int influx = 0;
  private String caller = null;
  private int rustDay = 0;
  private int buttYears = 0;
  private int concludeChance = 0;
  public static Semaphore chairs = null;
  public static Semaphore superstore = null;

  public Client(int arrived, String finger, int noshBeginning) {
    this.influx = arrived;
    this.caller = finger;
    this.rustDay = noshBeginning;
  }

  public synchronized void run() {

    try {

      if (chairs.availablePermits() == 1) {
        superstore.acquire();
      }

      chairs.acquire();
      this.buttYears = ABrake.clock;
      this.concludeChance = this.buttYears + this.rustDay;

      while (ABrake.clock < this.concludeChance) synx20();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s", this.caller, this.influx, this.buttYears, this.concludeChance));
      chairs.release();

      if (chairs.availablePermits() == 5) synx21();

    } catch (InterruptedException post) {
      System.out.println(post.toString());
    }
  }

  public synchronized int generateReturn() {
    return influx;
  }

  static {
    chairs = new Semaphore(5);
    superstore = new Semaphore(1);
  }

  private synchronized void synx20() {}

  private synchronized void synx21() {
    superstore.release();
  }
}
