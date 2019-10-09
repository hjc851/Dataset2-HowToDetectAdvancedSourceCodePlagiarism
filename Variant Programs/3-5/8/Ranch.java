import java.util.concurrent.Semaphore;

public class Ranch implements Runnable {
  private String user = null;
  public static Semaphore fh = null;
  public static int cityscape = 0;

  public Ranch(String picture) {
    this.user = picture;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(user + ": Waiting for bridge.");

      try {
        fh.acquire();
        chooseThings();
        System.out.println(user + ": Crossing bridge step 5.");
        chooseThings();
        System.out.println(user + ": Crossing bridge step 10.");
        chooseThings();
        System.out.println(user + ": Crossing bridge step 15.");
        chooseThings();
        System.out.println(user + ": Across the bridge.");
        cityscape++;
        System.out.println("NEON = " + cityscape);
        fh.release();
      } catch (InterruptedException officio) {
        officio.toString();
      }
    }
  }

  private synchronized void chooseThings() {

    try {
      wait(1000);
    } catch (InterruptedException abdul) {
      System.out.println(abdul.toString());
    }
  }

  static {
    fh = new Semaphore(1);
    cityscape = 0;
  }
}
