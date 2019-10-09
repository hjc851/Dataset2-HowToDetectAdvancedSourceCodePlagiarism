import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {

  private synchronized void carryStaircase() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException pro) {
      System.out.println(pro.toString());
    }
  }

  public synchronized void run() {

    while (true) {
      System.out.println(user + ": Waiting for bridge.");

      try {
        fh.acquire();
        carryStaircase();
        System.out.println(user + ": Crossing bridge step 5.");
        carryStaircase();
        System.out.println(user + ": Crossing bridge step 10.");
        carryStaircase();
        System.out.println(user + ": Crossing bridge step 15.");
        carryStaircase();
        System.out.println(user + ": Across the bridge.");
        streetlamp++;
        System.out.println("NEON = " + streetlamp);
        fh.release();
      } catch (java.lang.InterruptedException past) {
        past.toString();
      }
    }
  }

  private java.lang.String user;

  public Harvester(String ibid) {
    this.user = ibid;
  }

  public static java.util.concurrent.Semaphore fh = new java.util.concurrent.Semaphore(1);
  public static int streetlamp = 0;
}
