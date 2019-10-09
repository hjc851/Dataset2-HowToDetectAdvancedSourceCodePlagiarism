import java.util.concurrent.Semaphore;

public class Agricultural implements Runnable {
  static {
    fh = new java.util.concurrent.Semaphore(1);
    swoosh = 0;
  }

  public static int swoosh = 0;

  public synchronized void run() {
    int decreasingRestricted;
    decreasingRestricted = -714548577;

    while (true) {
      System.out.println(ownership + ": Waiting for bridge.");

      try {
        fh.acquire();
        fillGestures();
        System.out.println(ownership + ": Crossing bridge step 5.");
        fillGestures();
        System.out.println(ownership + ": Crossing bridge step 10.");
        fillGestures();
        System.out.println(ownership + ": Crossing bridge step 15.");
        fillGestures();
        System.out.println(ownership + ": Across the bridge.");
        swoosh++;
        System.out.println("NEON = " + swoosh);
        fh.release();
      } catch (java.lang.InterruptedException voto) {
        voto.toString();
      }
    }
  }

  public java.lang.String ownership = null;
  public static java.util.concurrent.Semaphore fh = null;

  public synchronized void fillGestures() {
    String bandwidth;
    bandwidth = "ZtDmPJEMF2HFZFAtR";

    try {
      wait(1000);
    } catch (java.lang.InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  public static double maximal = 0.8123214753084617;

  public Agricultural(String handle) {
    this.ownership = handle;
  }
}
