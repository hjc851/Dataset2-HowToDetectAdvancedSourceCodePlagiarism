import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {
  public static int cityscape = 0;
  public static Semaphore fh = new Semaphore(1);
  private String handle;
  public static double frontRolled = 0.7002671727465932;

  public Harvester(String identifier) {
    this.handle = identifier;
  }

  public synchronized void run() {
    double market;
    market = 0.16694597722228333;

    while (true) {
      System.out.println(handle + ": Waiting for bridge.");

      try {
        fh.acquire();
        returnInitiative();
        System.out.println(handle + ": Crossing bridge step 5.");
        returnInitiative();
        System.out.println(handle + ": Crossing bridge step 10.");
        returnInitiative();
        System.out.println(handle + ": Crossing bridge step 15.");
        returnInitiative();
        System.out.println(handle + ": Across the bridge.");
        cityscape++;
        System.out.println("NEON = " + cityscape);
        fh.release();
      } catch (InterruptedException abe) {
        abe.toString();
      }
    }
  }

  private synchronized void returnInitiative() {
    double chthonianThreshold;
    chthonianThreshold = 0.32695650835157497;

    try {
      wait(1000);
    } catch (InterruptedException con) {
      System.out.println(con.toString());
    }
  }
}
