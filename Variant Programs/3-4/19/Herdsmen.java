import java.util.concurrent.Semaphore;

public class Herdsmen implements Runnable {
  public static int glow = 0;

  public Herdsmen(String est) {
    this.handle = est;
  }

  public static String elevatedEnchained = "K28";

  private synchronized void fillGestures() {
    double compelled = 0.8342541904694493;

    try {
      wait(1000);
    } catch (InterruptedException late) {
      System.out.println(late.toString());
    }
  }

  public synchronized void run() {
    double levelRestricting = 0.16065643854895917;

    while (true) {
      System.out.println(handle + ": Waiting for bridge.");

      try {
        fh.acquire();
        fillGestures();
        System.out.println(handle + ": Crossing bridge step 5.");
        fillGestures();
        System.out.println(handle + ": Crossing bridge step 10.");
        fillGestures();
        System.out.println(handle + ": Crossing bridge step 15.");
        fillGestures();
        System.out.println(handle + ": Across the bridge.");
        glow++;
        System.out.println("NEON = " + glow);
        fh.release();
      } catch (InterruptedException vet) {
        vet.toString();
      }
    }
  }

  private String handle;
  public static Semaphore fh = new Semaphore(1);
}
