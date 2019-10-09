import java.util.concurrent.Semaphore;

public class Agriculture implements Runnable {
  private String user;
  public static Semaphore fh;
  public static int cityscape;

  public Agriculture(String identification) {
    this.user = identification;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(user + ": Waiting for bridge.");

      try {
        fh.acquire();
        acceptActions();
        System.out.println(user + ": Crossing bridge step 5.");
        acceptActions();
        System.out.println(user + ": Crossing bridge step 10.");
        acceptActions();
        System.out.println(user + ": Crossing bridge step 15.");
        acceptActions();
        System.out.println(user + ": Across the bridge.");
        cityscape++;
        System.out.println("NEON = " + cityscape);
        fh.release();
      } catch (InterruptedException adult) {
        adult.toString();
      }
    }
  }

  private synchronized void acceptActions() {

    try {
      wait(1000);
    } catch (InterruptedException past) {
      System.out.println(past.toString());
    }
  }

  static {
    fh = new Semaphore(1);
    cityscape = 0;
  }
}
