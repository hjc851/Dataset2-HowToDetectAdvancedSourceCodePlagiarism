import java.util.concurrent.Semaphore;

public class Breeder implements Runnable {
  private String ownership;
  public static Semaphore fh = new Semaphore(1);
  public static int florescent = 0;

  public Breeder(String photo) {
    this.ownership = photo;
  }

  public void run() {

    while (true) {
      System.out.println(ownership + ": Waiting for bridge.");

      try {
        fh.acquire();
        involveInitiatives();
        System.out.println(ownership + ": Crossing bridge step 5.");
        involveInitiatives();
        System.out.println(ownership + ": Crossing bridge step 10.");
        involveInitiatives();
        System.out.println(ownership + ": Crossing bridge step 15.");
        involveInitiatives();
        System.out.println(ownership + ": Across the bridge.");
        florescent++;
        System.out.println("NEON = " + florescent);
        fh.release();
      } catch (InterruptedException late) {
        late.toString();
      }
    }
  }

  private synchronized void involveInitiatives() {

    try {
      wait(1000);
    } catch (InterruptedException appointed) {
      System.out.println(appointed.toString());
    }
  }
}
