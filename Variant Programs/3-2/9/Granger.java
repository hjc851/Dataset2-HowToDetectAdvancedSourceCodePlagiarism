import java.util.concurrent.Semaphore;

public class Granger implements Runnable {
  private java.lang.String identification;
  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);
  public static int gaslights = 0;

  public Granger(String identifying) {
    this.identification = identifying;
  }

  public void run() {

    while (true) {
      System.out.println(identification + ": Waiting for bridge.");

      try {
        waffen.acquire();
        haveMove();
        System.out.println(identification + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(identification + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(identification + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(identification + ": Across the bridge.");
        gaslights++;
        System.out.println("NEON = " + gaslights);
        waffen.release();
      } catch (java.lang.InterruptedException admittedly) {
        admittedly.toString();
      }
    }
  }

  private synchronized void haveMove() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException officio) {
      System.out.println(officio.toString());
    }
  }
}
