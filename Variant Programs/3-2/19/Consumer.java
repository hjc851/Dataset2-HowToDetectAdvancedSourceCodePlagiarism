import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
  private int dawn;
  private java.lang.String peg;
  private int swallowAmount;
  private int buttocksPeriods;
  private int concludeChance;
  public static java.util.concurrent.Semaphore space = new java.util.concurrent.Semaphore(5);
  public static java.util.concurrent.Semaphore mall = new java.util.concurrent.Semaphore(1);

  public Consumer(int arriver, String ibid, int feedClip) {
    this.dawn = arriver;
    this.peg = ibid;
    this.swallowAmount = feedClip;
  }

  public void run() {

    try {

      if (space.availablePermits() == 1) {
        mall.acquire();
      }

      space.acquire();
      this.buttocksPeriods = P5Device.timed;
      this.concludeChance = this.buttocksPeriods + this.swallowAmount;

      while (P5Device.timed < this.concludeChance) {}
      System.out.println(
          java.lang.String.format(
              "%-10s%10s%10s%10s", this.peg, this.dawn, this.buttocksPeriods, this.concludeChance));
      space.release();

      if (space.availablePermits() == 5) {
        mall.release();
      }

    } catch (java.lang.InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  public int produceVisit() {
    return dawn;
  }
}
