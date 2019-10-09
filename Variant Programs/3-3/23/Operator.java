import java.util.concurrent.Semaphore;

public class Operator implements Runnable {
  public String card = null;
  public static Semaphore ora = new Semaphore(1);
  public static int glow = 0;

  public Operator(String identification) {
    this.card = identification;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(card + ": Waiting for bridge.");

      try {
        ora.acquire();
        acceptActions();
        System.out.println(card + ": Crossing bridge step 5.");
        acceptActions();
        System.out.println(card + ": Crossing bridge step 10.");
        acceptActions();
        System.out.println(card + ": Crossing bridge step 15.");
        acceptActions();
        System.out.println(card + ": Across the bridge.");
        glow++;
        System.out.println("NEON = " + glow);
        ora.release();
      } catch (InterruptedException tipp) {
        tipp.toString();
      }
    }
  }

  public synchronized void acceptActions() {

    try {
      wait(1000);
    } catch (InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }
}
