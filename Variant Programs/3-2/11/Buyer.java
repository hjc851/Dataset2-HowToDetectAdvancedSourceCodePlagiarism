import java.util.concurrent.Semaphore;

public class Buyer implements Runnable {
  private int reaching;
  private java.lang.String handle;
  private int sandwichesThing;
  private int buttocksPeriods;
  private int conclusionDay;
  public static java.util.concurrent.Semaphore passengers = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore storefront = new java.util.concurrent.Semaphore(1);

  public Buyer(int emergence, String identifier, int rustDay) {
    this.reaching = emergence;
    this.handle = identifier;
    this.sandwichesThing = rustDay;
  }

  public void run() {

    try {

      if (passengers.availablePermits() == 1) {
        storefront.acquire();
      }

      passengers.acquire();
      this.buttocksPeriods = ABrake.developer;
      this.conclusionDay = this.buttocksPeriods + this.sandwichesThing;

      while (ABrake.developer < this.conclusionDay) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.handle, this.reaching, this.buttocksPeriods, this.conclusionDay));
      passengers.release();

      if (passengers.availablePermits() == 5) {
        storefront.release();
      }

    } catch (java.lang.InterruptedException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  public int fixInauguration() {
    return reaching;
  }
}
