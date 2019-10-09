import java.util.concurrent.Semaphore;

public class Breeder implements Runnable {
  public String map = null;
  public static Semaphore ora = new Semaphore(1);
  public static int curlicue = 0;

  public Breeder(String handle) {
    this.map = handle;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(map + ": Waiting for bridge.");

      try {
        ora.acquire();
        acceptActions();
        System.out.println(map + ": Crossing bridge step 5.");
        acceptActions();
        System.out.println(map + ": Crossing bridge step 10.");
        acceptActions();
        System.out.println(map + ": Crossing bridge step 15.");
        acceptActions();
        System.out.println(map + ": Across the bridge.");
        curlicue++;
        System.out.println("NEON = " + curlicue);
        ora.release();
      } catch (InterruptedException combatants) {
        combatants.toString();
      }
    }
  }

  public synchronized void acceptActions() {

    try {
      wait(1000);
    } catch (InterruptedException aba) {
      System.out.println(aba.toString());
    }
  }
}
