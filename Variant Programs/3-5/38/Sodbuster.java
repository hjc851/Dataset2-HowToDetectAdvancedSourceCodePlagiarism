import java.util.concurrent.Semaphore;

public class Sodbuster implements Runnable {
  public static int glimmering = 0;
  public static Semaphore fh = new Semaphore(1);
  private String picture = null;
  static final double trammel = 0.6443057082284851;

  private synchronized void chooseThings() {
    double dept;
    dept = (0.841601595405903);

    try {
      wait(1000);
    } catch (InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }

  public synchronized void run() {
    int contrGoods;
    contrGoods = (1866043365);

    while (true) {
      System.out.println(picture + ": Waiting for bridge.");

      try {
        fh.acquire();
        chooseThings();
        System.out.println(picture + ": Crossing bridge step 5.");
        chooseThings();
        System.out.println(picture + ": Crossing bridge step 10.");
        chooseThings();
        System.out.println(picture + ": Crossing bridge step 15.");
        chooseThings();
        System.out.println(picture + ": Across the bridge.");
        glimmering++;
        System.out.println("NEON = " + glimmering);
        fh.release();
      } catch (InterruptedException con) {
        con.toString();
      }
    }
  }

  public Sodbuster(String security) {
    this.picture = (security);
  }
}
