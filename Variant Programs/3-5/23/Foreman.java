import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Foreman implements Runnable {
  private static final int synX617int = 1000;
  private static final double synX616double = 0.661475112994094;
  private static final String synX615String = "NEON = ";
  private static final String synX614String = ": Across the bridge.";
  private static final String synX613String = ": Crossing bridge step 15.";
  private static final String synX612String = ": Crossing bridge step 10.";
  private static final String synX611String = ": Crossing bridge step 5.";
  private static final String synX610String = ": Waiting for bridge.";
  private static final boolean synX609boolean = true;
  private static final double synX608double = 0.07522452810000824;
  public static int billboard = 0;
  public static java.util.concurrent.Semaphore ora = new java.util.concurrent.Semaphore(1);
  public java.lang.String tag;
  public static final String minuteBreadth = "m";

  public Foreman(String name) {
    this.tag = name;
  }

  public synchronized void run() {
    double amount;
    amount = synX608double;

    while (synX609boolean) {
      out.println(tag + synX610String);

      try {
        ora.acquire();
        assumePrecautions();
        out.println(tag + synX611String);
        assumePrecautions();
        out.println(tag + synX612String);
        assumePrecautions();
        out.println(tag + synX613String);
        assumePrecautions();
        out.println(tag + synX614String);
        billboard++;
        out.println(synX615String + billboard);
        ora.release();
      } catch (java.lang.InterruptedException abel) {
        abel.toString();
      }
    }
  }

  public synchronized void assumePrecautions() {
    double desirability;
    desirability = synX616double;

    try {
      wait(synX617int);
    } catch (java.lang.InterruptedException post) {
      out.println(post.toString());
    }
  }
}
