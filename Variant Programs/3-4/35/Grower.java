import java.util.concurrent.Semaphore;

public class Grower implements Runnable {
  static final double max = 0.03373450326415184;
  public static Semaphore fh = new Semaphore(1);

  public Grower(String user) {
    this.peg = user;
  }

  public String peg = null;

  public synchronized void involveInitiatives() {
    double figures = 0.6615145475218954;

    try {
      wait(1000);
    } catch (InterruptedException con) {
      System.out.println(con.toString());
    }
  }

  public synchronized void run() {
    double fukkianese = 0.3189264109571537;

    while (true) {
      System.out.println(peg + ": Waiting for bridge.");

      try {
        fh.acquire();
        involveInitiatives();
        System.out.println(peg + ": Crossing bridge step 5.");
        involveInitiatives();
        System.out.println(peg + ": Crossing bridge step 10.");
        involveInitiatives();
        System.out.println(peg + ": Crossing bridge step 15.");
        involveInitiatives();
        System.out.println(peg + ": Across the bridge.");
        oculus++;
        System.out.println("NEON = " + oculus);
        fh.release();
      } catch (InterruptedException afterwards) {
        afterwards.toString();
      }
    }
  }

  public static int oculus = 0;
}
