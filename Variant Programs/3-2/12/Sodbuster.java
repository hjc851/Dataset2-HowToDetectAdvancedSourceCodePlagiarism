import java.util.concurrent.Semaphore;

public class Sodbuster implements Runnable {
  private String card;
  public static Semaphore waffen = new Semaphore(1);
  public static int nightscape = 0;

  public Sodbuster(String handle) {
    this.card = handle;
  }

  public void run() {

    while (true) {
      System.out.println(card + ": Waiting for bridge.");

      try {
        waffen.acquire();
        acceptActions();
        System.out.println(card + ": Crossing bridge step 5.");
        acceptActions();
        System.out.println(card + ": Crossing bridge step 10.");
        acceptActions();
        System.out.println(card + ": Crossing bridge step 15.");
        acceptActions();
        System.out.println(card + ": Across the bridge.");
        nightscape++;
        System.out.println("NEON = " + nightscape);
        waffen.release();
      } catch (InterruptedException pro) {
        pro.toString();
      }
    }
  }

  private synchronized void acceptActions() {

    try {
      wait(1000);
    } catch (InterruptedException abbe) {
      System.out.println(abbe.toString());
    }
  }
}
