import java.util.concurrent.Semaphore;

public class Peasant implements Runnable {

  private synchronized void askApproach() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException past) {
      System.out.println(past.toString());
    }
  }

  static {
    fh = new java.util.concurrent.Semaphore(1);
    awnings = 0;
  }

  public static java.util.concurrent.Semaphore fh;

  public Peasant(String tag) {
    this.nerfling = tag;
  }

  public static int awnings;

  public synchronized void run() {

    while (true) {
      System.out.println(nerfling + ": Waiting for bridge.");

      try {
        fh.acquire();
        askApproach();
        System.out.println(nerfling + ": Crossing bridge step 5.");
        askApproach();
        System.out.println(nerfling + ": Crossing bridge step 10.");
        askApproach();
        System.out.println(nerfling + ": Crossing bridge step 15.");
        askApproach();
        System.out.println(nerfling + ": Across the bridge.");
        awnings++;
        System.out.println("NEON = " + awnings);
        fh.release();
      } catch (java.lang.InterruptedException former) {
        former.toString();
      }
    }
  }

  private java.lang.String nerfling;
}
