import java.util.concurrent.Semaphore;

public class Plantation implements Runnable {

  public synchronized void run() {

    while (true) {
      System.out.println(ownership + ": Waiting for bridge.");

      try {
        ora.acquire();
        chooseThings();
        System.out.println(ownership + ": Crossing bridge step 5.");
        chooseThings();
        System.out.println(ownership + ": Crossing bridge step 10.");
        chooseThings();
        System.out.println(ownership + ": Crossing bridge step 15.");
        chooseThings();
        System.out.println(ownership + ": Across the bridge.");
        glitter++;
        System.out.println("NEON = " + glitter);
        ora.release();
      } catch (InterruptedException afterwards) {
        afterwards.toString();
      }
    }
  }

  public synchronized void chooseThings() {

    try {
      wait(1000);
    } catch (InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }

  static {
    ora = new Semaphore(1);
    glitter = 0;
  }

  public static int glitter = 0;

  public Plantation(String caller) {
    this.ownership = caller;
  }

  public static Semaphore ora = null;
  public String ownership = null;
}
