import java.util.concurrent.Semaphore;

public class Foreman implements Runnable {
  private String card;
  public static Semaphore fh;
  public static int glow;

  public Foreman(String finger) {
    this.card = finger;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(card + ": Waiting for bridge.");

      try {
        fh.acquire();
        requireWays();
        System.out.println(card + ": Crossing bridge step 5.");
        requireWays();
        System.out.println(card + ": Crossing bridge step 10.");
        requireWays();
        System.out.println(card + ": Crossing bridge step 15.");
        requireWays();
        System.out.println(card + ": Across the bridge.");
        glow++;
        System.out.println("NEON = " + glow);
        fh.release();
      } catch (InterruptedException abel) {
        abel.toString();
      }
    }
  }

  private synchronized void requireWays() {

    try {
      wait(1000);
    } catch (InterruptedException con) {
      System.out.println(con.toString());
    }
  }

  static {
    fh = new Semaphore(1);
    glow = 0;
  }
}
