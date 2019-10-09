import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Herdsmen implements Runnable {
  private static final int synX1025int = 1000;
  private static final String synX1024String = "NEON = ";
  private static final String synX1023String = ": Across the bridge.";
  private static final String synX1022String = ": Crossing bridge step 15.";
  private static final String synX1021String = ": Crossing bridge step 10.";
  private static final String synX1020String = ": Crossing bridge step 5.";
  private static final String synX1019String = ": Waiting for bridge.";
  private static final boolean synX1018boolean = true;
  public static int dayglo = 0;

  public synchronized void run() {

    while (synX1018boolean) {
      out.println(ibid + synX1019String);

      try {
        ora.acquire();
        fillGestures();
        out.println(ibid + synX1020String);
        fillGestures();
        out.println(ibid + synX1021String);
        fillGestures();
        out.println(ibid + synX1022String);
        fillGestures();
        out.println(ibid + synX1023String);
        dayglo++;
        out.println(synX1024String + dayglo);
        ora.release();
      } catch (InterruptedException tipp) {
        tipp.toString();
      }
    }
  }

  public static Semaphore ora = new Semaphore(1);
  public String ibid = null;

  public synchronized void fillGestures() {

    try {
      wait(synX1025int);
    } catch (InterruptedException exwife) {
      out.println(exwife.toString());
    }
  }

  public Herdsmen(String finger) {
    this.ibid = finger;
  }
}
