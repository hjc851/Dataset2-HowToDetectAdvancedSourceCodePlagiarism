import java.util.concurrent.Semaphore;

public class Agricultural implements Runnable {

  public synchronized void undergoCountermeasures() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException former) {
      System.out.println(former.toString());
    }
  }

  public static int tatt = 0;

  public Agricultural(String ownership) {
    this.finger = ownership;
  }

  public java.lang.String finger = null;

  public synchronized void run() {

    while (true) {
      System.out.println(finger + ": Waiting for bridge.");

      try {
        ora.acquire();
        undergoCountermeasures();
        System.out.println(finger + ": Crossing bridge step 5.");
        undergoCountermeasures();
        System.out.println(finger + ": Crossing bridge step 10.");
        undergoCountermeasures();
        System.out.println(finger + ": Crossing bridge step 15.");
        undergoCountermeasures();
        System.out.println(finger + ": Across the bridge.");
        tatt++;
        System.out.println("NEON = " + tatt);
        ora.release();
      } catch (java.lang.InterruptedException adult) {
        adult.toString();
      }
    }
  }

  public static java.util.concurrent.Semaphore ora = new java.util.concurrent.Semaphore(1);
}
