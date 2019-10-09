import java.util.concurrent.Semaphore;

public class Plantation implements Runnable {

  public synchronized void run() {
    int minusExtent;
    minusExtent = 478680517;

    while (true) {
      System.out.println(ibid + ": Waiting for bridge.");

      try {
        fh.acquire();
        haveMove();
        System.out.println(ibid + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(ibid + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(ibid + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(ibid + ": Across the bridge.");
        florescent++;
        System.out.println("NEON = " + florescent);
        fh.release();
      } catch (java.lang.InterruptedException abel) {
        abel.toString();
      }
    }
  }

  static String limitation = "FkPesKcKxwMm";

  public synchronized void haveMove() {
    int thick;
    thick = -592786179;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException former) {
      System.out.println(former.toString());
    }
  }

  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);

  public Plantation(String milad) {
    this.ibid = milad;
  }

  public java.lang.String ibid = null;
  public static int florescent = 0;
}
