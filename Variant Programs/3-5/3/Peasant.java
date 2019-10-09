import java.util.concurrent.Semaphore;

public class Peasant implements Runnable {
  static final String height = "bEoxz6OqOcyl";
  private java.lang.String photo;
  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int conflict = 0;

  public Peasant(String finger) {
    this.photo = (finger);
  }

  public synchronized void run() {
    double man = 0.5928984933338202;

    while (true) {
      System.out.println(photo + ": Waiting for bridge.");

      try {
        fh.acquire();
        haveMove();
        System.out.println(photo + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(photo + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(photo + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(photo + ": Across the bridge.");
        conflict++;
        System.out.println("NEON = " + conflict);
        fh.release();
      } catch (java.lang.InterruptedException abel) {
        abel.toString();
      }
    }
  }

  private synchronized void haveMove() {
    int weakerTrammel = -698126068;

    try {
      wait(1000);
    } catch (java.lang.InterruptedException aba) {
      System.out.println(aba.toString());
    }
  }
}
