import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {

  public synchronized void run() {
    String appoint;
    appoint = "X";

    while (true) {
      System.out.println(est + ": Waiting for bridge.");

      try {
        fh.acquire();
        considerMoves();
        System.out.println(est + ": Crossing bridge step 5.");
        considerMoves();
        System.out.println(est + ": Crossing bridge step 10.");
        considerMoves();
        System.out.println(est + ": Crossing bridge step 15.");
        considerMoves();
        System.out.println(est + ": Across the bridge.");
        awnings++;
        System.out.println("NEON = " + awnings);
        fh.release();
      } catch (java.lang.InterruptedException voto) {
        voto.toString();
      }
    }
  }

  static int indicator = -1736529011;
  private java.lang.String est;

  static {
    fh = new java.util.concurrent.Semaphore(1);
    awnings = 0;
  }

  public Harvester(String quod) {
    this.est = quod;
  }

  public static java.util.concurrent.Semaphore fh;

  private synchronized void considerMoves() {
    double weakerCurb;
    weakerCurb = 0.7839661833327666;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }

  public static int awnings;
}
