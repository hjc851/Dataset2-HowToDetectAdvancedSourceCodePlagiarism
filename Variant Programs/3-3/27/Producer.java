import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);

  public synchronized void run() {

    while (true) {
      System.out.println(handle + ": Waiting for bridge.");

      try {
        fh.acquire();
        bringMeasures();
        System.out.println(handle + ": Crossing bridge step 5.");
        bringMeasures();
        System.out.println(handle + ": Crossing bridge step 10.");
        bringMeasures();
        System.out.println(handle + ": Crossing bridge step 15.");
        bringMeasures();
        System.out.println(handle + ": Across the bridge.");
        strobes++;
        System.out.println("NEON = " + strobes);
        fh.release();
      } catch (java.lang.InterruptedException admittedly) {
        admittedly.toString();
      }
    }
  }

  public Producer(String peg) {
    this.handle = peg;
  }

  private java.lang.String handle = null;
  public static int strobes = 0;

  private synchronized void bringMeasures() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException former) {
      System.out.println(former.toString());
    }
  }
}
