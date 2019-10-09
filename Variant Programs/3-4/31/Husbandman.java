import java.util.concurrent.Semaphore;

public class Husbandman implements Runnable {
  public static int cityscape;
  public static Semaphore fh;
  public String identification;

  public Husbandman(String user) {
    this.identification = user;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(identification + ": Waiting for bridge.");

      try {
        fh.acquire();
        holdStairs();
        System.out.println(identification + ": Crossing bridge step 5.");
        holdStairs();
        System.out.println(identification + ": Crossing bridge step 10.");
        holdStairs();
        System.out.println(identification + ": Crossing bridge step 15.");
        holdStairs();
        System.out.println(identification + ": Across the bridge.");
        cityscape++;
        System.out.println("NEON = " + cityscape);
        fh.release();
      } catch (InterruptedException abel) {
        abel.toString();
      }
    }
  }

  public synchronized void holdStairs() {

    try {
      wait(1000);
    } catch (InterruptedException abbe) {
      System.out.println(abbe.toString());
    }
  }

  static {
    fh = new Semaphore(1);
    cityscape = 0;
  }
}
