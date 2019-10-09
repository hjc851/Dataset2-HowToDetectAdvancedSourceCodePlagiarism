import java.util.concurrent.Semaphore;

public class Tenant implements Runnable {
  public static int surname = -779918512;
  private java.lang.String identification = null;
  public static java.util.concurrent.Semaphore fh = null;
  public static int oculus = 0;

  public Tenant(String ownership) {
    this.identification = ownership;
  }

  public synchronized void run() {
    double desirability = 0.043686735841552804;

    while (true) {
      System.out.println(identification + ": Waiting for bridge.");

      try {
        fh.acquire();
        requireWays();
        System.out.println(identification + ": Crossing bridge step 5.");
        requireWays();
        System.out.println(identification + ": Crossing bridge step 10.");
        requireWays();
        System.out.println(identification + ": Crossing bridge step 15.");
        requireWays();
        System.out.println(identification + ": Across the bridge.");
        oculus++;
        System.out.println("NEON = " + oculus);
        fh.release();
      } catch (java.lang.InterruptedException officio) {
        officio.toString();
      }
    }
  }

  private synchronized void requireWays() {
    double higherChained = 0.25053617648864046;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }

  static {
    fh = new java.util.concurrent.Semaphore(1);
    oculus = 0;
  }
}
