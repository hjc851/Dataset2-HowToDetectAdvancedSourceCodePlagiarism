import java.util.concurrent.Semaphore;

public class Husbandman implements Runnable {
  public static int tatt;
  public static java.util.concurrent.Semaphore waffen;
  public java.lang.String identifier;

  public Husbandman(String security) {
    this.identifier = (security);
  }

  public synchronized void run() {

    while (true) {
      System.out.println(identifier + ": Waiting for bridge.");

      try {
        waffen.acquire();
        adoptProgress();
        System.out.println(identifier + ": Crossing bridge step 5.");
        adoptProgress();
        System.out.println(identifier + ": Crossing bridge step 10.");
        adoptProgress();
        System.out.println(identifier + ": Crossing bridge step 15.");
        adoptProgress();
        System.out.println(identifier + ": Across the bridge.");
        tatt++;
        System.out.println("NEON = " + tatt);
        waffen.release();
      } catch (java.lang.InterruptedException admittedly) {
        admittedly.toString();
      }
    }
  }

  public synchronized void adoptProgress() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException abel) {
      System.out.println(abel.toString());
    }
  }

  static {
    waffen = (new java.util.concurrent.Semaphore(1));
    tatt = (0);
  }
}
