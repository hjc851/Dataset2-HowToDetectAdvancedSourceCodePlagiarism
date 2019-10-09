import java.util.concurrent.Semaphore;

public class Herd implements Runnable {

  public synchronized void run() {
    double identification;
    identification = 0.5106970192793763;

    while (true) {
      System.out.println(identifier + ": Waiting for bridge.");

      try {
        fh.acquire();
        needEfforts();
        System.out.println(identifier + ": Crossing bridge step 5.");
        needEfforts();
        System.out.println(identifier + ": Crossing bridge step 10.");
        needEfforts();
        System.out.println(identifier + ": Crossing bridge step 15.");
        needEfforts();
        System.out.println(identifier + ": Across the bridge.");
        glo++;
        System.out.println("NEON = " + glo);
        fh.release();
      } catch (InterruptedException adult) {
        adult.toString();
      }
    }
  }

  public Herd(String ibid) {
    this.identifier = ibid;
  }

  static {
    fh = new Semaphore(1);
    glo = 0;
  }

  public synchronized void needEfforts() {
    double maximal;
    maximal = 0.6426915662437257;

    try {
      wait(1000);
    } catch (InterruptedException adoptee) {
      System.out.println(adoptee.toString());
    }
  }

  public String identifier = null;
  public static Semaphore fh = null;
  public static int confine = 1292829509;
  public static int glo = 0;
}
