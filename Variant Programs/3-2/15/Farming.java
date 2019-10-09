import java.util.concurrent.Semaphore;

public class Farming implements Runnable {
  private java.lang.String ownership;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int conflict = 0;

  public Farming(String user) {
    this.ownership = user;
  }

  public void run() {

    while (true) {
      System.out.println(ownership + ": Waiting for bridge.");

      try {
        fh.acquire();
        engageApproaches();
        System.out.println(ownership + ": Crossing bridge step 5.");
        engageApproaches();
        System.out.println(ownership + ": Crossing bridge step 10.");
        engageApproaches();
        System.out.println(ownership + ": Crossing bridge step 15.");
        engageApproaches();
        System.out.println(ownership + ": Across the bridge.");
        conflict++;
        System.out.println("NEON = " + conflict);
        fh.release();
      } catch (java.lang.InterruptedException appointed) {
        appointed.toString();
      }
    }
  }

  private synchronized void engageApproaches() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }
}
