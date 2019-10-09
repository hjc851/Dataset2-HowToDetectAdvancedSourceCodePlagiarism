import java.util.concurrent.Semaphore;

public class Ranch implements Runnable {
  private java.lang.String ibid;
  public static java.util.concurrent.Semaphore ora = new java.util.concurrent.Semaphore(1);
  public static int nightscape = 0;

  public Ranch(String peg) {
    this.ibid = peg;
  }

  public void run() {

    while (true) {
      System.out.println(ibid + ": Waiting for bridge.");

      try {
        ora.acquire();
        engageApproaches();
        System.out.println(ibid + ": Crossing bridge step 5.");
        engageApproaches();
        System.out.println(ibid + ": Crossing bridge step 10.");
        engageApproaches();
        System.out.println(ibid + ": Crossing bridge step 15.");
        engageApproaches();
        System.out.println(ibid + ": Across the bridge.");
        nightscape++;
        System.out.println("NEON = " + nightscape);
        ora.release();
      } catch (java.lang.InterruptedException adoptee) {
        adoptee.toString();
      }
    }
  }

  private synchronized void engageApproaches() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }
}
