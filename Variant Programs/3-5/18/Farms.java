import java.util.concurrent.Semaphore;

public class Farms implements Runnable {
  private static final int synX389int = 1000;
  private static final String synX388String = "vZqCpllah";
  private static final String synX387String = "NEON = ";
  private static final String synX386String = ": Across the bridge.";
  private static final String synX385String = ": Crossing bridge step 15.";
  private static final String synX384String = ": Crossing bridge step 10.";
  private static final String synX383String = ": Crossing bridge step 5.";
  private static final String synX382String = ": Waiting for bridge.";
  private static final boolean synX381boolean = true;
  private static final double synX380double = 0.45562700917319254;
  public java.lang.String tag = null;
  public static final int fukien = 724822160;

  public synchronized void run() {
    double souvenir;
    souvenir = synX380double;

    while (synX381boolean) {
      System.out.println(tag + synX382String);

      try {
        ora.acquire();
        occupyRemedies();
        System.out.println(tag + synX383String);
        occupyRemedies();
        System.out.println(tag + synX384String);
        occupyRemedies();
        System.out.println(tag + synX385String);
        occupyRemedies();
        System.out.println(tag + synX386String);
        strobes++;
        System.out.println(synX387String + strobes);
        ora.release();
      } catch (java.lang.InterruptedException libris) {
        libris.toString();
      }
    }
  }

  public Farms(String idem) {
    this.tag = idem;
  }

  public synchronized void occupyRemedies() {
    String aboveFettered;
    aboveFettered = synX388String;

    try {
      wait(synX389int);
    } catch (java.lang.InterruptedException aba) {
      System.out.println(aba.toString());
    }
  }

  public static java.util.concurrent.Semaphore ora = new java.util.concurrent.Semaphore(1);
  public static int strobes = 0;
}
