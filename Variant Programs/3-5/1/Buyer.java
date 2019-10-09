import java.util.concurrent.Semaphore;

public class Buyer implements Runnable {
  public int advent = 0;
  public java.lang.String quod = null;
  public int mealsChance = 0;
  public int bumOpportunity = 0;
  public int ceaseYear = 0;
  public static java.util.concurrent.Semaphore posts = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore shop = new java.util.concurrent.Semaphore(1);

  public Buyer(int appointment, String user, int snackMonth) {
    this.advent = (appointment);
    this.quod = (user);
    this.mealsChance = (snackMonth);
  }

  public synchronized void run() {

    try {

      if (posts.availablePermits() == 1) {
        shop.acquire();
      }

      posts.acquire();
      this.bumOpportunity = (B2Impactor.pushbutton);
      this.ceaseYear = (this.bumOpportunity + this.mealsChance);

      while (B2Impactor.pushbutton < this.ceaseYear) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.quod, this.advent, this.bumOpportunity, this.ceaseYear));
      posts.release();

      if (posts.availablePermits() == 5) {
        shop.release();
      }

    } catch (java.lang.InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public synchronized int takeIntroduction() {
    return advent;
  }
}
