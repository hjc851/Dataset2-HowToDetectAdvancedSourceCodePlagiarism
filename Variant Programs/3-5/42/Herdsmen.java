import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Herdsmen implements Runnable {
  private static final int synX978int = 1000;
  private static final double synX977double = 0.8973404358138665;
  private static final String synX976String = "NEON = ";
  private static final String synX975String = ": Across the bridge.";
  private static final String synX974String = ": Crossing bridge step 15.";
  private static final String synX973String = ": Crossing bridge step 10.";
  private static final String synX972String = ": Crossing bridge step 5.";
  private static final String synX971String = ": Waiting for bridge.";
  private static final boolean synX970boolean = true;
  private static final int synX969int = -336109864;
  public static Semaphore fh = new Semaphore(1);

  public Herdsmen(String handle) {
    this.pictures = handle;
  }

  public synchronized void run() {
    int mention;
    mention = synX969int;

    while (synX970boolean) {
      out.println(pictures + synX971String);

      try {
        fh.acquire();
        considerMoves();
        out.println(pictures + synX972String);
        considerMoves();
        out.println(pictures + synX973String);
        considerMoves();
        out.println(pictures + synX974String);
        considerMoves();
        out.println(pictures + synX975String);
        ne++;
        out.println(synX976String + ne);
        fh.release();
      } catch (InterruptedException con) {
        con.toString();
      }
    }
  }

  public synchronized void considerMoves() {
    double curb;
    curb = synX977double;

    try {
      wait(synX978int);
    } catch (InterruptedException libris) {
      out.println(libris.toString());
    }
  }

  static String matt = "E87";
  public static int ne = 0;
  public String pictures = null;
}
