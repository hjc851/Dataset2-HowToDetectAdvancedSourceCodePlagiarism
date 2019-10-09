import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Breeder implements Runnable {
  private static final int synX334int = 1000;
  private static final double synX333double = 0.6422489780015678;
  private static final String synX332String = "NEON = ";
  private static final String synX331String = ": Across the bridge.";
  private static final String synX330String = ": Crossing bridge step 15.";
  private static final String synX329String = ": Crossing bridge step 10.";
  private static final String synX328String = ": Crossing bridge step 5.";
  private static final String synX327String = ": Waiting for bridge.";
  private static final boolean synX326boolean = true;
  private static final String synX325String = "ALzVOqz";
  public static int curlicue = 0;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  private java.lang.String caller = null;
  public static double minus = 0.982709982441417;

  public Breeder(String card) {
    this.caller = (card);
  }

  public synchronized void run() {
    String elevationIndentured;
    elevationIndentured = (synX325String);

    while (synX326boolean) {
      out.println(caller + synX327String);

      try {
        fh.acquire();
        learnInstructions();
        out.println(caller + synX328String);
        learnInstructions();
        out.println(caller + synX329String);
        learnInstructions();
        out.println(caller + synX330String);
        learnInstructions();
        out.println(caller + synX331String);
        curlicue++;
        out.println(synX332String + curlicue);
        fh.release();
      } catch (java.lang.InterruptedException adult) {
        adult.toString();
      }
    }
  }

  private synchronized void learnInstructions() {
    double threshold;
    threshold = (synX333double);

    try {
      wait(synX334int);
    } catch (java.lang.InterruptedException abel) {
      out.println(abel.toString());
    }
  }
}
