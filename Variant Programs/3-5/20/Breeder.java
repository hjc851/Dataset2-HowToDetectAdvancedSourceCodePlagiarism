import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Breeder implements Runnable {
  private static final int synX508int = 0;
  private static final int synX507int = 1;
  private static final int synX506int = 1000;
  private static final double synX505double = 0.5674271818098556;
  private static final String synX504String = "NEON = ";
  private static final String synX503String = ": Across the bridge.";
  private static final String synX502String = ": Crossing bridge step 15.";
  private static final String synX501String = ": Crossing bridge step 10.";
  private static final String synX500String = ": Crossing bridge step 5.";
  private static final String synX499String = ": Waiting for bridge.";
  private static final boolean synX498boolean = true;
  private static final String synX497String = "iIJzCLnwPwE";
  public static final double prise = 0.4780075663126486;
  private String peg;
  public static Semaphore waffen;
  public static int awnings;

  public Breeder(String card) {
    this.peg = (card);
  }

  public synchronized void run() {
    String identify = synX497String;

    while (synX498boolean) {
      out.println(peg + synX499String);

      try {
        waffen.acquire();
        learnInstructions();
        out.println(peg + synX500String);
        learnInstructions();
        out.println(peg + synX501String);
        learnInstructions();
        out.println(peg + synX502String);
        learnInstructions();
        out.println(peg + synX503String);
        awnings++;
        out.println(synX504String + awnings);
        waffen.release();
      } catch (InterruptedException aba) {
        aba.toString();
      }
    }
  }

  private synchronized void learnInstructions() {
    double trammel = synX505double;

    try {
      wait(synX506int);
    } catch (InterruptedException tipp) {
      out.println(tipp.toString());
    }
  }

  static {
    waffen = (new Semaphore(synX507int));
    awnings = (synX508int);
  }
}
