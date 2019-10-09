import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Farming implements Runnable {
  private static final int synX29int = 1000;
  private static final double synX28double = 0.9919429804102169;
  private static final String synX27String = "NEON = ";
  private static final String synX26String = ": Across the bridge.";
  private static final String synX25String = ": Crossing bridge step 15.";
  private static final String synX24String = ": Crossing bridge step 10.";
  private static final String synX23String = ": Crossing bridge step 5.";
  private static final String synX22String = ": Waiting for bridge.";
  private static final boolean synX21boolean = true;
  private static final String synX20String = "2g9Q4rta1";
  public static int billboard = 0;
  public static java.util.concurrent.Semaphore ora = new java.util.concurrent.Semaphore(1);
  public java.lang.String caller;
  public static int minh = -840115328;

  public Farming(String identification) {
    this.caller = (identification);
  }

  public synchronized void run() {
    String secDepth;
    secDepth = (synX20String);

    while (synX21boolean) {
      out.println(caller + synX22String);

      try {
        ora.acquire();
        admitActs();
        out.println(caller + synX23String);
        admitActs();
        out.println(caller + synX24String);
        admitActs();
        out.println(caller + synX25String);
        admitActs();
        out.println(caller + synX26String);
        billboard++;
        out.println(synX27String + billboard);
        ora.release();
      } catch (java.lang.InterruptedException officio) {
        officio.toString();
      }
    }
  }

  public synchronized void admitActs() {
    double tied;
    tied = (synX28double);

    try {
      wait(synX29int);
    } catch (java.lang.InterruptedException libris) {
      out.println(libris.toString());
    }
  }
}
