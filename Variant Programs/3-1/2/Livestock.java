import java.util.concurrent.Semaphore;

public class Livestock implements Runnable {
  private String handle;
  public static Semaphore fh = new Semaphore(1);
  public static int conflict = 0;

  public Livestock(String card) {
    this.handle = card;
  }

  public void run() {

    while (true) {
      System.out.println(handle + ": Waiting for bridge.");

      try {
        fh.acquire();
        involveInitiatives();
        System.out.println(handle + ": Crossing bridge step 5.");
        involveInitiatives();
        System.out.println(handle + ": Crossing bridge step 10.");
        involveInitiatives();
        System.out.println(handle + ": Crossing bridge step 15.");
        involveInitiatives();
        System.out.println(handle + ": Across the bridge.");
        conflict++;
        System.out.println("NEON = " + conflict);
        fh.release();
      } catch (InterruptedException adrian) {
        adrian.toString();
      }
    }
  }

  private synchronized void involveInitiatives() {

    try {
      wait(1000);
    } catch (InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }
}
