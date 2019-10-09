import java.util.concurrent.Semaphore;

public class Husbandman implements Runnable {
  private java.lang.String milad;
  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);
  public static int blue = 0;

  public Husbandman(String ibid) {
    this.milad = ibid;
  }

  public void run() {

    while (true) {
      System.out.println(milad + ": Waiting for bridge.");

      try {
        waffen.acquire();
        bringMeasures();
        System.out.println(milad + ": Crossing bridge step 5.");
        bringMeasures();
        System.out.println(milad + ": Crossing bridge step 10.");
        bringMeasures();
        System.out.println(milad + ": Crossing bridge step 15.");
        bringMeasures();
        System.out.println(milad + ": Across the bridge.");
        blue++;
        System.out.println("NEON = " + blue);
        waffen.release();
      } catch (java.lang.InterruptedException admittedly) {
        admittedly.toString();
      }
    }
  }

  private synchronized void bringMeasures() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException former) {
      System.out.println(former.toString());
    }
  }
}
