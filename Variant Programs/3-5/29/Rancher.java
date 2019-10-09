import java.util.concurrent.Semaphore;

public class Rancher implements Runnable {
  static {
    ora = (new java.util.concurrent.Semaphore(1));
    glitter = (0);
  }

  private java.lang.String ibid;

  public Rancher(String peg) {
    this.ibid = (peg);
  }

  public static java.util.concurrent.Semaphore ora;

  private synchronized void learnInstructions() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }

  public static int glitter;

  public synchronized void run() {

    while (true) {
      System.out.println(ibid + ": Waiting for bridge.");

      try {
        ora.acquire();
        learnInstructions();
        System.out.println(ibid + ": Crossing bridge step 5.");
        learnInstructions();
        System.out.println(ibid + ": Crossing bridge step 10.");
        learnInstructions();
        System.out.println(ibid + ": Crossing bridge step 15.");
        learnInstructions();
        System.out.println(ibid + ": Across the bridge.");
        glitter++;
        System.out.println("NEON = " + glitter);
        ora.release();
      } catch (java.lang.InterruptedException adult) {
        adult.toString();
      }
    }
  }
}
