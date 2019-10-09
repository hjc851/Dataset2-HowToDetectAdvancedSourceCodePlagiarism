import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Foreman implements Runnable {
  private java.lang.String map;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int gaslights = 0;

  public Foreman(String name) {
    this.map = name;
  }

  public synchronized void run() {

    while (true) {
      out.println(map + ": Waiting for bridge.");

      try {
        fh.acquire();
        makeAction();
        out.println(map + ": Crossing bridge step 5.");
        makeAction();
        out.println(map + ": Crossing bridge step 10.");
        makeAction();
        out.println(map + ": Crossing bridge step 15.");
        makeAction();
        out.println(map + ": Across the bridge.");
        gaslights++;
        out.println("NEON = " + gaslights);
        fh.release();
      } catch (java.lang.InterruptedException con) {
        con.toString();
      }
    }
  }

  private synchronized void makeAction() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException pro) {
      out.println(pro.toString());
    }
  }
}
