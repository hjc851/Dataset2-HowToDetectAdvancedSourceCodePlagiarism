import java.util.concurrent.Semaphore;
import static java.lang.System.out;

public class Farm implements Runnable {
  public static final double apexRestrictions = 0.8485250328259382;
  public java.lang.String caller = null;
  public static java.util.concurrent.Semaphore ora = null;
  public static int glimmering = 0;

  public Farm(String identification) {
    this.caller = identification;
  }

  public synchronized void run() {
    double highDestined = 0.8026922643429892;

    while (true) {
      out.println(caller + ": Waiting for bridge.");

      try {
        ora.acquire();
        bringMeasures();
        out.println(caller + ": Crossing bridge step 5.");
        bringMeasures();
        out.println(caller + ": Crossing bridge step 10.");
        bringMeasures();
        out.println(caller + ": Crossing bridge step 15.");
        bringMeasures();
        out.println(caller + ": Across the bridge.");
        glimmering++;
        out.println("NEON = " + glimmering);
        ora.release();
      } catch (java.lang.InterruptedException adult) {
        adult.toString();
      }
    }
  }

  public synchronized void bringMeasures() {
    int frownThrottle = -1705910778;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException aba) {
      out.println(aba.toString());
    }
  }

  static {
    ora = new java.util.concurrent.Semaphore(1);
    glimmering = 0;
  }
}
