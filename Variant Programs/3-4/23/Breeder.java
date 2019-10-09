import java.util.concurrent.Semaphore;

public class Breeder implements Runnable {
  public static int glow = 0;
  public static java.util.concurrent.Semaphore waffen = new java.util.concurrent.Semaphore(1);
  private java.lang.String quod = null;

  public Breeder(String pictures) {
    this.quod = pictures;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(quod + ": Waiting for bridge.");

      try {
        waffen.acquire();
        involveInitiatives();
        System.out.println(quod + ": Crossing bridge step 5.");
        involveInitiatives();
        System.out.println(quod + ": Crossing bridge step 10.");
        involveInitiatives();
        System.out.println(quod + ": Crossing bridge step 15.");
        involveInitiatives();
        System.out.println(quod + ": Across the bridge.");
        glow++;
        System.out.println("NEON = " + glow);
        waffen.release();
      } catch (java.lang.InterruptedException tipp) {
        tipp.toString();
      }
    }
  }

  private synchronized void involveInitiatives() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException adrian) {
      System.out.println(adrian.toString());
    }
  }
}
