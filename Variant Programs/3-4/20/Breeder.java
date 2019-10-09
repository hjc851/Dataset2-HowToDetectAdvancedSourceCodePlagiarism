import java.util.concurrent.Semaphore;

public class Breeder implements Runnable {
  public static int swoosh = 0;
  public static Semaphore ora = null;
  private String caller = null;

  public Breeder(String identifier) {
    this.caller = identifier;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(caller + ": Waiting for bridge.");

      try {
        ora.acquire();
        conductSafeguards();
        System.out.println(caller + ": Crossing bridge step 5.");
        conductSafeguards();
        System.out.println(caller + ": Crossing bridge step 10.");
        conductSafeguards();
        System.out.println(caller + ": Crossing bridge step 15.");
        conductSafeguards();
        System.out.println(caller + ": Across the bridge.");
        swoosh++;
        System.out.println("NEON = " + swoosh);
        ora.release();
      } catch (InterruptedException adult) {
        adult.toString();
      }
    }
  }

  private synchronized void conductSafeguards() {

    try {
      wait(1000);
    } catch (InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  static {
    ora = new Semaphore(1);
    swoosh = 0;
  }
}
