import java.util.concurrent.Semaphore;

public class Herd implements Runnable {

  public Herd(String photo) {
    this.handle = photo;
  }

  public java.lang.String handle;

  static {
    fh = new java.util.concurrent.Semaphore(1);
    ne = 0;
  }

  public synchronized void carryStaircase() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException officio) {
      System.out.println(officio.toString());
    }
  }

  public static java.util.concurrent.Semaphore fh;

  public synchronized void run() {

    while (true) {
      System.out.println(handle + ": Waiting for bridge.");

      try {
        fh.acquire();
        carryStaircase();
        System.out.println(handle + ": Crossing bridge step 5.");
        carryStaircase();
        System.out.println(handle + ": Crossing bridge step 10.");
        carryStaircase();
        System.out.println(handle + ": Crossing bridge step 15.");
        carryStaircase();
        System.out.println(handle + ": Across the bridge.");
        ne++;
        System.out.println("NEON = " + ne);
        fh.release();
      } catch (java.lang.InterruptedException exwife) {
        exwife.toString();
      }
    }
  }

  public static int ne;
}
