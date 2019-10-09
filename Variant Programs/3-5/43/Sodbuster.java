import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Sodbuster implements Runnable {
  public static int twinkling = 0;
  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);
  private java.lang.String ibid;

  public Sodbuster(String user) {
    this.ibid = user;
  }

  public synchronized void run() {

    while (true) {
      out.println(ibid + ": Waiting for bridge.");

      try {
        waffen.acquire();
        involveInitiatives();
        out.println(ibid + ": Crossing bridge step 5.");
        involveInitiatives();
        out.println(ibid + ": Crossing bridge step 10.");
        involveInitiatives();
        out.println(ibid + ": Crossing bridge step 15.");
        involveInitiatives();
        out.println(ibid + ": Across the bridge.");
        twinkling++;
        out.println("NEON = " + twinkling);
        waffen.release();
      } catch (java.lang.InterruptedException tipp) {
        tipp.toString();
      }
    }
  }

  private synchronized void involveInitiatives() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException former) {
      out.println(former.toString());
    }
  }
}
