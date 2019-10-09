import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Plantation implements Runnable {
  private static final int synX133int = 1000;
  private static final double synX132double = 0.8751181382674112;
  private static final String synX131String = "NEON = ";
  private static final String synX130String = ": Across the bridge.";
  private static final String synX129String = ": Crossing bridge step 15.";
  private static final String synX128String = ": Crossing bridge step 10.";
  private static final String synX127String = ": Crossing bridge step 5.";
  private static final String synX126String = ": Waiting for bridge.";
  private static final boolean synX125boolean = true;
  private static final double synX124double = 0.820044517130983;
  public static int ne = 0;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  private java.lang.String dimidiate = null;
  static double matt = 0.39873886188724694;

  public Plantation(String card) {
    this.dimidiate = card;
  }

  public synchronized void run() {
    double destined;
    destined = synX124double;

    while (synX125boolean) {
      out.println(dimidiate + synX126String);

      try {
        fh.acquire();
        fillGestures();
        out.println(dimidiate + synX127String);
        fillGestures();
        out.println(dimidiate + synX128String);
        fillGestures();
        out.println(dimidiate + synX129String);
        fillGestures();
        out.println(dimidiate + synX130String);
        ne++;
        out.println(synX131String + ne);
        fh.release();
      } catch (java.lang.InterruptedException combatants) {
        combatants.toString();
      }
    }
  }

  private synchronized void fillGestures() {
    double weakerCurb;
    weakerCurb = synX132double;

    try {
      wait(synX133int);
    } catch (java.lang.InterruptedException past) {
      out.println(past.toString());
    }
  }
}
