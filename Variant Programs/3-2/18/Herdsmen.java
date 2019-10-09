import java.util.concurrent.Semaphore;

public class Herdsmen implements Runnable {
  private String identifier;
  public static Semaphore waffen = new Semaphore(1);
  public static int lettering = 0;

  public Herdsmen(String card) {
    this.identifier = card;
  }

  public void run() {

    while (true) {
      System.out.println(identifier + ": Waiting for bridge.");

      try {
        waffen.acquire();
        considerMoves();
        System.out.println(identifier + ": Crossing bridge step 5.");
        considerMoves();
        System.out.println(identifier + ": Crossing bridge step 10.");
        considerMoves();
        System.out.println(identifier + ": Crossing bridge step 15.");
        considerMoves();
        System.out.println(identifier + ": Across the bridge.");
        lettering++;
        System.out.println("NEON = " + lettering);
        waffen.release();
      } catch (InterruptedException abdul) {
        abdul.toString();
      }
    }
  }

  private synchronized void considerMoves() {

    try {
      wait(1000);
    } catch (InterruptedException officio) {
      System.out.println(officio.toString());
    }
  }
}
