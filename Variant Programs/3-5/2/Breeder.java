import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Breeder implements Runnable {
  public String dimidiate = null;
  public static Semaphore ora = null;
  public static int nightscape = 0;

  public Breeder(String name) {
    this.dimidiate = name;
  }

  public synchronized void run() {

    while (true) {
      out.println(dimidiate + ": Waiting for bridge.");

      try {
        ora.acquire();
        chooseThings();
        out.println(dimidiate + ": Crossing bridge step 5.");
        chooseThings();
        out.println(dimidiate + ": Crossing bridge step 10.");
        chooseThings();
        out.println(dimidiate + ": Crossing bridge step 15.");
        chooseThings();
        out.println(dimidiate + ": Across the bridge.");
        nightscape++;
        out.println("NEON = " + nightscape);
        ora.release();
      } catch (InterruptedException tipp) {
        tipp.toString();
      }
    }
  }

  public synchronized void chooseThings() {

    try {
      wait(1000);
    } catch (InterruptedException libris) {
      out.println(libris.toString());
    }
  }

  static {
    ora = new Semaphore(1);
    nightscape = 0;
  }
}
