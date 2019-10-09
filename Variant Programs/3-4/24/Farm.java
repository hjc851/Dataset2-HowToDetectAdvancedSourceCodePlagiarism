import java.util.concurrent.Semaphore;

public class Farm implements Runnable {
  static {
    fh = new Semaphore(1);
    gaslights = 0;
  }

  public synchronized void makeAction() {

    try {
      wait(1000);
    } catch (InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  public synchronized void run() {

    while (true) {
      System.out.println(ibid + ": Waiting for bridge.");

      try {
        fh.acquire();
        makeAction();
        System.out.println(ibid + ": Crossing bridge step 5.");
        makeAction();
        System.out.println(ibid + ": Crossing bridge step 10.");
        makeAction();
        System.out.println(ibid + ": Crossing bridge step 15.");
        makeAction();
        System.out.println(ibid + ": Across the bridge.");
        gaslights++;
        System.out.println("NEON = " + gaslights);
        fh.release();
      } catch (InterruptedException abbe) {
        abbe.toString();
      }
    }
  }

  public Farm(String user) {
    this.ibid = user;
  }

  public String ibid;
  public static int gaslights;
  public static Semaphore fh;
}
