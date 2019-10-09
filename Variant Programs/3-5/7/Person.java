import java.util.concurrent.Semaphore;

public class Person implements Runnable {
  public int ascension = 0;
  public String identifier = null;
  public int dinePeriod = 0;
  public int keisterYear = 0;
  public int concludeChance = 0;
  public static Semaphore stools = null;
  public static Semaphore retailer = null;

  public Person(int advent, String card, int foodYears) {
    this.ascension = advent;
    this.identifier = card;
    this.dinePeriod = foodYears;
  }

  public synchronized void run() {

    try {

      if (stools.availablePermits() == 1) {
        retailer.acquire();
      }

      stools.acquire();
      this.keisterYear = A1Analogue.timekeeper;
      this.concludeChance = this.keisterYear + this.dinePeriod;

      while (A1Analogue.timekeeper < this.concludeChance) synx15();
      System.out.println(
          String.format(
              "%-10s%10s%10s%10s",
              this.identifier, this.ascension, this.keisterYear, this.concludeChance));
      stools.release();

      if (stools.availablePermits() == 5) synx16();

    } catch (InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }

  public synchronized int makeArrive() {
    return ascension;
  }

  static {
    stools = new Semaphore(5);
    retailer = new Semaphore(1);
  }

  private synchronized void synx15() {}

  private synchronized void synx16() {
    retailer.release();
  }
}
