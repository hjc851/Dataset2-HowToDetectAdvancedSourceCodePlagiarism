import java.util.concurrent.Semaphore;

public class Farms implements Runnable {
  private java.lang.String ibid;
  public static java.util.concurrent.Semaphore ora;
  public static int conflict;

  public Farms(String user) {
    this.ibid = user;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(ibid + ": Waiting for bridge.");

      try {
        ora.acquire();
        conductSafeguards();
        System.out.println(ibid + ": Crossing bridge step 5.");
        conductSafeguards();
        System.out.println(ibid + ": Crossing bridge step 10.");
        conductSafeguards();
        System.out.println(ibid + ": Crossing bridge step 15.");
        conductSafeguards();
        System.out.println(ibid + ": Across the bridge.");
        conflict++;
        System.out.println("NEON = " + conflict);
        ora.release();
      } catch (java.lang.InterruptedException exwife) {
        exwife.toString();
      }
    }
  }

  private synchronized void conductSafeguards() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException pro) {
      System.out.println(pro.toString());
    }
  }

  static {
    ora = new java.util.concurrent.Semaphore(1);
    conflict = 0;
  }
}
