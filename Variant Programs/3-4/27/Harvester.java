import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {
  public static int nightscape = 0;
  public static Semaphore waffen = null;
  public String peg = null;

  public Harvester(String quod) {
    this.peg = quod;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(peg + ": Waiting for bridge.");

      try {
        waffen.acquire();
        carryStaircase();
        System.out.println(peg + ": Crossing bridge step 5.");
        carryStaircase();
        System.out.println(peg + ": Crossing bridge step 10.");
        carryStaircase();
        System.out.println(peg + ": Crossing bridge step 15.");
        carryStaircase();
        System.out.println(peg + ": Across the bridge.");
        nightscape++;
        System.out.println("NEON = " + nightscape);
        waffen.release();
      } catch (InterruptedException officio) {
        officio.toString();
      }
    }
  }

  public synchronized void carryStaircase() {

    try {
      wait(1000);
    } catch (InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }

  static {
    waffen = new Semaphore(1);
    nightscape = 0;
  }
}
