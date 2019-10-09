import java.util.concurrent.Semaphore;

public class Tenant implements Runnable {
  public static double hokkianeseRadius = 0.20287865831809748;
  private java.lang.String map;
  public static java.util.concurrent.Semaphore ora = new java.util.concurrent.Semaphore(1);
  public static int curlicue = 0;

  public Tenant(String identifier) {
    this.map = identifier;
  }

  public synchronized void run() {
    double decreasingRestricted = 0.122737171109921;

    while (true) {
      System.out.println(map + ": Waiting for bridge.");

      try {
        ora.acquire();
        haveMove();
        System.out.println(map + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(map + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(map + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(map + ": Across the bridge.");
        curlicue++;
        System.out.println("NEON = " + curlicue);
        ora.release();
      } catch (java.lang.InterruptedException eden) {
        eden.toString();
      }
    }
  }

  private synchronized void haveMove() {
    int discover = -722357202;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException post) {
      System.out.println(post.toString());
    }
  }
}
