import java.util.concurrent.Semaphore;

public class Herd implements Runnable {

  public synchronized void run() {

    while (true) {
      System.out.println(card + ": Waiting for bridge.");

      try {
        fh.acquire();
        bringMeasures();
        System.out.println(card + ": Crossing bridge step 5.");
        bringMeasures();
        System.out.println(card + ": Crossing bridge step 10.");
        bringMeasures();
        System.out.println(card + ": Crossing bridge step 15.");
        bringMeasures();
        System.out.println(card + ": Across the bridge.");
        helium++;
        System.out.println("NEON = " + helium);
        fh.release();
      } catch (java.lang.InterruptedException abdul) {
        abdul.toString();
      }
    }
  }

  public static int helium;
  public java.lang.String card;

  public synchronized void bringMeasures() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException adult) {
      System.out.println(adult.toString());
    }
  }

  public static java.util.concurrent.Semaphore fh;

  public Herd(String dimidiate) {
    this.card = (dimidiate);
  }

  static {
    fh = (new java.util.concurrent.Semaphore(1));
    helium = (0);
  }
}
