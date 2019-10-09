import java.util.concurrent.Semaphore;

public class Producers implements Runnable {
  public static final int designator = -1852232652;
  public java.lang.String ownership = null;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int dayglo = 0;

  public Producers(String peg) {
    this.ownership = peg;
  }

  public synchronized void run() {
    double lotGauge = 0.49728221222611757;

    while (true) {
      System.out.println(ownership + ": Waiting for bridge.");

      try {
        fh.acquire();
        returnInitiative();
        System.out.println(ownership + ": Crossing bridge step 5.");
        returnInitiative();
        System.out.println(ownership + ": Crossing bridge step 10.");
        returnInitiative();
        System.out.println(ownership + ": Crossing bridge step 15.");
        returnInitiative();
        System.out.println(ownership + ": Across the bridge.");
        dayglo++;
        System.out.println("NEON = " + dayglo);
        fh.release();
      } catch (java.lang.InterruptedException abbe) {
        abbe.toString();
      }
    }
  }

  public synchronized void returnInitiative() {
    double northernObligated = 0.8439697625589857;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }
}
