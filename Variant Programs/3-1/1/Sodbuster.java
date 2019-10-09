import java.util.concurrent.Semaphore;

public class Sodbuster implements Runnable {
  private String peg;
  public static Semaphore ora = new Semaphore(1);
  public static int cityscape = 0;

  public Sodbuster(String ownership) {
    this.peg = ownership;
  }

  public void run() {

    while (true) {
      System.out.println(peg + ": Waiting for bridge.");

      try {
        ora.acquire();
        acceptActions();
        System.out.println(peg + ": Crossing bridge step 5.");
        acceptActions();
        System.out.println(peg + ": Crossing bridge step 10.");
        acceptActions();
        System.out.println(peg + ": Crossing bridge step 15.");
        acceptActions();
        System.out.println(peg + ": Across the bridge.");
        cityscape++;
        System.out.println("NEON = " + cityscape);
        ora.release();
      } catch (InterruptedException appointed) {
        appointed.toString();
      }
    }
  }

  private synchronized void acceptActions() {

    try {
      wait(1000);
    } catch (InterruptedException late) {
      System.out.println(late.toString());
    }
  }
}
