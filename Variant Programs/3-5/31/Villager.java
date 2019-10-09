import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Villager implements Runnable {
  private static final int synX835int = 1000;
  private static final double synX834double = 0.6290368841418619;
  private static final String synX833String = "NEON = ";
  private static final String synX832String = ": Across the bridge.";
  private static final String synX831String = ": Crossing bridge step 15.";
  private static final String synX830String = ": Crossing bridge step 10.";
  private static final String synX829String = ": Crossing bridge step 5.";
  private static final String synX828String = ": Waiting for bridge.";
  private static final boolean synX827boolean = true;
  private static final double synX826double = 0.3557362782605348;

  public synchronized void run() {
    double reduceConstrain;
    reduceConstrain = synX826double;

    while (synX827boolean) {
      out.println(ibid + synX828String);

      try {
        waffen.acquire();
        learnInstructions();
        out.println(ibid + synX829String);
        learnInstructions();
        out.println(ibid + synX830String);
        learnInstructions();
        out.println(ibid + synX831String);
        learnInstructions();
        out.println(ibid + synX832String);
        awnings++;
        out.println(synX833String + awnings);
        waffen.release();
      } catch (java.lang.InterruptedException afterwards) {
        afterwards.toString();
      }
    }
  }

  public Villager(String user) {
    this.ibid = user;
  }

  public java.lang.String ibid = null;
  public static java.util.concurrent.Semaphore waffen = null;

  public synchronized void learnInstructions() {
    double surname;
    surname = synX834double;

    try {
      wait(synX835int);
    } catch (java.lang.InterruptedException adrian) {
      out.println(adrian.toString());
    }
  }

  public static int awnings = 0;

  static {
    waffen = new java.util.concurrent.Semaphore(1);
    awnings = 0;
  }

  public static final int yumPoint = -1976663646;
}
