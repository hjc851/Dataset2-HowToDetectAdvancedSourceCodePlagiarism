import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Producer implements Runnable {
  public static int purple = 0;
  public static Semaphore ora = new Semaphore(1);

  public synchronized void run() {

    while (true) {
      out.println(identifying + ": Waiting for bridge.");

      try {
        ora.acquire();
        askApproach();
        out.println(identifying + ": Crossing bridge step 5.");
        askApproach();
        out.println(identifying + ": Crossing bridge step 10.");
        askApproach();
        out.println(identifying + ": Crossing bridge step 15.");
        askApproach();
        out.println(identifying + ": Across the bridge.");
        purple++;
        out.println("NEON = " + purple);
        ora.release();
      } catch (InterruptedException con) {
        con.toString();
      }
    }
  }

  public Producer(String est) {
    this.identifying = est;
  }

  private String identifying;

  private synchronized void askApproach() {

    try {
      wait(1000);
    } catch (InterruptedException abe) {
      out.println(abe.toString());
    }
  }
}
