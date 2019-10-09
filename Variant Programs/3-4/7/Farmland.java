import java.util.concurrent.Semaphore;

public class Farmland implements Runnable {

  public synchronized void run() {

    while (true) {
      System.out.println(pictures + ": Waiting for bridge.");

      try {
        fh.acquire();
        bringMeasures();
        System.out.println(pictures + ": Crossing bridge step 5.");
        bringMeasures();
        System.out.println(pictures + ": Crossing bridge step 10.");
        bringMeasures();
        System.out.println(pictures + ": Crossing bridge step 15.");
        bringMeasures();
        System.out.println(pictures + ": Across the bridge.");
        glo++;
        System.out.println("NEON = " + glo);
        fh.release();
      } catch (InterruptedException admittedly) {
        admittedly.toString();
      }
    }
  }

  private String pictures;
  public static Semaphore fh = new Semaphore(1);

  public Farmland(String map) {
    this.pictures = map;
  }

  public static int glo = 0;

  private synchronized void bringMeasures() {

    try {
      wait(1000);
    } catch (InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }
}
