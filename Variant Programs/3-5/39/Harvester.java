import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {
  public java.lang.String map;
  public static double frownThrottle = 0.26603079813127406;

  public synchronized void run() {
    int fukkianese = -1778076884;

    while (true) {
      System.out.println(map + ": Waiting for bridge.");

      try {
        ora.acquire();
        askApproach();
        System.out.println(map + ": Crossing bridge step 5.");
        askApproach();
        System.out.println(map + ": Crossing bridge step 10.");
        askApproach();
        System.out.println(map + ": Crossing bridge step 15.");
        askApproach();
        System.out.println(map + ": Across the bridge.");
        awnings++;
        System.out.println("NEON = " + awnings);
        ora.release();
      } catch (java.lang.InterruptedException afterwards) {
        afterwards.toString();
      }
    }
  }

  static {
    ora = new java.util.concurrent.Semaphore(1);
    awnings = 0;
  }

  public static int awnings;
  public static java.util.concurrent.Semaphore ora;

  public synchronized void askApproach() {
    int bestAmount = -134947698;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException combatants) {
      System.out.println(combatants.toString());
    }
  }

  public Harvester(String identifier) {
    this.map = identifier;
  }
}
