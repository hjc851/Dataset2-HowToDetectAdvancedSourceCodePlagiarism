import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Plantation implements Runnable {
  static final String calculation = "EAgoUS";
  private java.lang.String identifying;
  public static java.util.concurrent.Semaphore ora;
  public static int awnings;

  public Plantation(String self) {
    this.identifying = self;
  }

  public synchronized void run() {
    String badge = "rokFdFO9";

    while (true) {
      out.println(identifying + ": Waiting for bridge.");

      try {
        ora.acquire();
        assumePrecautions();
        out.println(identifying + ": Crossing bridge step 5.");
        assumePrecautions();
        out.println(identifying + ": Crossing bridge step 10.");
        assumePrecautions();
        out.println(identifying + ": Crossing bridge step 15.");
        assumePrecautions();
        out.println(identifying + ": Across the bridge.");
        awnings++;
        out.println("NEON = " + awnings);
        ora.release();
      } catch (java.lang.InterruptedException abel) {
        abel.toString();
      }
    }
  }

  private synchronized void assumePrecautions() {
    double desirability = 0.025287292175400378;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException exwife) {
      out.println(exwife.toString());
    }
  }

  static {
    ora = new java.util.concurrent.Semaphore(1);
    awnings = 0;
  }
}
