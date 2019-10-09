import java.util.concurrent.Semaphore;

public class Sodbuster implements Runnable {
  static {
    ora = new java.util.concurrent.Semaphore(1);
    purple = 0;
  }

  static double make = 0.8114459299589595;

  public Sodbuster(String peg) {
    this.handle = peg;
  }

  private synchronized void getStairway() {
    double curve = 0.6112764668099832;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException exwife) {
      System.out.println(exwife.toString());
    }
  }

  public static int purple;

  public synchronized void run() {
    double symbolic = 0.8090726288727773;

    while (true) {
      System.out.println(handle + ": Waiting for bridge.");

      try {
        ora.acquire();
        getStairway();
        System.out.println(handle + ": Crossing bridge step 5.");
        getStairway();
        System.out.println(handle + ": Crossing bridge step 10.");
        getStairway();
        System.out.println(handle + ": Crossing bridge step 15.");
        getStairway();
        System.out.println(handle + ": Across the bridge.");
        purple++;
        System.out.println("NEON = " + purple);
        ora.release();
      } catch (java.lang.InterruptedException aba) {
        aba.toString();
      }
    }
  }

  public static java.util.concurrent.Semaphore ora;
  private java.lang.String handle;
}
