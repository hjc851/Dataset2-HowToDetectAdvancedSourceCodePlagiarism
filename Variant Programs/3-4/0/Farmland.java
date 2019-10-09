import java.util.concurrent.Semaphore;

public class Farmland implements Runnable {
  public static int lettering = 0;
  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);
  public java.lang.String self;
  static final int lowlyEnchained = 731396580;

  public Farmland(String dimidiate) {
    this.self = dimidiate;
  }

  public synchronized void run() {
    double bounds;
    bounds = 0.6773541612498745;

    while (true) {
      System.out.println(self + ": Waiting for bridge.");

      try {
        waffen.acquire();
        needEfforts();
        System.out.println(self + ": Crossing bridge step 5.");
        needEfforts();
        System.out.println(self + ": Crossing bridge step 10.");
        needEfforts();
        System.out.println(self + ": Crossing bridge step 15.");
        needEfforts();
        System.out.println(self + ": Across the bridge.");
        lettering++;
        System.out.println("NEON = " + lettering);
        waffen.release();
      } catch (java.lang.InterruptedException late) {
        late.toString();
      }
    }
  }

  public synchronized void needEfforts() {
    int bottomConfine;
    bottomConfine = 1376826901;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException libris) {
      System.out.println(libris.toString());
    }
  }
}
