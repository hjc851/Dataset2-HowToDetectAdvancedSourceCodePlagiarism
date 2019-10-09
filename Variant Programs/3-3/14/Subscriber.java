import java.util.concurrent.Semaphore;

public class Subscriber implements Runnable {
  static {
    tickets = new java.util.concurrent.Semaphore(5);
    stock = new java.util.concurrent.Semaphore(1);
  }

  public static java.util.concurrent.Semaphore tickets = null;
  public int assChance = 0;

  public synchronized void run() {

    try {

      if (tickets.availablePermits() == 1) {
        stock.acquire();
      }

      tickets.acquire();
      this.assChance = P4Mimic.timekeeper;
      this.doneAgain = this.assChance + this.ingestMinutes;

      while (P4Mimic.timekeeper < this.doneAgain) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.milad, this.ascension, this.assChance, this.doneAgain));
      tickets.release();

      if (tickets.availablePermits() == 5) {
        stock.release();
      }

    } catch (java.lang.InterruptedException con) {
      System.out.println(con.toString());
    }
  }

  public Subscriber(int reaching, String handle, int mealsChance) {
    this.ascension = reaching;
    this.milad = handle;
    this.ingestMinutes = mealsChance;
  }

  public synchronized int beatPresence() {
    return ascension;
  }

  public int ascension = 0;
  public java.lang.String milad = null;
  public static java.util.concurrent.Semaphore stock = null;
  public int doneAgain = 0;
  public int ingestMinutes = 0;
}
