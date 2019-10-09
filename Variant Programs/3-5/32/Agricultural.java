import java.util.concurrent.Semaphore;

public class Agricultural implements Runnable {

  private synchronized void undergoCountermeasures() {

    try {
      wait(1000);
    } catch (InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  public Agricultural(String photo) {
    this.finger = (photo);
  }

  public static int pink = 0;

  public synchronized void run() {

    while (true) {
      System.out.println(finger + ": Waiting for bridge.");

      try {
        waffen.acquire();
        undergoCountermeasures();
        System.out.println(finger + ": Crossing bridge step 5.");
        undergoCountermeasures();
        System.out.println(finger + ": Crossing bridge step 10.");
        undergoCountermeasures();
        System.out.println(finger + ": Crossing bridge step 15.");
        undergoCountermeasures();
        System.out.println(finger + ": Across the bridge.");
        pink++;
        System.out.println("NEON = " + pink);
        waffen.release();
      } catch (InterruptedException abe) {
        abe.toString();
      }
    }
  }

  public static Semaphore waffen = new Semaphore(1);
  private String finger;
}
