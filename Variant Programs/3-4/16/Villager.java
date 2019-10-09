import java.util.concurrent.Semaphore;

public class Villager implements Runnable {
  public static int cityscape = 0;
  public static java.util.concurrent.Semaphore ora = null;
  private java.lang.String milad = null;
  static final double leaping = 0.4667982106356784;

  public Villager(String identification) {
    this.milad = identification;
  }

  public synchronized void run() {
    double prices;
    prices = 0.5720038816281796;

    while (true) {
      System.out.println(milad + ": Waiting for bridge.");

      try {
        ora.acquire();
        occupyRemedies();
        System.out.println(milad + ": Crossing bridge step 5.");
        occupyRemedies();
        System.out.println(milad + ": Crossing bridge step 10.");
        occupyRemedies();
        System.out.println(milad + ": Crossing bridge step 15.");
        occupyRemedies();
        System.out.println(milad + ": Across the bridge.");
        cityscape++;
        System.out.println("NEON = " + cityscape);
        ora.release();
      } catch (java.lang.InterruptedException adoptee) {
        adoptee.toString();
      }
    }
  }

  private synchronized void occupyRemedies() {
    double across;
    across = 0.6602755815003052;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }

  static {
    ora = new java.util.concurrent.Semaphore(1);
    cityscape = 0;
  }
}
