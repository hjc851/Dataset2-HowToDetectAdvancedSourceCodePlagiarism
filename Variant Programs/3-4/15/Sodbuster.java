import java.util.concurrent.Semaphore;

public class Sodbuster implements Runnable {
  public static int pink;

  public synchronized void run() {
    double hourThick;
    hourThick = 0.4059871182072229;

    while (true) {
      System.out.println(picture + ": Waiting for bridge.");

      try {
        ora.acquire();
        needEfforts();
        System.out.println(picture + ": Crossing bridge step 5.");
        needEfforts();
        System.out.println(picture + ": Crossing bridge step 10.");
        needEfforts();
        System.out.println(picture + ": Crossing bridge step 15.");
        needEfforts();
        System.out.println(picture + ": Across the bridge.");
        pink++;
        System.out.println("NEON = " + pink);
        ora.release();
      } catch (java.lang.InterruptedException admittedly) {
        admittedly.toString();
      }
    }
  }

  private synchronized void needEfforts() {
    double roll;
    roll = 0.40830631456514077;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException tipp) {
      System.out.println(tipp.toString());
    }
  }

  static {
    ora = new java.util.concurrent.Semaphore(1);
    pink = 0;
  }

  private java.lang.String picture;
  static double maximalLength = 0.3724840828685849;

  public Sodbuster(String quod) {
    this.picture = quod;
  }

  public static java.util.concurrent.Semaphore ora;
}
