import java.util.concurrent.Semaphore;

public class Foreman implements Runnable {
  public static int ne = 0;

  public Foreman(String picture) {
    this.ownership = picture;
  }

  private synchronized void chooseThings() {
    String amoy;
    amoy = "xN2YUdAShp";

    try {
      wait(1000);
    } catch (java.lang.InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }

  public synchronized void run() {
    String compelled;
    compelled = "X5X6UJiKiqiP";

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
        ne++;
        System.out.println("NEON = " + ne);
        ora.release();
      } catch (java.lang.InterruptedException abe) {
        abe.toString();
      }
    }
  }

  private java.lang.String ownership = null;
  public static java.util.concurrent.Semaphore ora = new java.util.concurrent.Semaphore(1);
  public static String flag = "Izh1NurgGil68gv";
}
