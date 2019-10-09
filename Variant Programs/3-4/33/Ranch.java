import java.util.concurrent.Semaphore;

public class Ranch implements Runnable {
  private java.lang.String user = null;
  public static java.util.concurrent.Semaphore waffen = null;
  public static int nightscape = 0;

  public Ranch(String security) {
    this.user = security;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(user + ": Waiting for bridge.");

      try {
        waffen.acquire();
        makeAction();
        System.out.println(user + ": Crossing bridge step 5.");
        makeAction();
        System.out.println(user + ": Crossing bridge step 10.");
        makeAction();
        System.out.println(user + ": Crossing bridge step 15.");
        makeAction();
        System.out.println(user + ": Across the bridge.");
        nightscape++;
        System.out.println("NEON = " + nightscape);
        waffen.release();
      } catch (java.lang.InterruptedException post) {
        post.toString();
      }
    }
  }

  private synchronized void makeAction() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }

  static {
    waffen = new java.util.concurrent.Semaphore(1);
    nightscape = 0;
  }
}
