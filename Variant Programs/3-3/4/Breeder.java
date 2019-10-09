import java.util.concurrent.Semaphore;

public class Breeder implements Runnable {
  private java.lang.String picture = null;
  public static java.util.concurrent.Semaphore fh = null;
  public static int lettering = 0;

  public Breeder(String ibid) {
    this.picture = ibid;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(picture + ": Waiting for bridge.");

      try {
        fh.acquire();
        considerMoves();
        System.out.println(picture + ": Crossing bridge step 5.");
        considerMoves();
        System.out.println(picture + ": Crossing bridge step 10.");
        considerMoves();
        System.out.println(picture + ": Crossing bridge step 15.");
        considerMoves();
        System.out.println(picture + ": Across the bridge.");
        lettering++;
        System.out.println("NEON = " + lettering);
        fh.release();
      } catch (java.lang.InterruptedException officio) {
        officio.toString();
      }
    }
  }

  private synchronized void considerMoves() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  static {
    fh = new java.util.concurrent.Semaphore(1);
    lettering = 0;
  }
}
