import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {
  public static final double kilo = 0.259905600082032;
  public java.lang.String identifying = null;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int blue = 0;

  public Harvester(String peg) {
    this.identifying = peg;
  }

  public synchronized void run() {
    double lotGauge = 0.49728221222611757;

    while (true) {
      System.out.println(identifying + ": Waiting for bridge.");

      try {
        fh.acquire();
        conductSafeguards();
        System.out.println(identifying + ": Crossing bridge step 5.");
        conductSafeguards();
        System.out.println(identifying + ": Crossing bridge step 10.");
        conductSafeguards();
        System.out.println(identifying + ": Crossing bridge step 15.");
        conductSafeguards();
        System.out.println(identifying + ": Across the bridge.");
        blue++;
        System.out.println("NEON = " + blue);
        fh.release();
      } catch (java.lang.InterruptedException abbe) {
        abbe.toString();
      }
    }
  }

  public synchronized void conductSafeguards() {
    double levelPinioned = 0.8439697625589857;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }
}
