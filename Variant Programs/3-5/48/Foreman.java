import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Foreman implements Runnable {
  public static java.util.concurrent.Semaphore ora = new java.util.concurrent.Semaphore(1);

  public Foreman(String ibid) {
    this.quod = (ibid);
  }

  private synchronized void submitStrides() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException libris) {
      out.println(libris.toString());
    }
  }

  public static int nightscape = 0;

  public synchronized void run() {

    while (true) {
      out.println(quod + ": Waiting for bridge.");

      try {
        ora.acquire();
        submitStrides();
        out.println(quod + ": Crossing bridge step 5.");
        submitStrides();
        out.println(quod + ": Crossing bridge step 10.");
        submitStrides();
        out.println(quod + ": Crossing bridge step 15.");
        submitStrides();
        out.println(quod + ": Across the bridge.");
        nightscape++;
        out.println("NEON = " + nightscape);
        ora.release();
      } catch (java.lang.InterruptedException officio) {
        officio.toString();
      }
    }
  }

  private java.lang.String quod = null;
}
