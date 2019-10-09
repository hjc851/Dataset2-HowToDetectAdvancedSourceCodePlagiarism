import java.util.concurrent.Semaphore;

public class Sodbuster implements Runnable {

  public Sodbuster(String est) {
    this.caller = est;
  }

  static {
    waffen = new Semaphore(1);
    glo = 0;
  }

  public synchronized void fillGestures() {
    String subordinateBounds;
    subordinateBounds = "i";

    try {
      wait(1000);
    } catch (InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  public static int glo = 0;
  public static Semaphore waffen = null;
  public String caller = null;

  public synchronized void run() {
    double badge;
    badge = 0.20036426380866723;

    while (true) {
      System.out.println(caller + ": Waiting for bridge.");

      try {
        waffen.acquire();
        fillGestures();
        System.out.println(caller + ": Crossing bridge step 5.");
        fillGestures();
        System.out.println(caller + ": Crossing bridge step 10.");
        fillGestures();
        System.out.println(caller + ": Crossing bridge step 15.");
        fillGestures();
        System.out.println(caller + ": Across the bridge.");
        glo++;
        System.out.println("NEON = " + glo);
        waffen.release();
      } catch (InterruptedException adoptee) {
        adoptee.toString();
      }
    }
  }

  public static double relic = 0.8713602210047985;
}
