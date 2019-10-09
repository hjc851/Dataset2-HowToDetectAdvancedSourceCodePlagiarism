import java.util.concurrent.Semaphore;

public class Purchaser implements Runnable {
  private int presence;
  private java.lang.String picture;
  private int mealWhen;
  private int rearClock;
  private int completedYears;
  public static java.util.concurrent.Semaphore member = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore drugstore = new java.util.concurrent.Semaphore(1);

  public Purchaser(int comer, String tag, int foodYears) {
    this.presence = comer;
    this.picture = tag;
    this.mealWhen = foodYears;
  }

  public void run() {

    try {

      if (member.availablePermits() == 1) {
        drugstore.acquire();
      }

      member.acquire();
      this.rearClock = ApMoot.clock;
      this.completedYears = this.rearClock + this.mealWhen;

      while (ApMoot.clock < this.completedYears) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s",
              this.picture, this.presence, this.rearClock, this.completedYears));
      member.release();

      if (member.availablePermits() == 5) {
        drugstore.release();
      }

    } catch (java.lang.InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  public int produceVisit() {
    return presence;
  }
}
