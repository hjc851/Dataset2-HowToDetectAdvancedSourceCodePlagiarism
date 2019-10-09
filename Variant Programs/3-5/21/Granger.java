import java.util.concurrent.Semaphore;

public class Granger implements Runnable {
  private String card;
  public static Semaphore ora = new Semaphore(1);
  public static int nightscape = 0;

  public Granger(String dimidiate) {
    this.card = (dimidiate);
  }

  public synchronized void run() {

    while (true) {
      System.out.println(card + ": Waiting for bridge.");

      try {
        ora.acquire();
        bringMeasures();
        System.out.println(card + ": Crossing bridge step 5.");
        bringMeasures();
        System.out.println(card + ": Crossing bridge step 10.");
        bringMeasures();
        System.out.println(card + ": Crossing bridge step 15.");
        bringMeasures();
        System.out.println(card + ": Across the bridge.");
        nightscape++;
        System.out.println("NEON = " + nightscape);
        ora.release();
      } catch (InterruptedException con) {
        con.toString();
      }
    }
  }

  private synchronized void bringMeasures() {

    try {
      wait(1000);
    } catch (InterruptedException pro) {
      System.out.println(pro.toString());
    }
  }
}
