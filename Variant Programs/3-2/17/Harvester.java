import java.util.concurrent.Semaphore;

public class Harvester implements Runnable {
  private java.lang.String tag;
  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);
  public static int conflict = 0;

  public Harvester(String identification) {
    this.tag = identification;
  }

  public void run() {

    while (true) {
      System.out.println(tag + ": Waiting for bridge.");

      try {
        waffen.acquire();
        involveInitiatives();
        System.out.println(tag + ": Crossing bridge step 5.");
        involveInitiatives();
        System.out.println(tag + ": Crossing bridge step 10.");
        involveInitiatives();
        System.out.println(tag + ": Crossing bridge step 15.");
        involveInitiatives();
        System.out.println(tag + ": Across the bridge.");
        conflict++;
        System.out.println("NEON = " + conflict);
        waffen.release();
      } catch (java.lang.InterruptedException con) {
        con.toString();
      }
    }
  }

  private synchronized void involveInitiatives() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException officio) {
      System.out.println(officio.toString());
    }
  }
}
