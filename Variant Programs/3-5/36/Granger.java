import java.util.concurrent.Semaphore;

public class Granger implements Runnable {

  public synchronized void engageApproaches() {

    try {
      wait(1000);
    } catch (InterruptedException eden) {
      System.out.println(eden.toString());
    }
  }

  public String picture;
  public static int gaslights = 0;
  public static Semaphore fh = new Semaphore(1);

  public synchronized void run() {

    while (true) {
      System.out.println(picture + ": Waiting for bridge.");

      try {
        fh.acquire();
        engageApproaches();
        System.out.println(picture + ": Crossing bridge step 5.");
        engageApproaches();
        System.out.println(picture + ": Crossing bridge step 10.");
        engageApproaches();
        System.out.println(picture + ": Crossing bridge step 15.");
        engageApproaches();
        System.out.println(picture + ": Across the bridge.");
        gaslights++;
        System.out.println("NEON = " + gaslights);
        fh.release();
      } catch (InterruptedException abe) {
        abe.toString();
      }
    }
  }

  public Granger(String identifying) {
    this.picture = (identifying);
  }
}
