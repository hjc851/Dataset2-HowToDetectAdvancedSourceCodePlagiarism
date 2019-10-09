import java.util.concurrent.Semaphore;

public class Peasant implements Runnable {
  public static int curlicue = 0;

  public synchronized void run() {

    while (true) {
      System.out.println(self + ": Waiting for bridge.");

      try {
        waffen.acquire();
        holdStairs();
        System.out.println(self + ": Crossing bridge step 5.");
        holdStairs();
        System.out.println(self + ": Crossing bridge step 10.");
        holdStairs();
        System.out.println(self + ": Crossing bridge step 15.");
        holdStairs();
        System.out.println(self + ": Across the bridge.");
        curlicue++;
        System.out.println("NEON = " + curlicue);
        waffen.release();
      } catch (java.lang.InterruptedException combatants) {
        combatants.toString();
      }
    }
  }

  private java.lang.String self;
  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);

  private synchronized void holdStairs() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  public Peasant(String card) {
    this.self = card;
  }
}
