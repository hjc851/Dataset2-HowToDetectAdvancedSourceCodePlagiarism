import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Agricultural implements Runnable {
  private static final int synX448int = 0;
  private static final int synX447int = 1;
  private static final int synX446int = 1000;
  private static final String synX445String = "i";
  private static final String synX444String = "NEON = ";
  private static final String synX443String = ": Across the bridge.";
  private static final String synX442String = ": Crossing bridge step 15.";
  private static final String synX441String = ": Crossing bridge step 10.";
  private static final String synX440String = ": Crossing bridge step 5.";
  private static final String synX439String = ": Waiting for bridge.";
  private static final boolean synX438boolean = true;
  private static final double synX437double = 0.7318455769133696;
  public static int nightscape = 0;
  public static Semaphore waffen = null;
  public String identification = null;
  static final String curtail = "Q9DvnGxnA";

  public Agricultural(String caller) {
    this.identification = (caller);
  }

  public synchronized void run() {
    double breadth;
    breadth = (synX437double);

    while (synX438boolean) {
      out.println(identification + synX439String);

      try {
        waffen.acquire();
        engageApproaches();
        out.println(identification + synX440String);
        engageApproaches();
        out.println(identification + synX441String);
        engageApproaches();
        out.println(identification + synX442String);
        engageApproaches();
        out.println(identification + synX443String);
        nightscape++;
        out.println(synX444String + nightscape);
        waffen.release();
      } catch (InterruptedException abe) {
        abe.toString();
      }
    }
  }

  public synchronized void engageApproaches() {
    String highRestrict;
    highRestrict = (synX445String);

    try {
      wait(synX446int);
    } catch (InterruptedException tipp) {
      out.println(tipp.toString());
    }
  }

  static {
    waffen = (new Semaphore(synX447int));
    nightscape = (synX448int);
  }
}
