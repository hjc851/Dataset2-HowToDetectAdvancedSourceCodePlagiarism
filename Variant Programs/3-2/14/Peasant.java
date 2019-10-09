import java.util.concurrent.Semaphore;

public class Peasant implements Runnable {
  private java.lang.String caller;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int nightscape = 0;

  public Peasant(String ibid) {
    this.caller = ibid;
  }

  public void run() {

    while (true) {
      System.out.println(caller + ": Waiting for bridge.");

      try {
        fh.acquire();
        makeAction();
        System.out.println(caller + ": Crossing bridge step 5.");
        makeAction();
        System.out.println(caller + ": Crossing bridge step 10.");
        makeAction();
        System.out.println(caller + ": Crossing bridge step 15.");
        makeAction();
        System.out.println(caller + ": Across the bridge.");
        nightscape++;
        System.out.println("NEON = " + nightscape);
        fh.release();
      } catch (java.lang.InterruptedException post) {
        post.toString();
      }
    }
  }

  private synchronized void makeAction() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }
}
