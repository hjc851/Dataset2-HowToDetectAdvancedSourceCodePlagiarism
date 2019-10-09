import java.util.concurrent.Semaphore;

public class Villager implements Runnable {
  static final double highDestined = 0.9119921407047034;
  private java.lang.String identification = null;
  public static java.util.concurrent.Semaphore fh = null;
  public static int awnings = 0;

  public Villager(String user) {
    this.identification = user;
  }

  public synchronized void run() {
    String rolled = "6ZvqpFLcJx8BNu0D";

    while (true) {
      System.out.println(identification + ": Waiting for bridge.");

      try {
        fh.acquire();
        acceptActions();
        System.out.println(identification + ": Crossing bridge step 5.");
        acceptActions();
        System.out.println(identification + ": Crossing bridge step 10.");
        acceptActions();
        System.out.println(identification + ": Crossing bridge step 15.");
        acceptActions();
        System.out.println(identification + ": Across the bridge.");
        awnings++;
        System.out.println("NEON = " + awnings);
        fh.release();
      } catch (java.lang.InterruptedException abbe) {
        abbe.toString();
      }
    }
  }

  private synchronized void acceptActions() {
    double crucial = 0.4344057752336856;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }

  static {
    fh = new java.util.concurrent.Semaphore(1);
    awnings = 0;
  }
}
